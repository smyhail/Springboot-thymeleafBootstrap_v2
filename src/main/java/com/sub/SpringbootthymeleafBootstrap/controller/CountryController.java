package com.sub.SpringbootthymeleafBootstrap.controller;


import com.sub.SpringbootthymeleafBootstrap.entities.Country;
import com.sub.SpringbootthymeleafBootstrap.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.util.Optional;

;

@Controller
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;

    @SuppressWarnings("deprecation")
    @GetMapping("/")
   public String showPage(Model model, @RequestParam(defaultValue="0") int page) {
        model.addAttribute("dateTime", LocalDateTime.now());
        model.addAttribute("data", countryRepository.findAll(  PageRequest.of(page, 4)  ));
        model.addAttribute("currentPage", page);
        return "index";
    }

    @PostMapping("/save")
    public String save(Country c){
        countryRepository.save( c );
        return "redirect:/";
    }

    @GetMapping("/delate")
    public String deleteCountry(Integer id){
        countryRepository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/findOne")
    @ResponseBody
    public Optional<Country> findOne(Integer id){
        return countryRepository.findById( id);

    }


}
