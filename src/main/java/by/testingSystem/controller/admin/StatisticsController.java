package by.testingSystem.controller.admin;

import by.testingSystem.model.Question;
import by.testingSystem.model.Statistic;
import by.testingSystem.model.User;
import by.testingSystem.service.QuestionService;
import by.testingSystem.service.StatisticService;
import by.testingSystem.service.TestService;
import by.testingSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/statistic")
public class StatisticsController {

    @Autowired
    TestService testService;

    @Autowired
    QuestionService questionService;

    @Autowired
    UserService userService;

    @Autowired
    StatisticService statisticService;

    @GetMapping
    public String getStatisticsMenuPage() {
        return "/admin/statistic-menu";
    }

    @GetMapping(path = "test-statistic")
    public String getStatisticTestPage(Model model){
        model.addAttribute("tests",testService.findAll());
        return "/admin/test-statistic";
    }

    @GetMapping(path = "question-statistic")
    public String getStatisticQuestionPage(Model model){


        model.addAttribute("questions",questionService.findAll());
        return "/admin/question-statistic";
    }

    @GetMapping(path = "user-statistic")
    public String getStatisticUserPage(Model model){
        model.addAttribute("users", userService.findAll());
        return "/admin/user-statistic";
    }
}
