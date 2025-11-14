package com.tobeto.spring._b.services.abstracts;

import com.tobeto.spring._b.services.dtos.responses.car.GetCarListResponse;

import java.util.List;

public interface CarService {
    List<GetCarListResponse> getAll();
}
