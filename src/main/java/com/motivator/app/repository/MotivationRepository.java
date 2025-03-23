package com.motivator.app.repository;

import com.motivator.app.model.Motivation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MotivationRepository extends MongoRepository<Motivation, String> {
}
