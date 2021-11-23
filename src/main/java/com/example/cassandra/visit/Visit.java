package com.example.cassandra.visit;

import com.example.cassandra.pet.Pet;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Builder
@RequiredArgsConstructor
public class Visit {

    private final UUID id;
    private final String date;
    private final String description;
    private final Pet pet;
}
