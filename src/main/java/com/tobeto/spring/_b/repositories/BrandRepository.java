package com.tobeto.spring._b.repositories;

import com.tobeto.spring._b.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand,Integer>
{

}
