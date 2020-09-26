package com.team2.deazy_project.templateController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;


@Controller
public class TemplateController {

    // Used the model & view library for the response to allow use of the fragments and templates.

    @GetMapping("/teams")
    public ModelAndView Teams(){

        ModelAndView teams = new ModelAndView();
        teams.setViewName("viewTeam");
        return teams;
    }

    @GetMapping("/adminfunctions")
    public ModelAndView AdminFunctions(HttpSession session){

        ModelAndView adminFunctions = new ModelAndView();
        adminFunctions.setViewName("adminFunctions");
        return adminFunctions;
    }

    @GetMapping("/")
    public ModelAndView home(HttpSession session) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        return mv;
    }

//    @GetMapping("/project")
//    public ModelAndView Project(){ //have perameter as a list of projects
//
//        ModelAndView project = new ModelAndView();
//        project.setViewName("viewProject");
//        return project;
//    }

    //    @GetMapping("/individualProject")
//    public ModelAndView IndividualProjects(){
//        ModelAndView individualProjects = new ModelAndView();
//        individualProjects.setViewName("projects");
//        return individualProjects;
//    }
}
