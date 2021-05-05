package com.farm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import com.farm.model.CategoriaModel;
import com.farm.model.ProdutosModel;
import com.farm.repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")
public class CategoriaController {

	@Autowired
	CategoriaRepository categoriaRepository;
	
	@GetMapping
	public ResponseEntity<List<CategoriaModel>> findAllCategoria(){
		return ResponseEntity.ok(categoriaRepository.findAll());
	}
	@GetMapping("/descricao/{descricao}")
	public ResponseEntity<List<CategoriaModel>> findByDescricao(@PathVariable String descricao){
		return ResponseEntity.ok(categoriaRepository.findByDescricaoContainingIgnoreCase(descricao));
	}
	@GetMapping("/{id}")
	public ResponseEntity<CategoriaModel> GetById(@PathVariable long id){
		return categoriaRepository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	@PostMapping
	public ResponseEntity<CategoriaModel> postCategoria(@RequestBody CategoriaModel categoria){
		return ResponseEntity.status(HttpStatus.CREATED).body(categoriaRepository.save(categoria));
	}
	@PutMapping
	public ResponseEntity<CategoriaModel> putCategoria(@RequestBody CategoriaModel categoria){
		return ResponseEntity.status(HttpStatus.CREATED).body(categoriaRepository.save(categoria));
	}
	@DeleteMapping("/{id}")
	public void deleteCategoria(@PathVariable long id) {
		categoriaRepository.deleteById(id);
	}
	
	
	
	

}
