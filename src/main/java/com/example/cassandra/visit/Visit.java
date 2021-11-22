package com.example.cassandra.visit;

import com.example.cassandra.pet.Pet;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Getter
@RequiredArgsConstructor
public class Visit {

    private final UUID id;
    private final String date;
    private final String description;
    private final Pet pet;
}
