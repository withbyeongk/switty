package ds.switty.product.service;

import ds.switty.product.dto.ProductDetail;
import ds.switty.product.entity.Product;
import ds.switty.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public List<Product> searchProduct(ProductDetail detail) {
        return null;
    }

    @Override
    @Transactional
    public boolean addProduct(ProductDetail detail) {
        //productType의 타입은 상품이기 때문에 D
        //state : 심사상태 이전이기 때문에 N

        char productType = 'D';
        char state = 'N';

        //createdAt은 추후에 수정할 예정
        LocalDateTime createdAt = LocalDateTime.now();

        Product product = Product.builder()
                .productId(detail.getProductId())
                .userId(detail.getUserId())
                .productNm(detail.getProductNm())
                .content(detail.getContent())
                .quantity(detail.getQuantity())
                .count(detail.getCount())
                .state(detail.getState())
                .banYn(detail.getBanYn())
                .updatedAt(detail.getUpdatedAt())
                .createdAt(detail.getCreatedAt())
                .build();

        productRepository.save(product);
        return true;
    }

    @Override
    public boolean updateProduct(ProductDetail detail) {
        return false;
    }

    @Override
    public boolean deleteProduct(ProductDetail detail) {
        return false;
    }
}
