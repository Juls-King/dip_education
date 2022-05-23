package uniongraphix.baemin.order.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import uniongraphix.baemin.order.dto.CartDto;
import uniongraphix.baemin.order.entity.Cart;
import uniongraphix.baemin.order.repository.ICartRepository;
import uniongraphix.baemin.product.entity.Product;
import uniongraphix.baemin.product.repository.IProductRepository;
import uniongraphix.baemin.product.service.IProductService;
import uniongraphix.baemin.user.dto.UserDto;
import uniongraphix.baemin.user.entity.User;
import uniongraphix.baemin.user.repository.IUserRepository;
import uniongraphix.baemin.user.service.IUserService;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CartServiceImple implements ICartService {

    private final IUserRepository iUserRepository;
    private final IProductRepository iProductRepository;
    private final ICartRepository iCartRepository;

    @Override
    public Cart addCart(CartDto cartDto) {
        User user = iUserRepository.findById(cartDto.getUserId()).get();
        Product product = iProductRepository.findById(cartDto.getProductId()).get();
        return iCartRepository.save(Cart.builder()
                        .user(user)
                        .product(product)
                .build());
    }

    @Override
    public List<Cart> getAll() {
        return iCartRepository.findAll();
    }
}
