package ru.geekbrains.autumn_market.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class CartItem {

    private Long productId;
    private String productTitle;
    private int quantity;
    private BigDecimal pricePerProduct;
    private BigDecimal priceTotal;

    public void changeQuantity(int delta) {
        quantity += delta;
        priceTotal = priceTotal.add(pricePerProduct.multiply(new BigDecimal(delta)));
    }
}
