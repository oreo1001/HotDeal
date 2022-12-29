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
    //test

    private final ProductService productService;
    private final CategoryService categoryService;

    @GetMapping("test")
    public  ResponseEntity<String> test() {
        return ResponseEntity.ok("Deploy Success");
    }

    @PostMapping("save")
    public ResponseEntity<Map<String, Object>> saveCategory(@RequestBody @Valid Category category) {
        return categoryService.saveCategory(category);
    }

    @GetMapping("{categoryName}/list")
    public ResponseEntity<Map<String, Object>> getProductsByCategory(@PathVariable("categoryName") String categoryName) {
        if (categoryName.equals("all")) return productService.getAllProducts();
        else return productService.getProductsByCategoryName(categoryName);
    }

    @PostMapping("{categoryId}/click")
    public ResponseEntity<Map<String, Object>> clickCategory(@PathVariable String categoryId) {
        return categoryService.clickCategory(categoryId);
    }

}
