package com.tohir.redisspring.city.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class City {

    private String zip;
    private String city;
    private String stateName;
    private int temperature;


}
/*

{
    "zip": "00601",
    "lat": 18.18005,
    "lng": -66.75218,
    "city": "Adjuntas",
    "stateId": "PR",
    "stateName": "Puerto Rico",
    "population": 17113,
    "density": 102.7,
    "temperature": 1
  }

* */