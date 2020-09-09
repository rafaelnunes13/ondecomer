package com.ondecomer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ondecomer.model.UsuarioModel;

public interface UsuarioRepository extends MongoRepository<UsuarioModel, String> {

}
