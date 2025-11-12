package org.codemonkie.bettywhite.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "jewelry")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Jewelry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private JewelryType jewelryType;
    private String material;
    private BigDecimal price;
    private Double weightInGrams;
    private String gemstone;
    private Boolean isHandmade;
    private LocalDate createdDate;
    private String originCountry;
}
