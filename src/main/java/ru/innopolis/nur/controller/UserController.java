package ru.innopolis.nur.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.innopolis.nur.model.User;
import ru.innopolis.nur.service.SecurityService;
import ru.innopolis.nur.service.StudentService;
import ru.innopolis.nur.service.UserService;
import ru.innopolis.nur.validator.UserValidation;

/**
 * Created by nur on 09.11.16.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidation userValidation;

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model){
        model.addAttribute("userForm", new User());

        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model){
        userValidation.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);

        securityService.autoLogin(userForm.getUsername(), userForm.getConfirmPassword());

        return "redirect:/welcome";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout){
        if (error!=null){
            model.addAttribute("error", "Username or password is incorrect.");
        }
        if (logout != null){
            model.addAttribute("logout", "Logged out successfully");
        }
        return "login";
    }

    @RequestMapping(value = {"/", "welcome"},  method = RequestMethod.GET)
    public String welcome(Model model){
        return "welcome";
    }

    @RequestMapping(value = "/admin",  method = RequestMethod.GET)
    public String admin(Model model){
        return "admin";
    }

    @RequestMapping(value = "/students",  method = RequestMethod.GET)
    public String students(Model model){
        model.addAttribute("studentsList", studentService.getStudents());

        return "students";
    }

}
