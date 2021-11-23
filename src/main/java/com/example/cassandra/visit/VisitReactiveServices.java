package com.example.cassandra.visit;

import com.example.cassandra.db.VisitReactiveDao;
import com.example.cassandra.utils.MappingUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
@RequiredArgsConstructor
public class VisitReactiveServices {

    private final VisitReactiveDao visitReactiveDao;

    public Flux<Visit> findAllVisits() {
        return Flux.from(visitReactiveDao.findAll())
                .map(MappingUtils::mapEntityAsVisit);
    }
}
