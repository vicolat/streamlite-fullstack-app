package com.streamlite.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.streamlite.backend.model.Movie;
import com.streamlite.backend.repository.MovieRepository;

@RestController
@RequestMapping("/api/movies")
@CrossOrigin(origins = "*")
public class MovieController {

    @Autowired
    private MovieRepository repo;

    @GetMapping
    public List<Movie> getAllMovies() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Movie getMovie(@PathVariable String id) {
        return repo.findById(id).orElse(null);
    }
}