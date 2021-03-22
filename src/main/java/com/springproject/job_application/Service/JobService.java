package com.springproject.job_application.Service;


import com.springproject.job_application.domain.Job;
import com.springproject.job_application.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    JobRepository jobRepository;

    public List<Job> findAllJobs(){
        return this.jobRepository.findAll();
    }

    public Job addJob (Job job) { return job; }

    public Job updateJob(Job job){
        return jobRepository.save(job);
    }

    public void deleteJob(Long id){
        jobRepository.deleteJobById(id);
    }

}
