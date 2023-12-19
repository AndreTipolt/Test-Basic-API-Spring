package tipolt.andre.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tipolt.andre.backend.dtos.ProductDTO;
import tipolt.andre.backend.models.CategoryModel;
import tipolt.andre.backend.models.ProductModel;
import tipolt.andre.backend.repositories.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryService categoryService;

    public List<ProductModel> findAllProducts(){

        return productRepository.findAll();
    }

    public ProductModel findProductById(Long id){

        return productRepository.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public void saveProduct(ProductDTO productDTO) {

        CategoryModel category = categoryService.findCategoryById(productDTO.getCategoryId());


        ProductModel newProduct = new ProductModel();

        newProduct.setName(productDTO.getName());
        newProduct.setCategory(category);
        newProduct.setFowardPrice(productDTO.getFowardPrice());
        newProduct.setSpotPrice(productDTO.getSpotPrice());

        productRepository.save(newProduct);
    }
}
