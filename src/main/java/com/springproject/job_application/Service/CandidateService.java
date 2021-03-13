package com.springproject.job_application.Service;

import com.springproject.job_application.domain.Candidate;
import com.springproject.job_application.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {

    @Autowired
    CandidateRepository candidateRepository;

    public List<Candidate> findAllCandidates(){
        return this.candidateRepository.findAll();
    }

    public Candidate addCandidate(Candidate candidate){
        return candidate;
    }
}
