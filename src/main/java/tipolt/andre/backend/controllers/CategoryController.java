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
import tipolt.andre.backend.models.CategoryModel;
import tipolt.andre.backend.services.CategoryService;


@RestController
@RequestMapping(value = "/category")
@CrossOrigin(origins = "*")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<CategoryModel> findAllCategorys(){

        return categoryService.findAllCategorys();
    }

    @GetMapping(value = "/{id}")
    public CategoryModel findCategoryById(@PathVariable Long id){
        System.out.println(id);
        return categoryService.findCategoryById(id);
    }

    @PostMapping
    public void insertCategory(@RequestBody ProductDTO productDTO){

        categoryService.insertCategory(productDTO);
    }
}
