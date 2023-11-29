package com.esprit.microservices.gestionacademic.repositerys;

import com.esprit.microservices.gestionacademic.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantsRepository extends JpaRepository<Etudiant,Long> {
}
