package com.feldmann.dsvendas.repositories;

import com.feldmann.dsvendas.entities.Sale;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale , Long> {
    
}
