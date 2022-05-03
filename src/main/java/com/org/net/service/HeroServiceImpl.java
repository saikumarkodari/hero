package com.org.net.service;

import com.org.net.model.Hero;
import com.org.net.repository.HeroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeroServiceImpl implements HeroService{
    @Autowired
    HeroRepo heroRepo;

    @Override
    public void createHero(Hero hero) {
        heroRepo.save(hero);

    }
}
