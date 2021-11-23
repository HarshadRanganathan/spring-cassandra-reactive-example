package com.example.cassandra.db;

import com.datastax.oss.driver.api.mapper.annotations.ClusteringColumn;
import com.datastax.oss.driver.api.mapper.annotations.CqlName;
import com.datastax.oss.driver.api.mapper.annotations.Entity;
import com.datastax.oss.driver.api.mapper.annotations.PartitionKey;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Getter
@Setter
@CqlName(VisitEntity.VISIT_TABLE)
public class VisitEntity {

    public static final String VISIT_TABLE           = "petclinic_visit_by_pet";
    public static final String VISIT_ATT_PET_ID      = "pet_id";
    public static final String VISIT_ATT_VISIT_ID    = "visit_id";
    public static final String VISIT_ATT_VISIT_DATE  = "visit_date";
    public static final String VISIT_ATT_DESCRIPTION = "description";

    @PartitionKey
    @CqlName(VISIT_ATT_PET_ID)
    private UUID petId;

    @ClusteringColumn
    @CqlName(VISIT_ATT_VISIT_ID)
    private UUID visitId;

    @CqlName(VISIT_ATT_VISIT_DATE)
    private LocalDate visitDate;

    @CqlName(VISIT_ATT_DESCRIPTION)
    private String description;

    public VisitEntity() {}

    public VisitEntity(UUID petId, UUID visitId) {
        this.petId = petId;
        this.visitId = visitId;
    }
}
