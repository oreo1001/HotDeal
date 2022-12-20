package HotDeal.HotDeal.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
@RequiredArgsConstructor
public class HomeController {

    @GetMapping("test")
    public String test() {
        return "테스트입니다1=123123123";
    }

    @GetMapping("test2")
    public String test2() { return "깃헙 텍스트"; }

}
