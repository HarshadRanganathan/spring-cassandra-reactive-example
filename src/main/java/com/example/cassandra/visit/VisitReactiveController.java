package com.example.cassandra.visit;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/petclinic/api/vets")
@CrossOrigin(
        methods = {PUT, POST, GET, OPTIONS, DELETE, PATCH},
        maxAge = 3600,
        allowedHeaders = {"x-requested-with", "origin", "content-type", "accept"},
        origins = "*"
)
public class VisitReactiveController {

    private final VisitReactiveServices visitReactiveServices;

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public Flux<Visit> findAllVisits() {
        return visitReactiveServices.findAllVisits();
    }
}
