package com.example.cassandra.conf;

import com.datastax.oss.driver.api.core.CqlSession;
import com.example.cassandra.db.VisitReactiveDao;
import com.example.cassandra.db.VisitReactiveDaoMapper;
import com.example.cassandra.db.VisitReactiveDaoMapperBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CassandraDaoConfig {

    @Bean
    public VisitReactiveDao visitReactiveDao(CqlSession cqlSession) {
        final VisitReactiveDaoMapper visitReactiveDaoMapper = new VisitReactiveDaoMapperBuilder(cqlSession).build();
        return visitReactiveDaoMapper.visitReactiveDao(cqlSession.getKeyspace().get());
    }
}
