package com.esprit.microservices.gestionacademic.microservices;

import com.esprit.microservices.gestionacademic.entities.Cours;
import com.esprit.microservices.gestionacademic.repositerys.CoursRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CoursMicroService {
    public CoursRepository coursRepository;

    public Cours addCours(Cours cours) {
    return coursRepository.save(cours);
    }
    public List<Cours> afficherCours(){

        return coursRepository.findAll();
    }
    public Cours findById(long coursCode) {

        return coursRepository.findById(coursCode).orElse(null);
    }
    public void deleteCours(long coursCode) {
        coursRepository.deleteById(coursCode);
    }
}
