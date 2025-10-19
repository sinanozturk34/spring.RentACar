package com.tobeto.spring._b.services.dtos.concretes;

import com.tobeto.spring._b.entities.Brand;
import com.tobeto.spring._b.repositories.BrandRepository;
import com.tobeto.spring._b.services.dtos.abstracts.BrandService;
import com.tobeto.spring._b.services.dtos.requests.brand.AddBrandRequest;
import com.tobeto.spring._b.services.dtos.responses.brand.GetBrandResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
public class BrandManager implements BrandService
{
    private final BrandRepository brandRepository;


    @Override
    public void add(AddBrandRequest request) {
        if(request.getName().length() < 2)
            throw new RuntimeException("Marka adı iki haneden kısa olamaz");

        Brand brand =new Brand();
        brand.setName(request.getName());

        brandRepository.save(brand);
    }

    @Override
    public GetBrandResponse getById(int id) {
        Brand brand =brandRepository.findById(id).orElseThrow();

        GetBrandResponse dto= new GetBrandResponse();
        dto.setName(brand.getName());
        return dto;
    }
}
