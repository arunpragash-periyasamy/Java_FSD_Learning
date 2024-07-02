package com.arpragash.jobportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arpragash.jobportal.model.JobPost;

@Controller
public class JobController {

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
        return "success";
    }


}
