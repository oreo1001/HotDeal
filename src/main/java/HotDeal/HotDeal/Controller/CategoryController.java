package HotDeal.HotDeal.Controller;

import HotDeal.HotDeal.Domain.Category;
import HotDeal.HotDeal.Service.CategoryService;
import HotDeal.HotDeal.Service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("category")
@RequiredArgsConstructor
public class CategoryController {

    private final ProductService productService;
    private final CategoryService categoryService;


    @GetMapping("all")
    public ResponseEntity<Map<String, Object>> getAllProducts() {
        return productService.getAllProducts();
    }


    /*
    @GetMapping("{categoryName}/list")
    public ResponseEntity<Map<String, Object>> getCategoryList (@PathVariable String categoryName) {
        return productService.get
    }
    TODO
    */

    @PostMapping("insert")
    public ResponseEntity<Map<String,Object>> insertCategory(@RequestBody Category category) {
        return categoryService.insert(category);
    }
    /*
    @GetMapping("category/name")
    public ResponseEntity<Map<String, Object>> getCategoryNames() {

    }
    TODO
    */

}
