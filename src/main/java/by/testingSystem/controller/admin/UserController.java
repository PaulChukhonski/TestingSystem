package by.testingSystem.controller.admin;

import by.testingSystem.model.Role;
import by.testingSystem.model.User;
import by.testingSystem.service.RoleService;
import by.testingSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import static java.util.stream.Collectors.toList;

@Controller
@RequestMapping(path = "/admin/user")
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    RoleService roleService;

    @GetMapping
    public String getUserPage(Model model) {
        User user = new User();
        user.setRole(new Role());
        model.addAttribute("user", user);
        model.addAttribute("roles", roleService.findAll().stream().map(Role::getRole).collect(toList()));
        return "/admin/create-user";
    }

    @PostMapping
    public String createUser(Model model, @ModelAttribute User user) {
        userService.saveOrUpdate(user);
        model.addAttribute("infoByUser", "Новый пользователь с именем " + user.getFirstName() + ' ' + user.getLastName() + "был создан!");
        return "/admin/admin-home";
    }
}
