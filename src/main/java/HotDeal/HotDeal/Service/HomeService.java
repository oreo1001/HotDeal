package HotDeal.HotDeal.Service;

import HotDeal.HotDeal.Domain.Product;
import HotDeal.HotDeal.Repository.ProductsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HomeService {

    private final ProductsRepository productsRepository;

    public String insertTest(String productId) {
        Product product = new Product();
        product.setName(productId);

        productsRepository.insert(product);
        List<Product> productList = productsRepository.findByName(productId);

        return productList.toString();
    }
}
