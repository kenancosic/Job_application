package com.springproject.job_application.repository;

import com.springproject.job_application.domain.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate,Long> {

    Optional<Candidate> findCandidateByName(String name);

    void deleteCandidateById(Long id);

    Optional<Candidate> findCandidateById(Long id);
}
