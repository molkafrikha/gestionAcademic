package com.esprit.microservices.gestionacademic.Api;

import com.esprit.microservices.gestionacademic.entities.Cours;
import com.esprit.microservices.gestionacademic.microservices.CoursMicroService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor

@RequestMapping("/Cours")
public class CoursRestApi {

    public CoursMicroService coursMicroService;
    @PostMapping("/addcours")
    public Cours addCours(@RequestBody Cours cours){
        return coursMicroService.addCours(cours);
    }


    @GetMapping("/afficherCours")
    public List<Cours> afficherCours(){
        return coursMicroService.afficherCours();
    }

    @GetMapping("/getCours/{codeCours}")
    public Cours findById(@PathVariable long codeCours) {
        return coursMicroService.findById(codeCours);
    }


    @DeleteMapping("/deleteCours/{codeCours}")
    public void deleteCours(@PathVariable long codeCours) {
        coursMicroService.deleteCours(codeCours);
    }


}
