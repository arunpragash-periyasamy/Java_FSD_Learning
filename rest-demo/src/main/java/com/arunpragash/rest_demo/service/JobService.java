package com.arunpragash.rest_demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arunpragash.rest_demo.model.JobPost;
import com.arunpragash.rest_demo.repo.JobRepo;

@Service
public class JobService {
    @Autowired
    private JobRepo repo;

    public List<JobPost> getAllJobs() {
        return repo.getAllJobs();
    }

    public void add(JobPost job) {
        repo.addJob(job);
    }

    public JobPost getPost(int postId) {
        return repo.getPost(postId);
    }

    public void deleteJob(int postId) {
        repo.deleteJob(postId);
    }


    public boolean updateJob(JobPost job) {
       return repo.updateJob(job);
    }

}
