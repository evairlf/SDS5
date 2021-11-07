package com.feldmann.dsvendas.service;



import java.util.List;

import com.feldmann.dsvendas.DTO.SaleDTO;
import com.feldmann.dsvendas.DTO.SaleSuccessDTO;
import com.feldmann.dsvendas.DTO.SaleSumDTO;
import com.feldmann.dsvendas.entities.Sale;
import com.feldmann.dsvendas.repositories.SaleRepository;
import com.feldmann.dsvendas.repositories.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        Page<Sale> result = repository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));
    }

   @Transactional(readOnly = true)
   public List<SaleSumDTO> amountGroupedBySeller() {
       return repository.amountGroupedBySeller();
   }

   @Transactional(readOnly = true)
   public List<SaleSuccessDTO> successGroupedBySeller() {
       return repository.successGroupedBySeller();
   }
}