package com.tohir.redisspring.city.controller;

import com.tohir.redisspring.city.dto.City;
import com.tohir.redisspring.city.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/city")
@RequiredArgsConstructor
public class CityController {

    private final CityService service;

    @GetMapping("{zipCode}")
    public Mono<City> getCity(@PathVariable String zipCode) {
        return service.getCity(zipCode);
    }

}
