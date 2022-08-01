package com.afonso.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.afonso.bookstore.domain.Categoria;
import com.afonso.bookstore.domain.Livro;
import com.afonso.bookstore.repositories.CategoriaRepository;
import com.afonso.bookstore.repositories.LivroRepository;

@Service
public class DBService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;
	
	
	
	
	public void instanciaBaseDeDados() {
		Categoria cat1 = new Categoria(null, "Informática", "Livros de TI");
		Categoria cat2 = new Categoria(null, "Inglês", "Livros de Inglês");
		Categoria cat3 = new Categoria(null, "Português", "Livros de Português");
		
		Livro l1 = new Livro(null, "Clean code", "Robert Martin", "Lorem Ipsum", cat1);
		Livro l2 = new Livro(null, "English code", "Robert Mussum", "Lorem Ipsum", cat3);
		Livro l3 = new Livro(null, "Segredos do português", "Robert Pattisom", "Lorem Ipsum", cat3);
		Livro l4 = new Livro(null, "Clean code", "Robert Martin", "Lorem Ipsum", cat2);
		Livro l5 = new Livro(null, "English code", "Robert Mussum", "Lorem Ipsum", cat2);
		Livro l6 = new Livro(null, "Segredos do português", "Robert Pattisom", "Lorem Ipsum", cat1);
		
		// null está se referindo ao id
		//categoria id -- nome --- descricao
		//livro id -- nomeautor --- texto --- titulo --- categoria
		
		
		
		cat1.getLivros().addAll(Arrays.asList(l1, l6)); 
		cat2.getLivros().addAll(Arrays.asList(l4, l5));
		cat3.getLivros().addAll(Arrays.asList(l2, l3));//obs se refere aquela array criada em categorias
		// assim a categoria vai conhecer seu livro e o livro conhecer categoria
		
		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		this.livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));
	}
}
