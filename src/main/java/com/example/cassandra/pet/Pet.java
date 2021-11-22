package com.example.cassandra.pet;

import com.example.cassandra.Owner.Owner;
import com.example.cassandra.visit.Visit;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Set;
import java.util.UUID;

@Getter
@RequiredArgsConstructor
public class Pet {

    private final UUID id;
    private final String name;
    private final String birthDate;
    private final PetType type;
    private final Owner owner;
    private final Set<Visit> visits;
}
