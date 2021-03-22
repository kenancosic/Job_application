package com.springproject.job_application.repository;

import com.springproject.job_application.domain.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository<Skills,Long> {

    void deleteSkillsById(Long id);
}
