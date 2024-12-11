package com.project.basket.controllers;

import com.project.basket.entity.Joueur;
import com.project.basket.repository.JoueurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RequestMapping("joueur")
@RestController
public class JoueurController {
    @Autowired
    private JoueurRepository joueurRepository
            ;

    @GetMapping
    public List<Joueur> getJoueurs(){return joueurRepository.findAll();}
    @PostMapping
    public void createJoueur(@RequestBody Joueur joueur){joueurRepository.save(joueur);}
    @GetMapping(path = "{id}")
    public Optional<Joueur> getJoueurById(@PathVariable("id") Long id){return joueurRepository.findById(id);}
    @PutMapping
    public void updateJoueur(@RequestBody Joueur joueur){joueurRepository.save(joueur);}
    @DeleteMapping(path = "{id}")
    public void deleteJoueurById(@PathVariable("id") Long id){joueurRepository.deleteById(id);}
}
