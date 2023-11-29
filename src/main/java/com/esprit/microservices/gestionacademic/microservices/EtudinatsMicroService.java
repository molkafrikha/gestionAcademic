package com.esprit.microservices.gestionacademic.microservices;

import com.esprit.microservices.gestionacademic.entities.Etudiant;
import com.esprit.microservices.gestionacademic.repositerys.EtudiantsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudinatsMicroService {

    public EtudiantsRepository etudiantsRepository;

    public Etudiant addEtudiant(Etudiant etudiants) {
        return etudiantsRepository.save(etudiants);

    }

    public List<Etudiant> afficherEtudiant(){
        return etudiantsRepository.findAll();
    }


    public Etudiant findById(long idE) {
        return etudiantsRepository.findById(idE).orElse(null);
    }


    public void deleteEtudiant(long idE) {
        etudiantsRepository.deleteById(idE);
    }







}
