package com.example.cassandra.db;

import com.datastax.oss.driver.api.core.CqlIdentifier;
import com.datastax.oss.driver.api.mapper.annotations.DaoFactory;
import com.datastax.oss.driver.api.mapper.annotations.DaoKeyspace;
import com.datastax.oss.driver.api.mapper.annotations.Mapper;

/**
 * Top-level entry point to mapper features, that allows you to obtain DAO instances
 * Mapper allows you to initialize a mapper instance by wrapping a core driver session
 * The mapper should have the same lifecycle as the session in your application: created once at initialization time, then reused. It is thread-safe.
 * From the mapper, you can then obtain a DAO instance and execute queries
 **/
@Mapper
public interface VisitReactiveDaoMapper {

    @DaoFactory
    VisitReactiveDao visitReactiveDao(@DaoKeyspace CqlIdentifier cqlIdentifier);
}
