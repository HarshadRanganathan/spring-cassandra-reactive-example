package com.example.cassandra.utils;

import com.example.cassandra.db.VisitEntity;
import com.example.cassandra.pet.Pet;
import com.example.cassandra.visit.Visit;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MappingUtils {

    private static DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    protected static String localDate2String(LocalDate source) {
        return FORMATTER.format(source);
    }

    public static Visit mapEntityAsVisit(VisitEntity visitEntity) {
        return Visit.builder()
                .id(visitEntity.getVisitId())
                .description(visitEntity.getDescription())
                .date(localDate2String(visitEntity.getVisitDate()))
                .pet(new Pet(visitEntity.getPetId()))
                .build();
    }
}
