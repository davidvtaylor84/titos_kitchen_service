package com.titoskitchenexample.titoskitchenservice.repositories;

import com.titoskitchenexample.titoskitchenservice.models.Dessert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DessertRepository extends JpaRepository<Dessert, Long> {
}
