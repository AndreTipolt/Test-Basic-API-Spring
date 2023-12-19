package tipolt.andre.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tipolt.andre.backend.models.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Long>{
    
}
