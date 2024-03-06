package com.tarunprojects.SpringBootWeb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

    
    @GetMapping("/getProductById/{id}")
    public Product getProduct(@PathVariable int id) {
        return service.getProduct(id);
    }
    
    @PostMapping("/addProduct")
    public void addProduct(@RequestBody Product p){
        service.addProduct(p);
    }
    
    } 


