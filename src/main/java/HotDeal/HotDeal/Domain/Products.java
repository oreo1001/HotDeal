package HotDeal.HotDeal.Domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "products")
public class Products {

    private String id;
}
