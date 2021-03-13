package com.springproject.job_application.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "candidate")
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false,updatable = false)
    private Long id;
    private String name;
    private LocalDate dateOfBirth;
    private String contactNumber;
    private String email;

    @ManyToMany
    @JoinTable(name="candidate_jobs",
            joinColumns = @JoinColumn(name = "candidate_id"),
            inverseJoinColumns = @JoinColumn(name = "jobs_id"))
    private Set<Job> jobs=new HashSet<>();

    @ManyToMany()
    @JoinTable(name = "candidate_skills",
                joinColumns = @JoinColumn(name = "candidate_id"),
                inverseJoinColumns = @JoinColumn(name = "skills_id"))
    private Set<Skills> skills = new HashSet<>();


}
