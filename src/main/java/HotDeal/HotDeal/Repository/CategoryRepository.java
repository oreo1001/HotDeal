package HotDeal.HotDeal.Repository;

import HotDeal.HotDeal.Domain.Category;
import HotDeal.HotDeal.Domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CategoryRepository extends MongoRepository<Category, String> {
    //List<Product> findByCategoryName(String categoryName);
}
