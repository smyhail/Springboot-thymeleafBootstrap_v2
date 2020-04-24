package com.sub.SpringbootthymeleafBootstrap.repositories;

import com.sub.SpringbootthymeleafBootstrap.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
