package ds.switty.product.repository;

import ds.switty.product.entity.Product;
import ds.switty.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface ProductRepository extends JpaRepository<Product, Long>, QueryByExampleExecutor<Product> {


}
