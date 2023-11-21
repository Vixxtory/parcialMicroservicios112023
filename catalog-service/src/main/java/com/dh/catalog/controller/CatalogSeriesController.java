package com.dh.catalog.controller;

import com.dh.catalog.repository.DTO.ResponseSeriesDTO;
import com.dh.catalog.repository.DTO.SerieDTO;
import com.dh.catalog.repository.ISerieFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CatalogSeriesController {
    @Autowired
    private ISerieFeignClient iSerieFeignClient;


    @GetMapping("/series/{genre}")
    public List<ResponseSeriesDTO> getSerieByGenre(@PathVariable String genre){
            return iSerieFeignClient.getSerieByGenre(genre);
    }

    @PostMapping
    public void create(@RequestBody SerieDTO serie){
        iSerieFeignClient.create(serie);
    }

}
