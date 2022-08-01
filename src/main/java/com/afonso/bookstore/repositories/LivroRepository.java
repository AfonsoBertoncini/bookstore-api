package com.afonso.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.afonso.bookstore.domain.Livro;


@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer>{

	
	
}
///