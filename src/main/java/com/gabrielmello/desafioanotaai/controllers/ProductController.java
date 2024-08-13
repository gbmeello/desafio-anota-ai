package com.gabrielmello.desafioanotaai.controllers;


import com.gabrielmello.desafioanotaai.domain.category.Category;
import com.gabrielmello.desafioanotaai.domain.category.CategoryDTO;
import com.gabrielmello.desafioanotaai.domain.product.Product;
import com.gabrielmello.desafioanotaai.domain.product.ProductDTO;
import com.gabrielmello.desafioanotaai.services.CategoryService;
import com.gabrielmello.desafioanotaai.services.ProductService;
import jakarta.websocket.server.PathParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private ProductService service;

    public ProductController(ProductService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Product> insert(@RequestBody ProductDTO productData){
        Product newProduct = this.service.insert(productData);
        return ResponseEntity.ok().body(newProduct);
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAll(){
        List<Product> products = this.service.getAll();
        return ResponseEntity.ok().body(products);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> update(@PathVariable("id") String id, @RequestBody ProductDTO productData){
        Product updateProduct = this.service.update(id, productData);
        return ResponseEntity.ok().body(updateProduct);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Product> delete(@PathVariable("id") String id){

        this.service.delete(id);
        return ResponseEntity.noContent().build();

    }
}
