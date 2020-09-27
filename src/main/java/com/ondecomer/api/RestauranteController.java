package com.ondecomer.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ondecomer.api.dto.RestauranteRequest;
import com.ondecomer.model.RestauranteModel;
import com.ondecomer.repository.RestauranteRepository;

@RestController()
public class RestauranteController {

	@Autowired
	private RestauranteRepository restauranteRepository;
	
	@PostMapping("/restaurante")
	public ResponseEntity<Object> adicionarRestaurante(@RequestBody RestauranteRequest request) {
	
		var restaurante = new RestauranteModel(
			request.nome,
			request.localizacao,
			request.cardapios
		);
		
		this.restauranteRepository.insert(restaurante);
		
		return ResponseEntity.created(
			ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(restaurante.getId()).toUri()
		).build();
	}

	@PutMapping("/restaurante/{id}")
	public ResponseEntity<Object> editarRestaurante(@PathVariable String id, @RequestBody RestauranteRequest request) {
	
		var restauranteOptional = this.restauranteRepository.findById(id);
		
		if (!restauranteOptional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		var restaurante = new RestauranteModel(
				request.nome,
				request.localizacao,
				request.cardapios
				);
		
		this.restauranteRepository.save(restaurante);
		
		return ResponseEntity.ok().build();
	}

	@DeleteMapping("/restaurante/{id}")
	public ResponseEntity<Object> excluirRestaurante(@PathVariable String id) {
	
		this.restauranteRepository.deleteById(id);
		
		return ResponseEntity.ok().build();
	}

	@GetMapping("/restaurante")
	public List<RestauranteModel> listarRestaurantes() {

		return this.restauranteRepository.findAll();
	}
}
