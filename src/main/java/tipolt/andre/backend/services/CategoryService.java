package tipolt.andre.backend.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tipolt.andre.backend.dtos.ProductDTO;
import tipolt.andre.backend.models.CategoryModel;
import tipolt.andre.backend.repositories.CategoryRepository;

@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepository categoryRepository;

    public List<CategoryModel> findAllCategorys(){

        return categoryRepository.findAll();
    }

    public CategoryModel findCategoryById(Long id){

        return categoryRepository.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public void insertCategory(ProductDTO productDTO) {

        CategoryModel categoryModel = new CategoryModel();

        categoryModel.setName(productDTO.getName());

        categoryRepository.save(categoryModel);
    }


}
