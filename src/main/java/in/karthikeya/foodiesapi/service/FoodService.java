package in.karthikeya.foodiesapi.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import in.karthikeya.foodiesapi.io.FoodRequest;
import in.karthikeya.foodiesapi.io.FoodResponse;

public interface FoodService {
    
    String uploadFile(MultipartFile file);

    FoodResponse addFood(FoodRequest request, MultipartFile file);

    List<FoodResponse> readFoods();

    FoodResponse readFood(String id);

    boolean deleteFile(String filename);

    void deleteFood(String id);
}
