package com.tobeto.spring._b.controllers;

import com.tobeto.spring._b.dtos.requests.brand.AddBrandRequest;
import com.tobeto.spring._b.dtos.responses.brand.GetBrandResponse;
import com.tobeto.spring._b.entities.Brand;
import com.tobeto.spring._b.repositories.BrandRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/brands")
public class BrandsController
{
    private final BrandRepository brandRepository;

    public BrandsController(BrandRepository brandRepository){
        this.brandRepository=brandRepository;
    }


   @GetMapping
    public List<Brand> getAll()
   {
       return brandRepository.findAll();

    }

    @GetMapping("{id}")
    public GetBrandResponse getById(@PathVariable int id)
    {
        Brand brand =brandRepository.findById(id).orElseThrow();

        GetBrandResponse dto= new GetBrandResponse();
        dto.setName(brand.getName());
        return dto;
    }
    @PostMapping
    //Brand X
    //BrandForAddDto
    public void add(@RequestBody AddBrandRequest request){
        //manuel mapping--> sonrasında Auto Mapping çeviricez
        Brand brand =new Brand();
        brand.setName(request.getName());

      brandRepository.save(brand);
    }
    @PutMapping
    public void update (@RequestBody Brand brand)
    {
        brandRepository.save(brand);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        //kod buraya fırlıyor ise exception fırlamıştır
        // Brand brandToDelete = brandRepository.findById(id).orElseThrow();
        //brandRepository.delete(brandToDelete);
        brandRepository.deleteById(id);
    }
}
//her istegin özel bir modele sahip olması gerekir
//her istek için bir request bir response modeli bulunmalıdır
