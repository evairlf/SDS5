package com.feldmann.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import com.feldmann.dsvendas.DTO.SellerDTO;
import com.feldmann.dsvendas.entities.Seller;
import com.feldmann.dsvendas.repositories.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {

@Autowired
private SellerRepository repository;

public List<SellerDTO> findAll(){
    List<Seller> result = repository.findAll();
    return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
}

}