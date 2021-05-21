package by.testingSystem.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChooseTestController {
    @GetMapping(value = "/goTest")
    public String goTest() {
        return "user/testPage";
    }
}
