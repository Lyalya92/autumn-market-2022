package ru.geekbrains.autumn_market.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@Data
public class ProductDto {

    private  Long id;

    private String title;

    private BigDecimal price;

}
