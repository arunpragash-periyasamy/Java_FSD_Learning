package com.arunpragash.rest_demo.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.arunpragash.rest_demo.model.JobPost;

@Repository
public class JobRepo {
    private List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Dev", "Expeieced Spring boot developer", 3,
                    new ArrayList<String>(Arrays.asList("Java", "Spring"))),
            new JobPost(2, "React Dev", "Expeieced MERN developer", 2,
                    new ArrayList<String>(Arrays.asList("React", "Redux"))),
            new JobPost(3, "Java Dev", "Expeieced Spring developer", 3,
                    new ArrayList<String>(Arrays.asList("Java", "Spring", "MMaven"))),
            new JobPost(4, "DevOps", "Expeieced Cloud developer", 3,
                    new ArrayList<String>(Arrays.asList("AWS", "Docker")))));
                            
    public void addJob(JobPost job) {
        jobs.add(job);
        System.out.println(jobs);
    }
                    
    public List<JobPost> getAllJobs() {
        return jobs;
    }

    public JobPost getPost(int postId) {
        return jobs.stream().filter(post -> post.getPostId() == postId).findFirst().get();
}

public void deleteJob(int postId) {
        jobs.removeIf(post -> post.getPostId() == postId);
}

public boolean updateJob(JobPost job) {
        if (jobs.removeIf(post -> post.getPostId() == job.getPostId())) {
                jobs.add(job);
                return true;
        }
        return false;
}


}
