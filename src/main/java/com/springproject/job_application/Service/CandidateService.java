package com.springproject.job_application.Service;

import com.springproject.job_application.Exception.UserNotFoundException;
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

    public Candidate updateCandidate(Candidate candidate){
        return candidateRepository.save(candidate);
    }

    public void deleteCandidateById(Long id){
        candidateRepository.deleteCandidateById(id);
    }

    public Candidate findCandidateById(Long id){
        return candidateRepository.findCandidateById(id).
                orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }
}
