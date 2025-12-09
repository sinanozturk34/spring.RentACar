package com.tobeto.spring._b.repositories;

import com.tobeto.spring._b.entities.Brand;
import com.tobeto.spring._b.services.dtos.responses.brand.GetBrandListResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
    List<Brand> findByNameLikeOrIdEquals(String name, int id);
    //aynı isimli name olma durumu,postgre bakar
    List<Brand> findByName(String name);

    boolean existsByName(String name);

    //sql d--> Select * from Brands;
    //JPQL--->@Query("SELECT b FROM Brand b")
    //@Query("SELECT b FROM Brand b Where b.name=:name")
    @Query("SELECT b FROM Brand b Where b.name LIKE %:name%")
    List<Brand> search(String name);

    @Query(value = "Select * from brands Where name LIKE %:name%", nativeQuery = true)
    List<Brand> search2(String name);

    @Query("SELECT new com.tobeto.spring._b.services.dtos.responses.brand.GetBrandListResponse(b.name) " +
    "FROM Brand b Where b.name LIKE %:name%")
    List<GetBrandListResponse> search3(String name);


}
