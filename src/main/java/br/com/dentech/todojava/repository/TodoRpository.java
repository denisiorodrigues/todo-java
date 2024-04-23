package br.com.dentech.todojava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dentech.todojava.entity.Todo;

public interface TodoRpository extends JpaRepository<Todo, Long>{
}
