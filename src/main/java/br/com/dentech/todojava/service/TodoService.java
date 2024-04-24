package br.com.dentech.todojava.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.dentech.todojava.entity.Todo;
import br.com.dentech.todojava.exception.BadRequestException;
import br.com.dentech.todojava.repository.TodoRpository;

@Service
public class TodoService {

  private TodoRpository todoRepository;

  public TodoService(TodoRpository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public List<Todo> create(Todo todo) {
    todoRepository.save(todo);
    return list();
  }

  public List<Todo> list() {
    Sort sort = Sort.by("priority").descending().and(
      Sort.by("name").ascending());
    return todoRepository.findAll(sort);
  }

  public List<Todo> update(Long id, Todo todo) {
    todoRepository.findById(id).ifPresentOrElse((existigTodo) -> {
      todo.setId(id);
      todoRepository.save(todo);
    }, () -> {
      throw new BadRequestException("Todo %d is not found".formatted(id));
    });

    return list();
  }

  public List<Todo> delete(Long id) {
    todoRepository.findById(id).ifPresentOrElse((existingTodo) -> todoRepository.deleteById(id), () -> {
      throw new BadRequestException("Todo %d not found.".formatted(id));
    });
    
    return list();
  }
}
