package com.dh.catalog.repository;

import com.dh.catalog.repository.DTO.ResponseSeriesDTO;
import com.dh.catalog.repository.DTO.SerieDTO;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "serie-service")
@Component
@LoadBalancerClient(name = "serie-service")
public interface ISerieFeignClient {

    @GetMapping("/{genre}")
    public List<ResponseSeriesDTO> getSerieByGenre(@PathVariable String genre);

    @PostMapping("/save")
    public void create(@RequestBody SerieDTO serie);
}
