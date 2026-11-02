package in.karthikeya.foodiesapi.service;

import in.karthikeya.foodiesapi.io.UserRequest;
import in.karthikeya.foodiesapi.io.UserResponse;

public interface UserService {
    
    UserResponse registerUser(UserRequest request);

    String findByUserId();
}
