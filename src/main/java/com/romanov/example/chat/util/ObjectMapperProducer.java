package com.romanov.example.chat.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;


@ApplicationScoped
public class ObjectMapperProducer {

    @Produces
    public ObjectMapper produceObjectMapper() {
        return ObjectMapperFactory.get();
    }
}
