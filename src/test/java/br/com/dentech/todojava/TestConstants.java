package br.com.dentech.todojava;

import java.util.ArrayList;
import java.util.List;

import br.com.dentech.todojava.entity.Todo;

public class TestConstants {
  public static final List<Todo> TODOS = new ArrayList<>() {
    {
      add(new Todo(9995L, "@denisiorodrigues", "Programar", false, 1));
      add(new Todo(9996L, "@denisiorodrigues", "Trabalhar", false, 1));
      add(new Todo(9997L, "@denisiorodrigues", "Fazer compras", false, 1));
      add(new Todo(9998L, "@denisiorodrigues", "Lavar a casa", false, 1));
      add(new Todo(9999L, "@denisiorodrigues", "Jogar o material de construção do lado de fora da casa", false, 1));
    }
  };

  public static final Todo TODO = TODOS.get(0);
}