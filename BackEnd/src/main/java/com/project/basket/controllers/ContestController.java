package com.project.basket.controllers;

import com.project.basket.entity.Contest;
import com.project.basket.repository.ContestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RequestMapping("secured/contest")
@RestController
public class ContestController {
    @Autowired
    private ContestRepository contestRepository;

    @GetMapping
    public List<Contest> getContests(){return contestRepository.findAll();}
    @PostMapping
    public void createContest(@RequestBody Contest contest){contestRepository.save(contest);}
    @GetMapping(path = "{id}")
    public Optional<Contest> getContest(@PathVariable("id") Long id){return contestRepository.findById(id);}
    @PutMapping
    public void updateContest(@RequestBody Contest contest){contestRepository.save(contest);}
    @DeleteMapping(path = "{id}")
    public void deleteContestById(@PathVariable("id") Long id){contestRepository.deleteById(id);}
}
