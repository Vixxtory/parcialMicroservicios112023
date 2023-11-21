package com.dh.catalog.controller;


import com.dh.catalog.repository.DTO.MovieDTO;
import com.dh.catalog.repository.DTO.ResponseMoviesDTO;
import com.dh.catalog.repository.IMovieFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CatalogMoviesController {

    @Autowired
    private IMovieFeignClient iMovieFeignClient;

    @GetMapping("/catalog/{genre}")
    ResponseEntity<List<ResponseMoviesDTO>> getMovieByGenre(@PathVariable String genre) {
        return ResponseEntity.ok(iMovieFeignClient.getMovieByGenre(genre).getBody());
    }

    @PostMapping("/save")
    ResponseEntity<MovieDTO> saveMovie(@RequestBody MovieDTO movie) {
        return ResponseEntity.ok().body(iMovieFeignClient.saveMovie(movie).getBody());
    }

}
