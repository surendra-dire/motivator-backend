package com.motivator.app.service;

import com.motivator.app.model.Motivation;
import com.motivator.app.repository.MotivationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MotivationService {

    private final MotivationRepository motivationRepository;

    @Autowired
    public MotivationService(MotivationRepository motivationRepository) {
        this.motivationRepository = motivationRepository;
    }

    public void saveMotivation(Motivation motivation) {
        motivationRepository.save(motivation);
    }
}
