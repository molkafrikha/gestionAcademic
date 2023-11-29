package com.esprit.microservices.gestionacademic.microservices;

import com.esprit.microservices.gestionacademic.entities.Etudiant;
import com.esprit.microservices.gestionacademic.repositerys.EtudiantsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EtudinatsMicroService {

    public EtudiantsRepository etudiantsRepository;

    public Etudiant addEtudiant(Etudiant etudiants) {
        return etudiantsRepository.save(etudiants);

    }





}
