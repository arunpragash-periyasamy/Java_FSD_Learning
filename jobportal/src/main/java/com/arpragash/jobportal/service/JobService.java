package com.arpragash.jobportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arpragash.jobportal.JobRepo;
import com.arpragash.jobportal.model.JobPost;

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
