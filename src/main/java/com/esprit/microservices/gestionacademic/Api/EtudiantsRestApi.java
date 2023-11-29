package com.esprit.microservices.gestionacademic.Api;

import com.esprit.microservices.gestionacademic.entities.Etudiant;
import com.esprit.microservices.gestionacademic.microservices.EtudinatsMicroService;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/Etudiants")
public class EtudiantsRestApi {

public EtudinatsMicroService etudinatsMicroService;
@PostMapping("/addetudiant")
    public Etudiant addEtudiants(@RequestBody Etudiant etudiants){
        return etudinatsMicroService.addEtudiant(etudiants);
    }


}
