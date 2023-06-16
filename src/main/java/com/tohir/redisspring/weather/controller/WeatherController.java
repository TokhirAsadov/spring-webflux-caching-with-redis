package com.tohir.redisspring.weather.controller;

import com.tohir.redisspring.weather.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/weather")
@RequiredArgsConstructor
public class WeatherController {
    private final WeatherService service;

    @GetMapping("/{zip}")
    public Mono<Integer> getWeather(@PathVariable int zip){
        return Mono.fromSupplier(()-> service.getInfo(zip));
    }
}
