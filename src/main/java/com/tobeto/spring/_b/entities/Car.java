package com.tobeto.spring._b.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="cars")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car
{
  @Id
  @Column(name="id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name="model_year")
  private int modelYear;

  @Column(name="model_name")
  private String modelName;

  @ManyToOne
  @JoinColumn(name = "brand_id")
  private Brand brand;

}
