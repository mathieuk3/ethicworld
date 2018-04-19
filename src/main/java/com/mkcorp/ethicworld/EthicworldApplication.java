package com.mkcorp.ethicworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EthicworldApplication{

    public static final String URL = "bolt://neo4j:admin@localhost:7687";
    public static void main(String[] args) {

        SpringApplication.run(EthicworldApplication.class, args);

    }
//
//    @Bean
//    public org.neo4j.ogm.config.Configuration getConfiguration() {
//        org.neo4j.ogm.config.Configuration config = new org.neo4j.ogm.config.Configuration.Builder().uri(URL).build();
//        return config;
//    }



}
