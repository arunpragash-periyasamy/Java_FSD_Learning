package com.arunpragash.rest_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.arunpragash.rest_demo.model.JobPost;
import com.arunpragash.rest_demo.service.JobService;

@RestController
@CrossOrigin(origins = "*")
public class JobController {

    @Autowired
    private JobService service;
    // @ResponseBody //optional while using @RestController. But we need to use while using normal @Controller
    @GetMapping("jobs")
    public List<JobPost> posts() {
        return service.getAllJobs();
    }

    @GetMapping("job/{postId}")
    public JobPost post(@PathVariable int postId) {
        try {
            return service.getPost(postId);
        } catch (Exception e) {
            return null;
        }
    }
    
    @PostMapping("job")
    public String job(@RequestBody JobPost job) {
        service.add(job);
        return "Job created";
    }

    @DeleteMapping("job/{postId}")
    public String deleteJob(@PathVariable int postId) {
        service.deleteJob(postId);
        return "Job deleted";
    }

    @PutMapping("job")
    public String updateJob(@RequestBody JobPost job) {
        if (service.updateJob(job)) {
            return "Job updated";
        }
        return "There is no job existing to update";
    }
}
