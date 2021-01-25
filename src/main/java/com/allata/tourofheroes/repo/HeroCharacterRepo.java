package com.allata.tourofheroes.repo;

import com.allata.tourofheroes.models.HeroCharacter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroCharacterRepo extends JpaRepository<HeroCharacter, Long> {
}
