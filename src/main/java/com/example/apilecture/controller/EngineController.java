package com.example.apilecture.controller;

import com.example.apilecture.model.Engine;
import com.example.apilecture.repo.EngineRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/engine")
@RestController
public class EngineController {

    private EngineRepository engineRepository;

    public EngineController(EngineRepository engineRepository) {

        this.engineRepository = engineRepository;
    }

    @PostMapping("/add")
    public Engine addEngine(Engine engine) {

        return engineRepository.save(engine);
    }

    @GetMapping("/all")
    public List<Engine> getAllEngines() {

        return (List<Engine>)engineRepository.findAll();
    }

    @GetMapping("/{id}/")
    public Optional<Engine> getEngine(@PathVariable Long id) {

        return engineRepository.findById(id);
    }





}