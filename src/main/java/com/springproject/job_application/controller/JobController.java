package com.springproject.job_application.controller;

import com.springproject.job_application.Service.JobService;
import com.springproject.job_application.domain.Candidate;
import com.springproject.job_application.domain.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/job")
public class JobController {

    @Autowired
    JobService jobService;

    @PostMapping("")
    public Job saveJob(@RequestBody Job job){
        return this.jobService.addJob(job);
    }

    @GetMapping("/all")
    public List<Job> getAllJobs(){
        return this.jobService.findAllJobs();
    }


}
