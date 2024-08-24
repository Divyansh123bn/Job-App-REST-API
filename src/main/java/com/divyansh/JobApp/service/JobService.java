package com.divyansh.JobApp.service;

import com.divyansh.JobApp.model.JobPost;
import com.divyansh.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost job){
        repo.addJobPost(job);
    }

    public List<JobPost> getAllJobs(){
        return repo.returnAllJobPosts();
    }
}
