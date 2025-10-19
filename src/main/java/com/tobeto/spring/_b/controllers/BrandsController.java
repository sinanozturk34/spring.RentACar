package com.tobeto.spring._b.controllers;

import com.tobeto.spring._b.services.dtos.abstracts.BrandService;
import com.tobeto.spring._b.services.dtos.requests.brand.AddBrandRequest;
import com.tobeto.spring._b.services.dtos.responses.brand.GetBrandResponse;
import com.tobeto.spring._b.entities.Brand;
import com.tobeto.spring._b.repositories.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/brands")
@AllArgsConstructor
public class BrandsController {
    private final BrandService brandService;


   @GetMapping("{id}")
   public GetBrandResponse getById(@PathVariable int id)
   {
       return this.brandService.getById(id);

   }

    @PostMapping
    public void add(@RequestBody AddBrandRequest request) {
        this.brandService.add(request);
    }

}