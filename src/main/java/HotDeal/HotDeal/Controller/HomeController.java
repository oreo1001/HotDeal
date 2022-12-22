package HotDeal.HotDeal.Controller;

import HotDeal.HotDeal.Domain.Product2;
import HotDeal.HotDeal.Repository.ProductsRepository2;
import HotDeal.HotDeal.Service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("home")
@RequiredArgsConstructor
public class HomeController {

    private final HomeService homeService;

    @GetMapping("test")
    public String test() {
        return "테스트입니다1=123123123";
    }

    @GetMapping("test2")
    public String test2() { return "깃헙 텍스트"; }

    @PostMapping("insert")
    public String insertTest(@RequestBody Map<String, Object> map) {
        return homeService.insertTest((String) map.get("name"));
    }
}
