package uniongraphix.baemin.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uniongraphix.baemin.product.entity.Product;

public interface IProductRepository extends JpaRepository<Product, Long> {
}
