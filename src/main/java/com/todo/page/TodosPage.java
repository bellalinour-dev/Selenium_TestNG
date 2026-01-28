package com.todo.page;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.todo.utils.BasePage;

public class TodosPage extends BasePage {
	
	/*
	 * Retrieve Element
	 * */
	@FindBy(xpath = "//input[@placeholder='What needs to be done?']") 
	public static WebElement inputField;
	
	public TodosPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	/*
	 * Create Methods
	 * */
	public void submitTodo(String todo) {
		inputField.clear();
		inputField.sendKeys(todo);
		inputField.sendKeys(Keys.ENTER);
		
	}

}
