package com.springproject.job_application.repository;

import com.springproject.job_application.domain.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JobRepository extends JpaRepository<Job,Long> {
    Optional<Job> findJobByPosition(String position);

    void deleteJobById(Long id);
}
