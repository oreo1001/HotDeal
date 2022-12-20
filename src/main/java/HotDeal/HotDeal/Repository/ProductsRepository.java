package HotDeal.HotDeal.Repository;

import HotDeal.HotDeal.Domain.Products;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductsRepository extends MongoRepository<Products, String> {
}
