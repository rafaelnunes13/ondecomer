package com.ondecomer.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ondecomer.api.dto.UsuarioRequest;
import com.ondecomer.model.UsuarioModel;
import com.ondecomer.repository.UsuarioRepository;

@RestController()
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@PostMapping("/usuario")
	public ResponseEntity<UsuarioModel> adicionarUsuario(@RequestBody UsuarioRequest request) {
	
		var usuario = new UsuarioModel(request.nome, request.email);
		
		this.usuarioRepository.save(usuario);
		
		return ResponseEntity.ok(usuario);
	}

	@DeleteMapping("/usuario/{email}")
	public ResponseEntity<Object> removerUsuario(@PathVariable String email) {

		this.usuarioRepository.deleteById(email);
		
		return ResponseEntity.ok().build();
	}
}
