package com.titoskitchenexample.titoskitchenservice.controllers;

import com.titoskitchenexample.titoskitchenservice.models.MainMeal;
import com.titoskitchenexample.titoskitchenservice.models.Starter;
import com.titoskitchenexample.titoskitchenservice.repositories.MainMealRepository;
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
public class MainMealController {
    @Autowired
    MainMealRepository mainMealRepository;

    @CrossOrigin
    @GetMapping(value="/mains")
    public ResponseEntity<List<MainMeal>> getAllMains(){
        List<MainMeal> foundMains = mainMealRepository.findAll();
        return new ResponseEntity<>(foundMains, HttpStatus.OK);
    }

    @GetMapping(value = "/mains/{id}")
    public ResponseEntity getMains(@PathVariable Long id){
        Optional<MainMeal> foundMain= mainMealRepository.findById(id);
        return new ResponseEntity<>(foundMain, HttpStatus.OK);
    }
}
