package com.esprit.microservices.gestionacademic.repositerys;

import com.esprit.microservices.gestionacademic.entities.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursRepository extends JpaRepository<Cours,Long> {
}
