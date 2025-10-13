package com.tobeto.spring._b.controllers;

import com.tobeto.spring._b.dtos.BrandForAddDto;
import com.tobeto.spring._b.dtos.BrandForDetailDto;
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
    public BrandForDetailDto getById(@PathVariable int id)
    {
        Brand brand =brandRepository.findById(id).orElseThrow();

        BrandForDetailDto dto = new BrandForDetailDto();
        dto.setName(brand.getName());
        return dto;
    }
    @PostMapping
    //Brand X
    //BrandForAddDto
    public void add(@RequestBody BrandForAddDto brandForAddDto){
        //manuel mapping--> sonrasında Auto Mapping çeviricez
        Brand brand =new Brand();
        brand.setName(brandForAddDto.getName());

      brandRepository.save(brand);
    }
    @PutMapping
    public void update (@RequestBody Brand brand){
        brandRepository.save(brand);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        // Brand brandToDelete = brandRepository.findById(id).orElseThrow();
        //brandRepository.delete(brandToDelete);
        brandRepository.deleteById(id);
    }
}
