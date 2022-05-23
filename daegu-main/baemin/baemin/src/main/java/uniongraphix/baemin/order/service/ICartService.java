package uniongraphix.baemin.order.service;

import uniongraphix.baemin.order.dto.CartDto;
import uniongraphix.baemin.order.entity.Cart;

import java.util.List;

public interface ICartService {
    Cart addCart(CartDto cartDto);
    List<Cart> getAll();
}
