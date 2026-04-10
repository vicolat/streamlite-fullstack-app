package com.streamlite.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.streamlite.backend.model.Movie;

public interface MovieRepository extends MongoRepository<Movie, String> {
}