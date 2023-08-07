package ds.switty.product.entity;

import jakarta.persistence.*;
import lombok.*;
import java.sql.Date;

@Entity
@Table(name = "SWT_PRODUCT")
@TableGenerator(name = "SWT_PRODUCT", table = "hibernate_sequences", pkColumnValue = "SWT_PRODUCT")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Product {

    @Id
    @Column(name = "PRODUCT_ID", length = 20)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SWT_PRODUCT")
    private Long productId;

    @Column(name = "USER_ID", length = 20)
    private String userId;

    @Column(name = "PRODUCT_NM", length = 20)
    private String productNm;

    @Column(name = "PRODUCT_TYPE", length = 1)
    private char productType;

    @Column(name = "CONTENT", length = 100)
    private String content;

    @Column(name = "QUANTITY", length = 5)
    private Long quantity;

    @Column(name = "COUNT", length = 20)
    private Long count;

    @Column(name = "STATE", length = 1)
    private char state;

    @Column(name = "BAN_YN", length = 1)
    private char banYn;

    @Column(name = "UPDATED_AT", length = 10)
    private Date updatedAt;

    @Column(name = "CREATED_AT", length = 10)
    private Date createdAt;

}
