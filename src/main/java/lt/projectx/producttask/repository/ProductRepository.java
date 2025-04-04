package lt.projectx.producttask.repository;

import lt.projectx.producttask.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByDescriptionContainingIgnoreCase(String description);

}
//    Repozitorija komunikuoja su duomenu baze