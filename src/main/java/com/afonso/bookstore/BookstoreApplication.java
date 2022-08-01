package com.afonso.bookstore;



import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.afonso.bookstore.domain.Categoria;
import com.afonso.bookstore.domain.Livro;
import com.afonso.bookstore.repositories.CategoriaRepository;
import com.afonso.bookstore.repositories.LivroRepository;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner{


	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	
	

	@Override
	public void run(String... args) throws Exception {
	
	}

}
