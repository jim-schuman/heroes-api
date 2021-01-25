package com.allata.tourofheroes.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class HeroCharacter {

    public HeroCharacter() {
    }

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank(message = "May not be blank")
    private String name;

    private String description;

    @NotBlank(message = "May not be blank")
    private String alignment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public HeroCharacter(Long id, String name, String description, String alignment) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.alignment = alignment;
    }




}

// "id": 1,
//         "name": "Aslaug",
//         "description": "Warrior Queen",
//         "alignment": "hero",
//         "spells":[1,2,3,6,7],
//         "skills":[1,2,3],
//         "weapons":[10]
