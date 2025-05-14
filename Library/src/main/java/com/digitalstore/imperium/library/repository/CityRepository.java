package com.digitalstore.imperium.library.repository;

import com.digitalstore.imperium.library.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
}
