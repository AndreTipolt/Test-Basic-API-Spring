package tipolt.andre.backend.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tipolt.andre.backend.models.CategoryModel;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryModel, Long>{
    
}
