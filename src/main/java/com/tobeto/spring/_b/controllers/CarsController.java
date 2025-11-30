package com.tobeto.spring._b.controllers;

import com.tobeto.spring._b.services.abstracts.CarService;
import com.tobeto.spring._b.services.dtos.responses.car.GetCarListResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/cars")
public class CarsController {
   private final CarService carService;

   @GetMapping
   public List<GetCarListResponse> getAll(){
      return carService.getAll();
   }
}
