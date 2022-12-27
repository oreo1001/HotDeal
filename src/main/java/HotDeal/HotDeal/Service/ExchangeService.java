package HotDeal.HotDeal.Service;

import HotDeal.HotDeal.Domain.ExchangeRate;
import HotDeal.HotDeal.Repository.ExchangeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ExchangeService {

    private final ExchangeRepository exchangeRepository;

    public ResponseEntity<Map<String, Object>> getAllExchangeRate() {

        Map<String, Object> responseJson = new HashMap<>();
        ExchangeRate exchangeRate;

        List<ExchangeRate> exchangeRates = exchangeRepository.findAll();

        if (exchangeRates.isEmpty()) {
            responseJson.put("errorMessage", "DB에 환율 정보가 없습니다");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseJson);
        } else {
            responseJson.put("result", exchangeRates); //Product 페이지 정보를 가져온다. (link 가져오고 상품디테일)
            return ResponseEntity.status(HttpStatus.OK).body(responseJson);
        }
    }
}
