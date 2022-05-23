package egovframework.example.sample.service;

import java.util.List;

public interface IProductService {

    void addProduct(ProductVO productVO);
    List<?> getAllProduct();
    ProductVO getProductById(Long id);
}
