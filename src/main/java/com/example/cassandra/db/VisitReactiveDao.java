package com.example.cassandra.db;

import com.datastax.dse.driver.api.mapper.reactive.MappedReactiveResultSet;
import com.datastax.oss.driver.api.mapper.annotations.Dao;
import com.datastax.oss.driver.api.mapper.annotations.Select;

@Dao
public interface VisitReactiveDao {

    @Select
    MappedReactiveResultSet<VisitEntity> findAll();
}
