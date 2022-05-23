package egovframework.example.sample.service.impl;

import egovframework.example.sample.service.CartVO;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import java.util.List;

@Mapper(value = "cartMapper")
public interface ICartMapper {

    void addCart(CartVO cartVO);
    List<CartDAO> getAllCart();

}
