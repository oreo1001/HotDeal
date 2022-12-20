package HotDeal.HotDeal.Repository;

import HotDeal.HotDeal.Domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductsRepository extends MongoRepository<Product, String> {

    List<Product> findByName(String name);

}
