package com.example.cassandra.pet;

import com.example.cassandra.Owner.Owner;
import com.example.cassandra.visit.Visit;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
public class Pet {

    private UUID id;
    private String name;
    private String birthDate;
    private PetType type;
    private Owner owner;
    private Set<Visit> visits;

    public Pet() {}

    public Pet(UUID id) {
        this.id = id;
    }
}
