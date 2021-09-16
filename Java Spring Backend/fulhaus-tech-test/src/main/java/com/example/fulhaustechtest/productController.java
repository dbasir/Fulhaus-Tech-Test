package com.example.fulhaustechtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
public class productController {

    @Autowired prodService service;

    @GetMapping("https://main-api.fulhaus.com/fulhaus-tech-test/get-products")
    public ResponseEntity getProd()
    {
        return new ResponseEntity(service.getproducts());
    }

    @GetMapping("https://main-api.fulhaus.com/fulhaus-tech-test/get-products/{id}")
    public ResponseEntity getAProduct(@PathVariable("id") String id)
    {
        return new ResponseEntity(service.getAProductbyID(id));
    }

}
