package com.feldmann.dsvendas.controller;

import java.util.List;

import com.feldmann.dsvendas.DTO.SellerDTO;
import com.feldmann.dsvendas.service.SellerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {

    @Autowired
    private SellerService service;
    
    @GetMapping
    public ResponseEntity<List<SellerDTO>> findAll(){
        List<SellerDTO> list = service.findAll();
        return ResponseEntity.ok(list);
    }


}
