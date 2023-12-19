package tipolt.andre.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tipolt.andre.backend.dtos.ProductDTO;
import tipolt.andre.backend.models.ProductModel;
import tipolt.andre.backend.services.ProductService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<ProductModel> findAllProducts(){

        return productService.findAllProducts();
    }

    @GetMapping(value = "/{id}")
    public ProductModel findProductById(@PathVariable Long id){

        return productService.findProductById(id);
    }

    @PostMapping
    public void saveProduct(@RequestBody ProductDTO productDTO) {
        
        productService.saveProduct(productDTO);
    }
    
}
