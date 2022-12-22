package HotDeal.HotDeal.Repository;

import HotDeal.HotDeal.Domain.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<Category, String> {

}
