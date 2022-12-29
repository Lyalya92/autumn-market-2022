package ru.geekbrains.autumn_market.converters;

import org.springframework.stereotype.Component;
import ru.geekbrains.autumn_market.dtos.CartItemDto;
import ru.geekbrains.autumn_market.utils.CartItem;

@Component
public class CartItemConverter {

    public CartItemDto entityToDto(CartItem cartItem) {
       return new CartItemDto(cartItem.getProductId(), cartItem.getProductTitle(), cartItem.getQuantity(),
                                cartItem.getPricePerProduct(), cartItem.getPriceTotal());
    }

}
