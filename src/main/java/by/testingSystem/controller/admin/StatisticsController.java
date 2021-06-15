package by.testingSystem.controller.admin;

import by.testingSystem.service.QuestionService;
import by.testingSystem.service.StatisticService;
import by.testingSystem.service.TestService;
import by.testingSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/admin/statistic")
public class StatisticsController {

    @Autowired
    TestService testService;

    @Autowired
    QuestionService questionService;

    @Autowired
    UserService userService;

    @Autowired
    StatisticService statisticService;

    @GetMapping(path = "test-statistic")
    public String getStatisticTestPage(Model model){
        model.addAttribute("testsStatistic",testService.getStatistics());
        return "/admin/test-statistic";
    }

    @GetMapping(path = "question-statistic")
    public String getStatisticQuestionPage(Model model){
       model.addAttribute("questionStatistic",questionService.getStatistic());
        return "/admin/question-statistic";
    }

    @GetMapping(path = "user-statistic")
    public String getStatisticUserPage(Model model){
        model.addAttribute("userStatistic", userService.getStatistic());
        return "/admin/user-statistic";
    }

}
