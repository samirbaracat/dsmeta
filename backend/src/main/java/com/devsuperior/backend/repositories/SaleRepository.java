package com.devsuperior.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.backend.entities.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
    
}
