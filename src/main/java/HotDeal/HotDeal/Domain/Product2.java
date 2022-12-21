package HotDeal.HotDeal.Domain;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "products")
public class Product2 {
    /**
    public Product2(String productId, String name, int price, String category) {
        this.productId= productId;
        this.name = name;
        this.price = price;
        this.category = category;
    }**/
    @Id
    private String id;
    //private String productId;
    private String name;
    private int price;
    private String category;
}
