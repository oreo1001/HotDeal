package HotDeal.HotDeal.Repository;

import HotDeal.HotDeal.Domain.Product;
import HotDeal.HotDeal.Domain.Product2;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductsRepository2 extends MongoRepository<Product2, String> {

    List<Product2> findByName(String name);
    List<Product2> findAll();
}