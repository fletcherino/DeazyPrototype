package com.team2.deazy_project.dropdowns;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserViewController {
    String[] dropDown = {"One", "Two", "Three"};
    @ResponseBody
    @GetMapping("/dropdown")
    public ModelAndView dashboardController(Model model) {
        model.addAttribute("dropDownList", dropDown);
        ModelAndView page1 = new ModelAndView();
        page1.setViewName("JennyPlayground");
        return page1;
    }

    @PostMapping("/newPage")
    public ModelAndView redirect
            (@RequestParam(name = "option") String option,
             Model model) {
        model.addAttribute("option", option);
        ModelAndView page2 = new ModelAndView();
        page2.setViewName("redirect");
        return page2;
    }

//    public String getOption(@RequestParam(name = "option") String option, Model model) {
//        model.addAttribute("option", option);
//        return option;
//    }
}

