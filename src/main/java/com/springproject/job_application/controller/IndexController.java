package com.springproject.job_application.controller;

import com.springproject.job_application.domain.Candidate;
import com.springproject.job_application.domain.Job;
import com.springproject.job_application.domain.Skills;
import com.springproject.job_application.repository.CandidateRepository;
import com.springproject.job_application.repository.JobRepository;
import com.springproject.job_application.repository.SkillsRepository;
import org.hibernate.boot.archive.scan.spi.ClassDescriptor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CandidateRepository candidateRepository;
    private JobRepository jobRepository;
    private SkillsRepository skillsRepository;

    public IndexController(CandidateRepository candidateRepository,
                           JobRepository jobRepository, SkillsRepository skillsRepository) {
        this.candidateRepository = candidateRepository;
        this.jobRepository = jobRepository;
        this.skillsRepository = skillsRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){

        Optional<Candidate> candidateOptional = candidateRepository.findCandidateByName("Kenan Cosic");
        Optional<Job> jobOptional=jobRepository.findJobByPosition("Backend");

        System.out.println("Candidate Id is: " + candidateOptional.get().getId());
        System.out.println("Job Id is: " + jobOptional.get().getId());

        return "index";
    }
}
