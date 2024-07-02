package com.arunpragash.jobportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arunpragash.jobportal.model.JobPost;
import com.arunpragash.jobportal.service.JobService;

@Controller
public class JobController {

    @Autowired
    private JobService service;

    @RequestMapping({"/", "home"})
    public String home() {
        return "home";
    }

    @RequestMapping("/addjob")
    public String addJob() {
        return "addjob";
    }

    @GetMapping("/viewalljobs")
    public String allJobs(Model model) {
        List<JobPost> jobs = service.getAllJobs();
        model.addAttribute("jobPosts", jobs);
        return "viewalljobs";
    }

    @RequestMapping("handleForm")
    public String handleForm(JobPost jobPost) {
        service.add(jobPost);
        return "success";
    }


}
