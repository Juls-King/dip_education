package uniongraphix.baemin.product.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import uniongraphix.baemin.product.entity.Product;
import uniongraphix.baemin.product.service.IProductService;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api")
@RequiredArgsConstructor
public class ProductController {

    private final IProductService iProductService;

    @PostMapping("/product/add")
    public Product addProduct(@RequestBody Product product){
        iProductService.addProduct(product);
        log.info("{}",product);
        return product;
    }

    @GetMapping("/product/getall")
    public List<Product> getAll(){
        return iProductService.getAll();
    }

}
