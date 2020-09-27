package com.ondecomer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ondecomer.model.RestauranteModel;

@Repository
public interface RestauranteRepository extends MongoRepository<RestauranteModel, String> {

}
