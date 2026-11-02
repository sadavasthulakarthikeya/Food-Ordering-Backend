package in.karthikeya.foodiesapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import in.karthikeya.foodiesapi.entity.FoodEntity;

@Repository
public interface FoodRepository extends MongoRepository<FoodEntity, String>{
    
}
