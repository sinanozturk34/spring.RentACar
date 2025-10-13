package com.tobeto.spring._b.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//Kullanıcın brand eklemek istedignde kullanacıgı model
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BrandForAddDto {
    private String name;
    
}
