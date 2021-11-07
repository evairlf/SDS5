package com.feldmann.dsvendas.repositories;

import com.feldmann.dsvendas.entities.Seller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller , Long> {
    
}
