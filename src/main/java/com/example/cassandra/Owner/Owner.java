package com.example.cassandra.Owner;

import com.example.cassandra.pet.Pet;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Set;
import java.util.UUID;

@Getter
@RequiredArgsConstructor
public class Owner {

    private final UUID id;
    private final String firstName;
    private final String lastName;
    private final String address;
    private final String city;
    private final String telephone;
    private final Set<Pet> pets;
}
