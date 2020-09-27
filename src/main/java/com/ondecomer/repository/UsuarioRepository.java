package com.ondecomer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ondecomer.model.UsuarioModel;

@Repository
public interface UsuarioRepository extends MongoRepository<UsuarioModel, String> {

}
