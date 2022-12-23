package HotDeal.HotDeal.Controller;

import HotDeal.HotDeal.Domain.Category;
import HotDeal.HotDeal.Service.CategoryService;
import HotDeal.HotDeal.Service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @GetMapping("{categoryName}/list")
    public ResponseEntity<Map<String, Object>> getCategoryList (@PathVariable("categoryName") String categoryName) {
        return productService.getProductByCategory(categoryName);
    }

    @PostMapping("save")
    public ResponseEntity<Map<String,Object>> saveCategory(@RequestBody @Valid Category category) {
        return categoryService.saveCategory(category);
    }

    @GetMapping("name")
    public ResponseEntity<Map<String, Object>> getCategoryNames() {
        return categoryService.getAllCategory();
    }
}
