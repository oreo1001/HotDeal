package HotDeal.HotDeal.Service;

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

    public ResponseEntity<Map<String, Object>> getAllProducts() {
        Map<String, Object> responseJson = new HashMap<>();


        // TODO key : "result" / value : "모든 제품들 배열"


        return ResponseEntity.status(HttpStatus.OK).body(responseJson);
    }

}
