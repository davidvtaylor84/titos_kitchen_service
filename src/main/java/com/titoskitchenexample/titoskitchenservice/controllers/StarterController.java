package com.titoskitchenexample.titoskitchenservice.controllers;

import com.titoskitchenexample.titoskitchenservice.models.Dessert;
import com.titoskitchenexample.titoskitchenservice.models.Starter;
import com.titoskitchenexample.titoskitchenservice.repositories.DessertRepository;
import com.titoskitchenexample.titoskitchenservice.repositories.StarterRepository;
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
public class StarterController {
    @Autowired
    StarterRepository starterRepository;

    @CrossOrigin
    @GetMapping(value="/starters")
    public ResponseEntity<List<Starter>> getAllStarters(){
        List<Starter> foundStarters = starterRepository.findAll();
        return new ResponseEntity<>(foundStarters, HttpStatus.OK);
    }

    @GetMapping(value = "/starters/{id}")
    public ResponseEntity getStarter(@PathVariable Long id){
        Optional<Starter> foundStarter= starterRepository.findById(id);
        return new ResponseEntity<>(foundStarter, HttpStatus.OK);
    }
}
