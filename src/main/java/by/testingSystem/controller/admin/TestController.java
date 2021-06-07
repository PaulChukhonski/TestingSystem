package by.testingSystem.controller.admin;

import by.testingSystem.model.Question;
import by.testingSystem.model.Test;
import by.testingSystem.model.Topic;
import by.testingSystem.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/test")
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping
    public String getTestPage(Model model) {
        model.addAttribute("topic", new Topic());
        model.addAttribute("test", new Test());

        return "/admin/create-test";
    }


}
