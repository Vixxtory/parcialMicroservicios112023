package com.dh.catalog.repository;

import com.dh.catalog.repository.DTO.MovieDTO;
import com.dh.catalog.repository.DTO.ResponseMoviesDTO;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "movie-service")
@Component
@LoadBalancerClient(name = "movie-service")
public interface IMovieFeignClient {

    @GetMapping("/{genre}")
    ResponseEntity<List<ResponseMoviesDTO>> getMovieByGenre(@PathVariable String genre);

    @PostMapping("/save")
    ResponseEntity<MovieDTO> saveMovie(@RequestBody MovieDTO movieDTO);
}
