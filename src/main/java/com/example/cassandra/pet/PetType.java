package com.example.cassandra.pet;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PetType {

    private final String id;
    private final String name;
}
