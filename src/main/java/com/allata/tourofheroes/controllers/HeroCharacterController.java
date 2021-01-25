package com.allata.tourofheroes.controllers;

import com.allata.tourofheroes.models.HeroCharacter;
import com.allata.tourofheroes.repo.HeroCharacterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping( value = "/characters")
public class HeroCharacterController {

    @Autowired
    private HeroCharacterRepo characterRepo;

    @GetMapping
    public List<HeroCharacter> findAll() {
        return characterRepo.findAll();
    }

    @PostMapping
    public HeroCharacter save(@Valid @NotNull @RequestBody HeroCharacter heroCharacter) {
        return characterRepo.save(heroCharacter);
    }

    @PutMapping
    public HeroCharacter update(@Valid @NotNull @RequestBody HeroCharacter heroCharacter) {
        return characterRepo.save(heroCharacter);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        characterRepo.deleteById(id);
    }

}
