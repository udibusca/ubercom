package com.projeto.ubercom;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.projeto.ubercom.domain.Categoria;
import com.projeto.ubercom.repositores.CategoriaRepository;

@SpringBootApplication
public class UbercomApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(UbercomApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
      Categoria cat1 = new Categoria(null, "Informática");
      Categoria cat2 = new Categoria(null, "Escritório");
      
      categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		
	}
}
