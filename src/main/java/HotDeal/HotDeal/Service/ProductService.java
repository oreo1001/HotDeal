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

    public ResponseEntity<Map<String, Object>> insert(Product product){
        Map<String, Object> responseJson = new HashMap<>();
        responseJson.put("Message", "product db에 잘들어간듯!");
        productRepository.insert(product);
        return ResponseEntity.status(HttpStatus.OK).body(responseJson);
    }
    public ResponseEntity<Map<String, Object>> getAllProducts() {
        Map<String, Object> responseJson = new HashMap<>();
        responseJson.put("result",productRepository.findAll());
        return ResponseEntity.status(HttpStatus.OK).body(responseJson);
    }

    public ResponseEntity<Map<String, Object>> getProductByCategory(String categoryName){
        Map<String, Object> responseJson = new HashMap<>();
        responseJson.put("result",productRepository.findByCategoryName(categoryName));
        return ResponseEntity.status(HttpStatus.OK).body(responseJson);
    }

    public ResponseEntity<Map<String, Object>> clickCount(String productId){
        //id는 겹칠 수 없으므로 (기본키) 한 페이지만 나온다.
        Map<String, Object> responseJson = new HashMap<>();
        Product product;

        if (productRepository.findById(productId).isEmpty()) {
            responseJson.put("errorMessage", "productId = " + productId + "를 가지는 product가 없습니다");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseJson);
        } else product = productRepository.findById(productId).get();
        product.setClick(product.getClick()+1);
        //productRepository.save("click");
        //ToDo 이거 db에 어떻게 반영하징?
        responseJson.put("result", product.getLink()); //Product 페이지 link를 가져온다.

        return ResponseEntity.status(HttpStatus.OK).body(responseJson);
    }
}
