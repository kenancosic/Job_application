package com.springproject.job_application.bootstrap;

import com.springproject.job_application.domain.Candidate;
import com.springproject.job_application.domain.Job;
import com.springproject.job_application.domain.Skills;
import com.springproject.job_application.repository.CandidateRepository;
import com.springproject.job_application.repository.JobRepository;
import com.springproject.job_application.repository.SkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Component
public class Bootstrap implements CommandLineRunner {

    @Autowired
    CandidateRepository candidateRepository;

    @Autowired
    JobRepository jobRepository;

    @Autowired
    SkillsRepository skillsRepository;

    @Override
    public void run(String... args) throws Exception {
        // popuni bazu ovdje kad se pokrece app spremat ce ti stvari u bazu H2


        Job job = new Job();
        job.setDescription("Looking for a experienced Spring boot developer with 2+ years.");
        job.setPosition("Backend");
        jobRepository.save(job);

        Skills skills = new Skills();
        skills.setJobRelatedSkills("String");
        skills.setSpokenLanguages("Language");
        skillsRepository.save(skills);


        LocalDate dateOfBirth = LocalDate.of(1998,3,17);
        Candidate candidate = new Candidate();
        candidate.setName("Kenan Cosic");
        candidate.setContactNumber("0603259989");
        candidate.setEmail("kenan@kenan.com");
        candidate.setDateOfBirth(dateOfBirth);
        candidate.getJobs().add(job);
        candidate.getSkills().add(skills);

        candidateRepository.save(candidate);


    }
}
