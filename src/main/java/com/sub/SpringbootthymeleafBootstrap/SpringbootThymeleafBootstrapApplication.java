package com.sub.SpringbootthymeleafBootstrap;

import com.sub.SpringbootthymeleafBootstrap.entities.Country;
import com.sub.SpringbootthymeleafBootstrap.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootThymeleafBootstrapApplication implements CommandLineRunner {

	@Autowired
	private CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootThymeleafBootstrapApplication.class, args);
	}

	@Override
	public void run( String[] args) throws Exception{

		countryRepository.save( new Country("Earth", "World") );
		countryRepository.save( new Country("China", "Pekin") );
		countryRepository.save( new Country("German", "Berlin") );
		countryRepository.save( new Country("USA", "Washington") );
		countryRepository.save( new Country("Russia", "Moscow") );
		countryRepository.save( new Country("Nambia", "Windhoek") );
		countryRepository.save( new Country("Indie", "New Delhi") );
		countryRepository.save( new Country("North Korea", "Pyongyang") );
		countryRepository.save( new Country("Kenya", "Nairobi") );
		countryRepository.save( new Country("Canada", "Ottawa") );
		countryRepository.save( new Country("Jamaica", "Kingston") );
		countryRepository.save( new Country("Brazil", "Brasilia") );
		countryRepository.save( new Country("Egypt", "Cairo") );
		countryRepository.save( new Country("Czech Republic", "Prague") );
		countryRepository.save( new Country("Slovakia", "Bratislava") );
		countryRepository.save( new Country("Spain", "Madrid") );

	}

}
