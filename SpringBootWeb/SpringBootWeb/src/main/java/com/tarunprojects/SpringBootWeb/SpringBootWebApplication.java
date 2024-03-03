package com.tarunprojects.SpringBootWeb;


import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootWebApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootWebApplication.class, args);

		ProductService service = context.getBean(ProductService.class);

		List<Product> products = service.getAllProducts();
		for(Product p : products){
			System.out.println(p);
		}
	}

}
