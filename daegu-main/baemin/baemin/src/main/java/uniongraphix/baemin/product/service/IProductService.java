package uniongraphix.baemin.product.service;

import uniongraphix.baemin.product.entity.Product;

import java.util.List;

public interface IProductService {
    Product addProduct(Product product);
    List<Product> getAll();
    Product getProductById(Long id);
}
