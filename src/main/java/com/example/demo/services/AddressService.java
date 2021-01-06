package com.example.demo.services;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;


@Service
public class AddressService {
    public StringBuilder findAdress(String adressNumber) throws IOException {
        URL url = new URL("http://viacep.com.br/ws/"+ adressNumber +"/json");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()));
        StringBuilder address = new StringBuilder();
        bufferedReader.lines().forEach(l -> address.append(l.trim()));
        return address;
    }
}
