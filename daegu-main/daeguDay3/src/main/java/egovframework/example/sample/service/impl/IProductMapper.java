package egovframework.example.sample.service.impl;

import egovframework.example.sample.service.ProductVO;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import java.util.List;

@Mapper(value = "prouctMapper")
public interface IProductMapper {

    void addProduct(ProductVO productVO);
    List<?> getAllProduct();
    ProductVO getProductById(Long id);

}
