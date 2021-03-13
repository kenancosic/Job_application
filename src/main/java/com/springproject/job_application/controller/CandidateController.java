package com.springproject.job_application.controller;

import com.springproject.job_application.Service.CandidateService;
import com.springproject.job_application.domain.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/candidate")
public class CandidateController {

    @Autowired
    CandidateService candidateService;

    @PostMapping("")
    public Candidate saveCandidate(@RequestBody Candidate candidate){
        return this.candidateService.addCandidate(candidate);
    }

    @GetMapping("/all")
    public List<Candidate> getAllCandidates(){
        return this.candidateService.findAllCandidates();
    }




}
