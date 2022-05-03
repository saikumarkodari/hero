package com.org.net.repository;

import com.org.net.model.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface HeroRepo extends JpaRepository<Hero,Integer> {
}
