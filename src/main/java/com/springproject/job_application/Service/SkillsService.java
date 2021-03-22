package com.springproject.job_application.Service;

import com.springproject.job_application.domain.Skills;
import com.springproject.job_application.repository.SkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SkillsService {

    @Autowired
    SkillsRepository skillsRepository;

    public List<Skills> findAllSkills(){
        return this.skillsRepository.findAll();
    }

    public Skills addSkills(Skills skills){
        return skills;
    }

    public Skills getById(Long id){
        return this.skillsRepository.findById(id).get();
    }

    public Skills dohvatiPoId(Long id){
        List<Skills> listaVjestina = this.skillsRepository.findAll();
       for(int i=0; i<listaVjestina.size();i++){
           if(listaVjestina.get(i).getId()==id){
               return listaVjestina.get(i);
           }
       }
       return null;
    }

    public void deleteSkill(Long id){
        skillsRepository.deleteSkillsById(id);
    }

    public Skills updateSkills(Skills skills){
        return skillsRepository.save(skills);
    }

}
