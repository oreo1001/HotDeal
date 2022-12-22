package HotDeal.HotDeal.Service;

import HotDeal.HotDeal.Domain.Product;
import HotDeal.HotDeal.Repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ResponseEntity<Map<String, Object>> insert(Product product){
        Map<String, Object> responseJson = new HashMap<>();
        responseJson.put("Message", "product db에 잘들어간듯!");
        productRepository.insert(product);
        return ResponseEntity.status(HttpStatus.OK).body(responseJson);
    }
    public ResponseEntity<Map<String, Object>> getAllProducts() {
        // TODO key : "result" / value : "모든 제품들 배열"
        Map<String, Object> responseJson = new HashMap<>();
        responseJson.put("result",productRepository.findAll());
        return ResponseEntity.status(HttpStatus.OK).body(responseJson);
    }

    /*
    public ResponseEntity<Map<String, Object>> getProductByCategory(String Category){

    }
    */
}
