package com.team2.deazy_project.caseStudies;

import com.team2.deazy_project.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Controllers {
    public Controllers() {
    }

    private ProjectRepository repo;

    @Autowired
    public Controllers(ProjectRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/AllTeams")
    @ResponseBody
    public String getAllTeams() {
        List<CaseStudy> caseStudies = repo.findAll();
        List<String> caseStudyNames = new ArrayList<>(caseStudies.size());
        for (CaseStudy caseStudy : caseStudies)
            caseStudyNames.add(caseStudy.getTeamName());
        return caseStudyNames.toString();
    }

    @GetMapping("/IndividualProject")
    public ModelAndView IndividualProjects(Model model, @RequestParam(name="project") int projectIndex){
        List<CaseStudy> caseStudies = repo.findAll();
        model.addAttribute("projectIndex", projectIndex);
        model.addAttribute("caseStudies", caseStudies);
        ModelAndView individualProjects = new ModelAndView();
        individualProjects.setViewName("IndividualProject");
        return individualProjects;
    }
    @GetMapping("/AllProjects")
    public ModelAndView Project(Model model){
        List<CaseStudy> caseStudies = repo.findAll();
        model.addAttribute("caseStudies", caseStudies);
        ModelAndView project = new ModelAndView();
        project.setViewName("AllProjects");
        return project;
    }

    @GetMapping("/input")
    public String input(Model model) {
        model.addAttribute("input", new Input());
        return "CreateProject"; //change from CaseStudyForm
    }

    @PostMapping("/input")
    public String input(@ModelAttribute Input input) {
        return "PreviewProject";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Input input, Model model) { //have a th:action in case study preview that calls this method
        repo.save(input);
        List<CaseStudy> caseStudies = repo.findAll();
        model.addAttribute("caseStudies", caseStudies);
        ModelAndView project = new ModelAndView();
        project.setViewName("AllProjects");
        return "redirect:/AllProjects";
    }
}
