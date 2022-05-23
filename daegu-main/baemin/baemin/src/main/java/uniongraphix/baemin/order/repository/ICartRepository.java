package uniongraphix.baemin.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uniongraphix.baemin.order.entity.Cart;

public interface ICartRepository extends JpaRepository<Cart, Long> {
}
