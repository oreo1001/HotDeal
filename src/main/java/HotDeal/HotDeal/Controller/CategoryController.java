package HotDeal.HotDeal.Controller;

import HotDeal.HotDeal.Service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("category")
@RequiredArgsConstructor
public class CategoryController {

    private final ProductService productService;


    @GetMapping("all")
    public ResponseEntity<Map<String, Object>> getAllProducts() {
        return productService.getAllProducts();
    }


    /*
    @GetMapping("{categoryName}/list")
    public ResponseEntity<Map<String, Object>> getCategoryList (@PathVariable String categoryName) {

    }
    TODO
    */


    /*
    @GetMapping("category/name")
    public ResponseEntity<Map<String, Object>> getCategoryNames() {

    }
    TODO
    */

}
