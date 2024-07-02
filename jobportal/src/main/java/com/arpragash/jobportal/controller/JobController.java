package com.arpragash.jobportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arpragash.jobportal.model.JobPost;
import com.arpragash.jobportal.service.JobService;

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

    @RequestMapping("/viewalljobs")
    public String allJobs() {
        return "viewalljobs";
    }

    @RequestMapping("handleForm")
    public String handleForm(JobPost jobPost) {
        service.add(jobPost);
        return "success";
    }


}
