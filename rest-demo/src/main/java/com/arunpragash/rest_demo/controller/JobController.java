package com.arunpragash.rest_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    @GetMapping("posts")
    public List<JobPost> posts() {
        return service.getAllJobs();
    }

    @GetMapping("post/{postId}")
    public JobPost post(@PathVariable int postId) {
        try{
            return service.getPost(postId);
        } catch (Exception e) {
            return null;
        }
    }
}
