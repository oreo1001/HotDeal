package HotDeal.HotDeal.Service;

import HotDeal.HotDeal.Domain.Product;
import HotDeal.HotDeal.Repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ResponseEntity<Map<String, Object>> saveProduct(Product product) {
        Map<String, Object> responseJson = new HashMap<>();
        responseJson.put("Message", "product db에 잘들어간듯!");
        productRepository.save(product);
        return ResponseEntity.status(HttpStatus.OK).body(responseJson);
    }

    public ResponseEntity<Map<String, Object>> getAllProducts() {
        Map<String, Object> responseJson = new HashMap<>();
        responseJson.put("result", productRepository.findAll());
        return ResponseEntity.status(HttpStatus.OK).body(responseJson);
    }

    public ResponseEntity<Map<String, Object>> getProductsByCategory(String categoryName) {
        Map<String, Object> responseJson = new HashMap<>();
        if (productRepository.findByCategoryName(categoryName) == null) {
            responseJson.put("result", productRepository.findByCategoryName(categoryName));
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseJson);
        //responseJson.put("result", productRepository.findByCategoryName(categoryName));
    }

    public ResponseEntity<Map<String, Object>> clickProduct(String productId) {
        //id는 겹칠 수 없으므로 (기본키) 한 페이지만 나온다.
        Map<String, Object> responseJson = new HashMap<>();
        Product product;

        if (productRepository.findById(productId).isEmpty()) {
            responseJson.put("errorMessage", "productId = " + productId + "를 가지는 product가 없습니다");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseJson);
        } else product = productRepository.findById(productId).get();
        plusCount(product);
        responseJson.put("result", product); //Product 페이지 정보를 가져온다. (link 가져오고 상품디테일)
        return ResponseEntity.status(HttpStatus.OK).body(responseJson);
    }

    public void plusCount(Product product){
        product.setClickCount(product.getClickCount() + 1);
        productRepository.save(product);
    }

    /*
    public ResponseEntity<Map<String, Object>> makeResponse(String message, Object object){
        Map<String, Object> responseJson = new HashMap<>();
        responseJson.put(message, object);
        return ResponseEntity.status(HttpStatus.OK).body(responseJson);
    }
    */
}
