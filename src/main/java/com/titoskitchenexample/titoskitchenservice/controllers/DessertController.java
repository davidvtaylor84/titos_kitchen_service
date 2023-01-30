package com.titoskitchenexample.titoskitchenservice.controllers;

import com.titoskitchenexample.titoskitchenservice.models.Dessert;
import com.titoskitchenexample.titoskitchenservice.models.MainMeal;
import com.titoskitchenexample.titoskitchenservice.repositories.DessertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Controller
public class DessertController {

    @Autowired
    DessertRepository dessertRepository;

    @CrossOrigin
    @GetMapping(value="/desserts")
    public ResponseEntity<List<Dessert>> getAllDesserts(){
        List<Dessert> foundDesserts = dessertRepository.findAll();
        return new ResponseEntity<>(foundDesserts, HttpStatus.OK);
    }

    @GetMapping(value = "/desserts/{id}")
    public ResponseEntity getDesserts(@PathVariable Long id){
        Optional<Dessert> foundDessert= dessertRepository.findById(id);
        return new ResponseEntity<>(foundDessert, HttpStatus.OK);
    }
}
