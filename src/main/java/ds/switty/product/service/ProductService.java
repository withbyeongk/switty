package ds.switty.product.service;

import ds.switty.product.dto.ProductDetail;
import ds.switty.product.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll(); //모든 경매상품 조회

    List<Product> searchProduct(ProductDetail detail); //특정 경매상품 조회

    boolean addProduct(ProductDetail detail); // 경매상품 등록

    boolean updateProduct(ProductDetail detail); //경매상품 수정

    boolean deleteProduct(ProductDetail detail);//경매상품 삭제

}