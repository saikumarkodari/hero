package com.org.net.service;

import com.org.net.model.Hero;
import org.springframework.web.bind.annotation.RequestBody;

public interface HeroService {
    public void createHero( Hero hero);
}
