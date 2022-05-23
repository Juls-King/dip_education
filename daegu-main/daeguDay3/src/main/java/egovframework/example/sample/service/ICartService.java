package egovframework.example.sample.service;

import java.util.List;

public interface ICartService {

    void addCart(CartVO cartVO);
    List<?> getAllCart();

}
