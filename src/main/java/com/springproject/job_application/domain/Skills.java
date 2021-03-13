package com.springproject.job_application.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "skills")
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Lob
    private String spokenLanguages;
    @Lob
    private String jobRelatedSkills;

    @Override
    public String toString() {
        return "Skills{" +
                ", spoken Languages='" + spokenLanguages + '\'' +
                ", job Related Skills='" + jobRelatedSkills + '\'' +
                '}';
    }
}
