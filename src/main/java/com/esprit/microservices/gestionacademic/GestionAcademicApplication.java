package com.esprit.microservices.gestionacademic;

import com.esprit.microservices.gestionacademic.entities.Etudiant;
import com.esprit.microservices.gestionacademic.repositerys.EtudiantsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableDiscoveryClient

public class GestionAcademicApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionAcademicApplication.class, args);
    }
    @Autowired
    private EtudiantsRepository candidatRepository;
    @Bean
    ApplicationRunner init(){
        return (args )-> {
            candidatRepository.save(new Etudiant());
            candidatRepository.save(new Etudiant());
            candidatRepository.findAll().forEach(System.out::println);
        };
    }
}
