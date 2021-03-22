package com.springproject.job_application.controller;

import com.springproject.job_application.Service.CandidateService;
import com.springproject.job_application.domain.Candidate;
import com.springproject.job_application.domain.Skills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping("/api/v1/candidate")
public class CandidateController {

    @Autowired
    CandidateService candidateService;

    @PostMapping("/add")
    public ResponseEntity<Candidate> saveCandidate(@RequestBody Candidate candidate){
        Candidate newCandidate=candidateService.addCandidate(candidate);
        return new ResponseEntity<>(newCandidate, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Candidate>> getAllCandidates(){
       List<Candidate> candidates = candidateService.findAllCandidates();
       return new ResponseEntity<>(candidates,HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Candidate> getCandidate(@PathVariable("id") Long id){
        Candidate getCandidate = candidateService.findCandidateById(id);
        return new ResponseEntity<>(getCandidate,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCandidate(@PathVariable("id") Long id){
        candidateService.deleteCandidateById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Candidate> updateCandidate(@RequestBody Candidate candidate){
        Candidate updateCandidate = candidateService.updateCandidate(candidate);
        return new ResponseEntity<>(updateCandidate,HttpStatus.OK);
    }



}
