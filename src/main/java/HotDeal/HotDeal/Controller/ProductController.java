package HotDeal.HotDeal.Controller;

import HotDeal.HotDeal.Domain.Product2;
import HotDeal.HotDeal.Repository.ProductsRepository2;
import HotDeal.HotDeal.Service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("insert")
    public void insertTest(@RequestBody Map<String, Object> map) {
        productService.insertTest((String) map.get("name"));
    }

    @GetMapping("find")
    public List<Product2> findTest() {
        return productService.findList();
    }

    @GetMapping("find2")
    public List<Product2> findTest2() {
        return productService.findList2();
    }
}
