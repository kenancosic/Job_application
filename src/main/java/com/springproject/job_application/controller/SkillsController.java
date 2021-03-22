package com.springproject.job_application.controller;

import com.springproject.job_application.Service.SkillsService;
import com.springproject.job_application.domain.Skills;
import com.springproject.job_application.repository.SkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/skills")
public class SkillsController {

    @Autowired
    SkillsService skillsService;

    @PostMapping("")
    public Skills saveSkills(@RequestBody Skills skills){
        return this.skillsService.addSkills(skills);
    }
    @RequestMapping("/all")
    public List<Skills> getAllSkills(){
        return this.skillsService.findAllSkills();
    }
    @GetMapping("/{id}")
    public Skills getSkillById(@PathVariable Long id){
        return this.skillsService.getById(id);
    }
    @GetMapping("/custom/{id}")
    public Skills dohvatiPoId(@PathVariable Long id){
        return this.skillsService.dohvatiPoId(id);
    }

    @GetMapping("/delete/{id}")
    public Skills deleteSkillById(@PathVariable Long id){
        return null;
    }

}
