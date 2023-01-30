package com.titoskitchenexample.titoskitchenservice.repositories;

import com.titoskitchenexample.titoskitchenservice.models.Starter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StarterRepository extends JpaRepository<Starter, Long> {
}
