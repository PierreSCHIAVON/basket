package com.project.basket.controllers;

import com.project.basket.entity.Terrain;
import com.project.basket.repository.TerrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RequestMapping("terrain")
@RestController
public class TerrainController {
    @Autowired
    private TerrainRepository terrainRepository;

    @GetMapping
    public List<Terrain> getTerrains(){return terrainRepository.findAll();}
    @PostMapping
    public void createTerrain(@RequestBody Terrain terrain){terrainRepository.save(terrain);}
    @GetMapping(path = "{id}")
    public Optional<Terrain> getTerrain(@PathVariable("id") Long id){return terrainRepository.findById(id);}
    @PutMapping
    public void updateTerrain(@RequestBody Terrain terrain){terrainRepository.save(terrain);}
    @DeleteMapping(path = "{id}")
    public void deleteTerrainById(@PathVariable("id") Long id){terrainRepository.deleteById(id);}
}
