package com.esprit.microservices.gestionacademic.Api;

import com.esprit.microservices.gestionacademic.entities.Etudiant;
import com.esprit.microservices.gestionacademic.microservices.EtudinatsMicroService;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor

@RequestMapping("/Etudiants")
public class EtudiantsRestApi {

public EtudinatsMicroService etudinatsMicroService;
@PostMapping("/addetudiant")
    public Etudiant addEtudiants(@RequestBody Etudiant etudiants){
        return etudinatsMicroService.addEtudiant(etudiants);
    }


    @GetMapping("/afficheretudnats")
    public List<Etudiant> afficherEtudiant(){
    return etudinatsMicroService.afficherEtudiant();
    }

    @GetMapping("/getE/{idEtu}")
    public Etudiant findById(@PathVariable long idEtu) {
        return etudinatsMicroService.findById(idEtu);
    }


    @DeleteMapping("/deleteE/{idEtu}")
    public void deleteEtudiant(@PathVariable long idEtu) {
        etudinatsMicroService.deleteEtudiant(idEtu);
    }


}
