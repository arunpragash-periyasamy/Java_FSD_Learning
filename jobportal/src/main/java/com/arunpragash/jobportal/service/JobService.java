package com.arunpragash.jobportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arunpragash.jobportal.model.JobPost;
import com.arunpragash.jobportal.repo.JobRepo;

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

}
