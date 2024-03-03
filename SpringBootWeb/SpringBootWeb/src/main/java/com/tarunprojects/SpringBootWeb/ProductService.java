package com.tarunprojects.SpringBootWeb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {

    @Autowired
    ProductDB db;
    
    public List<Product> getAllProducts(){
        return db.findAll();
    }
}
