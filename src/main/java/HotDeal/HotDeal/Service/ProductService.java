package HotDeal.HotDeal.Service;

import HotDeal.HotDeal.Domain.Product2;
import HotDeal.HotDeal.Repository.ProductsRepository2;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductsRepository2 productsRepository2;

    public List<Product2> findList(){
        return productsRepository2.findByName("namu");
    }

    public List<Product2> findList2(){
        return productsRepository2.findAll();
    }

    public void insertTest(String productId) {
        Product2 product2 = new Product2();
        product2.setName(productId);
        productsRepository2.insert(product2);
    }
}
