package com.tobeto.spring._b.repositories;

import com.tobeto.spring._b.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand,Integer>
{
     List<Brand> findByNameLikeOrIdEquals(String name,int id);
}
