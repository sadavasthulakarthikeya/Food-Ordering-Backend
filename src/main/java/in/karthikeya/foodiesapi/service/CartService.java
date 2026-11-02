package in.karthikeya.foodiesapi.service;

import in.karthikeya.foodiesapi.io.CartRequest;
import in.karthikeya.foodiesapi.io.CartResponse;

public interface CartService {
    
    CartResponse addToCart(CartRequest request);

    CartResponse getCart();

    void clearCart();

    CartResponse removeFromCart(CartRequest cartRequest);
}
