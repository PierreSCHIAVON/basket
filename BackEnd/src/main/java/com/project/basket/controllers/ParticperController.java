package com.project.basket.controllers;

import com.project.basket.entity.Participer;
import com.project.basket.repository.ParticiperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RequestMapping("secured/participer")
@RestController
public class ParticperController {
    @Autowired
    private ParticiperRepository participerRepository;

    @GetMapping
    public List<Participer> getAllParticiper(){return participerRepository.findAll();}
    @PostMapping
    public void createParticiper(@RequestBody Participer participer){participerRepository.save(participer);}
    @GetMapping(path = "{id}")
    public Optional<Participer> getParticiperById(@PathVariable("id") Long id){return participerRepository.findById(id);}
    @PutMapping
    public void updateParticiper(@RequestBody Participer participer){participerRepository.save(participer);}
    @DeleteMapping(path = "{id}")
    public void deleteParticiperById(@PathVariable("id") Long id){participerRepository.deleteById(id);}
}
