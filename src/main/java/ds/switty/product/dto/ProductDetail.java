package ds.switty.product.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class ProductDetail {

    private Long productId;
    private String userId;
    private String productNm;
    private char productType;
    private String content;
    private Long quantity;
    private Long count;
    private char state;
    private char banYn;
    private Date updatedAt;
    private Date createdAt;

}
