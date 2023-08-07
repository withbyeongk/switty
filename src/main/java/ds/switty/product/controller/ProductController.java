package ds.switty.product.controller;

import ds.switty.product.dto.ProductDetail;
import ds.switty.product.entity.Product;
import ds.switty.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;


    //상품 조회
    //@GetMapping("/read")


    //상품 등록
    @PostMapping("/add")
    public String addProduct(ProductDetail detail){

        boolean result = productService.addProduct(detail);

        if ( result ){
            log.info("product :: add :: success");
            return "redirect:/product/list";
        } else {
            log.info("product :: add :: fail");
            return "redirect:addProduct";
        }
    }


    //상품 수정
    //@PatchMapping("/update")


    //상품 삭제
    //@DeleteMapping("/delete")



}
