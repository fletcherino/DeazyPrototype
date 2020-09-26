package com.team2.deazy_project.reg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class RegController {

    /*
    Constants used for error messages
    */
    private static final String REG_ERROR_NULLS = "Please complete the form before submitting";
    private static final String REG_ERROR_PASSWORD_MISMATCH = "Password does not match";
    private static final String REG_ERROR_UNKNOWN_ERROR = "Unknown Error";
    private static final String REG_ERROR_USERNAME_EXISTS = "Username already taken, please choose a new username";

    private UserRepository repo;

    @Autowired
    public RegController(UserRepository r) {
        repo = r;
    }

    @GetMapping("/register")
    public ModelAndView register(HttpSession session) {

        if (session.getAttribute("SESSION_USERNAME") != null)
            return new ModelAndView("redirect:/");


        ModelAndView mv = new ModelAndView();
        mv.setViewName("registerTemplate");

        User u = new User();
        mv.addObject("user", u);

        return mv;
    }

    @PostMapping("/registration")
    public ModelAndView registerUserAccount(@ModelAttribute("user") User user){
        ModelAndView mv = new ModelAndView("registerTemplate");
        mv.addObject("user", user);

        List<String> errors = new ArrayList<>(0);

        String submittedUsername = user.getUsername();
        String submittedPassword = user.getPassword();
        String submittedCPassword = user.getCpassword();



        if (submittedUsername.isEmpty() || submittedPassword.isEmpty() || submittedCPassword.isEmpty())
            errors.add(REG_ERROR_NULLS);
        if (!submittedPassword.equals(submittedCPassword))
            errors.add(REG_ERROR_PASSWORD_MISMATCH);

        if (errors.size() > 0) {
            mv.addObject("errors", errors);
            return mv;
        }


        if (repo.doesUserNameExist(user.getUsername())){
            System.out.println("USERNAME ERR");
            errors.add(REG_ERROR_USERNAME_EXISTS);
            mv.addObject("errors", errors);
            return mv;
        }

        boolean success = repo.addUser(user);
        if (!success){
            errors.add(REG_ERROR_UNKNOWN_ERROR);
            mv.addObject("errors", errors);
            return mv;
        }
        else {

            return new ModelAndView("redirect:/logout");
        }
    }

}
