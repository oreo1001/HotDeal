package HotDeal.HotDeal.Controller;

import HotDeal.HotDeal.Dto.TestDto;
import HotDeal.HotDeal.Service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("home")
@RequiredArgsConstructor
public class HomeController {

    private final HomeService homeService;

    @GetMapping("test")
    public ResponseEntity<TestDto> test(@Valid @RequestBody TestDto testDto) {
        return ResponseEntity.status(HttpStatus.OK).body(testDto);
    }

}
