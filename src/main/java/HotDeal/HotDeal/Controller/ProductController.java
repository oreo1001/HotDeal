package HotDeal.HotDeal.Controller;

import HotDeal.HotDeal.Domain.Product;
import HotDeal.HotDeal.Service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@RestController
@RequestMapping("product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("insert")
    public ResponseEntity<Map<String,Object>> insertProduct (@RequestBody @Valid Product product){
        return productService.insert(product);
    }

    @PostMapping("{productId}/click")
    public ResponseEntity<Map<String, Object>> clickProduct (@PathVariable String productId) {
        return productService.clickCount(productId);
    }
}
