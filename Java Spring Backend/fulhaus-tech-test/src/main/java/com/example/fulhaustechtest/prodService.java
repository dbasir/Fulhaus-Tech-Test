package com.example.fulhaustechtest;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.fulhaustechtest.prodRepo;
import java.util.List;
import java.util.Optional;

public class prodService {

    @Autowired
    private prodRepo repository;

    public List<product> getproducts()
    {
        return repository.findAll();

    }

    public Optional<product> getAProductbyID(String id)
    {
        return repository.findById(id);
    }
}
