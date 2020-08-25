package com.ondecomer.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ondecomer.api.dto.RestauranteRequest;

@RestController
public class RestauranteController {

	@PostMapping("/restaurante")
	public ResponseEntity<Object> adicionarRestaurante(@RequestBody RestauranteRequest request) {
	
		return ResponseEntity.created(null).build();
	}

	@PutMapping("/restaurante/{id}")
	public ResponseEntity<Object> editarRestaurante(@PathVariable String id, @RequestBody RestauranteRequest request) {
	
		return ResponseEntity.ok().build();
	}

	@DeleteMapping("/restaurante/{id}")
	public ResponseEntity<Object> excluirRestaurante(@PathVariable String id) {
	
		return ResponseEntity.ok().build();
	}
}
