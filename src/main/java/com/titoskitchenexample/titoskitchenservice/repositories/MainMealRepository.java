package com.titoskitchenexample.titoskitchenservice.repositories;

import com.titoskitchenexample.titoskitchenservice.models.MainMeal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainMealRepository extends JpaRepository<MainMeal, Long> {
}
