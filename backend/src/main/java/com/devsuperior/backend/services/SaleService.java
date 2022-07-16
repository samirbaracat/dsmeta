package com.devsuperior.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.backend.entities.Sale;
import com.devsuperior.backend.repositories.SaleRepository;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;
    
    public List<Sale> findSales() {
        return repository.findAll();
    }
}
