package by.testingSystem.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainUserController {
    @GetMapping(value = "/chooseTest")
    public String chooseTest() {
        return "user/userChoose";
    }

    @GetMapping(value = "/personalStatistic")
    public String personalStatistic() {
        return "user/personalStatistic";
    }
}
