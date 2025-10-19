package com.tobeto.spring._b.services.dtos.abstracts;

import com.tobeto.spring._b.services.dtos.requests.brand.AddBrandRequest;
import com.tobeto.spring._b.services.dtos.responses.brand.GetBrandResponse;

public interface BrandService {
     void add(AddBrandRequest request);
     GetBrandResponse getById(int id);

}
