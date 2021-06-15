package by.testingSystem.controller.admin;

import by.testingSystem.model.Test;
import by.testingSystem.model.Topic;
import by.testingSystem.service.TestService;
import by.testingSystem.service.TopicService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.aop.interceptor.AbstractTraceInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.json.JsonString;
import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping(path = "/admin/test")
public class TestController {

    @Autowired
    TestService testService;
    @Autowired
    TopicService topicService;

    @GetMapping
    public String getTestPage(Model model) {
        Topic topic = new Topic();
        topic.setTests(List.of(new Test()));

        model.addAttribute("topic", topic);
        model.addAttribute("topics", topicService.findAll());
        return "/admin/create-test";
    }

    @GetMapping(path = "/{topic}")
    public @ResponseBody
    List<Test> getListOfTestByTopic(Model model, @PathVariable String topic) {
        Topic byName = topicService.findByName(topic);
        return byName.getTests();
    }


    @PostMapping
    public String createTopic(Model model, @ModelAttribute Topic topic) {
        String msg;
        String topicName = topic.getName();
        String testName = topic.getTests().get(0).getName();

        if (!topicName.equals("") && testName.equals("")) {
            if (Objects.nonNull(topicService.findByName(topic.getName()))) {
                msg = "Тема с названием '" + topic.getName() + "' уже существует!";
            } else {
                Topic newTopic = new Topic();
                newTopic.setName(topic.getName());
                topicService.saveOrUpdate(newTopic);
                msg = "Тема с названием '" + topicName + "' создана!";
            }
        } else {
            if (Objects.nonNull(topicService.findByName(topic.getName()))) {
                if (Objects.nonNull(testService.findByName(testName))) {
                    msg = "Тест с названием '" + testName + "' уже существует!";
                } else {
                    Test newTest = new Test();
                    newTest.setName(topic.getTests().get(0).getName());
                    newTest.setTopic(topicService.findByName(topic.getName()));
                    Test saveOrUpdate = testService.saveOrUpdate(newTest);
                    topicService.findByName(topic.getName()).getTests().add(saveOrUpdate);
                    msg = "Тест с названием '" + testName + "' создана!";
                }
            } else {
                Topic newTopic = new Topic();
                newTopic.setName(topicName);
                topicService.saveOrUpdate(newTopic);
                msg = "Тема с названием '" + topic.getName() + "' создана!";
            }
        }

        model.addAttribute("msg", msg);
        model.addAttribute("topic", topic);
        model.addAttribute("topics", topicService.findAll());
        return "/admin/create-test";
    }


}
