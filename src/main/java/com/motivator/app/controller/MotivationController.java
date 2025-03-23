package com.motivator.app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import com.motivator.app.model.Motivation;
import com.motivator.app.repository.MotivationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000") // Allow frontend requests
@RestController
@RequestMapping("/motivations") // Base URL for all endpoints
public class MotivationController {

    @Autowired
    private MotivationRepository motivationRepository;

    // GET all motivations
    @GetMapping
    public ResponseEntity<List<Motivation>> getAllMotivations() {
        List<Motivation> motivations = motivationRepository.findAll();
        return ResponseEntity.ok(motivations);
    }

    // POST a new motivation
    @PostMapping
    public ResponseEntity<String> saveMotivation(@RequestBody Motivation motivation) {
        if (motivation.getMessage() == null || motivation.getMessage().isEmpty() ||
                motivation.getAuthor() == null || motivation.getAuthor().isEmpty()) {
            return ResponseEntity.badRequest().body("Quote and author cannot be empty.");
        }

        motivationRepository.save(motivation);
        return ResponseEntity.ok("Motivation saved successfully!");
    }
}
