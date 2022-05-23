package uniongraphix.baemin.order.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import uniongraphix.baemin.order.dto.CartDto;
import uniongraphix.baemin.order.entity.Cart;
import uniongraphix.baemin.order.service.ICartService;

import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
@RequiredArgsConstructor
public class CartController {

    private final ICartService iCartService;

    @PostMapping("/cart/add")
    public Cart addCart(@RequestBody CartDto cartDto){
        return iCartService.addCart(cartDto);
    }

    @GetMapping("/cart/getall")
    public List<Cart> getAll(){
        return iCartService.getAll();
    }

}
