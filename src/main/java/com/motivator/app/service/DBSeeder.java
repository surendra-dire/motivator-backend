package com.motivator.app.service;

import com.motivator.app.model.Motivation;
import com.motivator.app.repository.MotivationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DBSeeder implements CommandLineRunner {

    private final MotivationRepository repository;

    @Override
    public void run(String... args) {
        Motivation motivation = new Motivation("Stay positive!", "John Doe");
        repository.save(motivation);
        System.out.println("✅ Motivation saved!");
    }
}
