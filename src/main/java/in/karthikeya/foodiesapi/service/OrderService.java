package in.karthikeya.foodiesapi.service;

import in.karthikeya.foodiesapi.io.OrderResponse;

import java.util.List;
import java.util.Map;

import com.razorpay.RazorpayException;

import in.karthikeya.foodiesapi.io.OrderRequest;


public interface OrderService {
    
    OrderResponse createOrderWithPayment(OrderRequest request) throws RazorpayException;

    void verifyPayment(Map<String, String> paymentData, String status);

    List<OrderResponse> getUserOrders();

    void removeOrder(String orderId);

    List<OrderResponse> getOrdersOfAllUsers();

    void updateOrderStatus(String orderId, String status);

}
