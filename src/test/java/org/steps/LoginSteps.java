package org.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver;
	
	@Before(order = 1)
	public void before1()
	{
		System.out.println("This is Before 1");
		System.out.prinln("The changes done by kalpana")
	}
	@Before(order = 2)
	public void before2()
	{
		System.out.println("This is Before 2");
	}
	@Before(order = 3)
	public void before3()
	{
		System.out.println("This is Before 3");
	}
	@Given("User enters the facebook url")
	public void user_enters_the_facebook_url() {
	     driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	}

	@When("User enters the username")
	public void user_enters_the_username() {
	    driver.findElement(By.id("email")).sendKeys("Oranium");
	}

	@When("User enters the password")
	public void user_enters_the_password() {
	   driver.findElement(By.id("pass")).sendKeys("12345");
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
	    driver.findElement(By.name("login")).click();
	}

	@Then("User is on facebook home page")
	public void user_is_on_facebook_home_page() {
	   System.out.println("Success");
	}
	
	@When("User enters the username {string}")
	public void user_enters_the_username(String uname) {
		
		driver.findElement(By.id("email")).sendKeys(uname);;
	    
	}

	@When("User enters the password {string}")
	public void user_enters_the_password(String pass) {
		
		driver.findElement(By.id("pass")).sendKeys(pass);;
	   
	}
	
	
	@After(order = 2)
	public void finish()
	{
		System.out.println("I have finished my test");
	}
@After(order = 1)
  public void tear()
  {
	  driver.close();
  }
}
