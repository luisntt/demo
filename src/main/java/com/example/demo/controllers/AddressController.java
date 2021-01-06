package com.example.demo.controllers;

import com.example.demo.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/cep")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/{adressNumber}")
    public StringBuilder createMember(@PathVariable("adressNumber") String adressNumber) throws IOException {
        return addressService.findAdress(adressNumber);
    }
}
