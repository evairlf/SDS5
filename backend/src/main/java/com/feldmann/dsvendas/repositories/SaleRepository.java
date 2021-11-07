package com.feldmann.dsvendas.repositories;


import java.util.List;

import com.feldmann.dsvendas.DTO.SaleSuccessDTO;
import com.feldmann.dsvendas.DTO.SaleSumDTO;
import com.feldmann.dsvendas.entities.Sale;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;




public interface SaleRepository extends JpaRepository<Sale , Long> {
    
    @Query("SELECT new com.feldmann.dsvendas.DTO.SaleSumDTO(obj.seller, SUM(obj.amount)) "
     + " FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.feldmann.dsvendas.DTO.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
     + " FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSuccessDTO> successGroupedBySeller();
}
