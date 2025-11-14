package com.tobeto.spring._b.services.concretes;

import com.tobeto.spring._b.repositories.CarRepository;
import com.tobeto.spring._b.services.abstracts.CarService;
import com.tobeto.spring._b.services.dtos.responses.brand.GetBrandListResponse;
import com.tobeto.spring._b.services.dtos.responses.car.GetCarListResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class CarManager implements CarService {

    private final CarRepository carRepository;

    @Override
    public List<GetCarListResponse> getAll() {

       return carRepository.getAll();
    }
}
