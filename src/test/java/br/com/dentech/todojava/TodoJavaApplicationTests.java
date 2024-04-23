package br.com.dentech.todojava;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.reactive.server.WebTestClient;

import br.com.dentech.todojava.entity.Todo;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class TodoJavaApplicationTests {
	@Autowired
	private WebTestClient webTestClient;

	@Test
	void testCreateTodoSuccess() {
		var todo = new Todo("Reunião de equipe", "Discussão dos próximos passos do projeto", false, 2);
		webTestClient
			.post()
			.uri("/todos")
			.bodyValue(todo)
			.exchange()
			.expectStatus().isOk()
			.expectBody()
			.jsonPath("$").isArray()
			.jsonPath("$.length()").isEqualTo(1)
			.jsonPath("$[0].name").isEqualTo(todo.getName())
			.jsonPath("$[0].description").isEqualTo(todo.getDescription())
			.jsonPath("$[0].done").isEqualTo(todo.isDone())
			.jsonPath("$[0].priority").isEqualTo(todo.getPriority());
	}

	void testCreateTodoFalure() {
	}

}
