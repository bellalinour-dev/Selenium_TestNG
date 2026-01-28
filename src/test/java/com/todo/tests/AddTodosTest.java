package com.todo.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.todo.page.TodosPage;
import com.todo.utils.Setup;

public class AddTodosTest extends Setup {

	public AddTodosTest() throws IOException {
		super();
		
	}
	
	TodosPage todosPage;
	
	@Test
	public void iAddTodo() throws IOException {
		todosPage = new TodosPage();
		
		todosPage.submitTodo(prop.getProperty("todo1"));
	}
	

}


