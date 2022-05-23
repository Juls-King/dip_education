package uniongraphix.baemin.product.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import uniongraphix.baemin.product.entity.Product;
import uniongraphix.baemin.product.repository.IProductRepository;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductServiceImple implements IProductService{

    private final IProductRepository iProductRepository;

    @Override
    public Product addProduct(Product product) {
        iProductRepository.save(Product.builder()
                .productName(product.getProductName())
                .price(product.getPrice())
                .build());
        return product;
    }

    @Override
    public List<Product> getAll() {
        return iProductRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return iProductRepository.findById(id).get();
    }
}
