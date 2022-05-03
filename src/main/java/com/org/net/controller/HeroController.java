package com.org.net.controller;

import com.org.net.model.Hero;
import com.org.net.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class HeroController {

    @Autowired
    HeroService heroService;
    @PostMapping("/create")
    public void createHero(@RequestBody Hero hero){
        heroService.createHero(hero);
    }
}
