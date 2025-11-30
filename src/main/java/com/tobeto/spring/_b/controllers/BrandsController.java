package com.tobeto.spring._b.controllers;

import com.tobeto.spring._b.entities.Brand;
import com.tobeto.spring._b.services.abstracts.BrandService;
import com.tobeto.spring._b.services.dtos.requests.brand.AddBrandRequest;
import com.tobeto.spring._b.services.dtos.responses.brand.GetBrandListResponse;
import com.tobeto.spring._b.services.dtos.responses.brand.GetBrandResponse;
<<<<<<< HEAD
import jakarta.validation.Valid;
=======
>>>>>>> 9a9bd79cfb6f648d705bb65f8b056401950aba11
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

    public void add(@RequestBody @Valid AddBrandRequest request)
    {
        this.brandService.add(request);
    }

    @GetMapping()
    public List<GetBrandListResponse> getByName(@RequestParam String name, @RequestParam int id)
    {
      return this.brandService.getByName(name,id);
    }
    @GetMapping("search")
    public List<GetBrandListResponse> search(@RequestParam String name){

       return this.brandService.search(name);
    }


}