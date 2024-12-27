package org.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class DataImplementation {

	@Given("user is sending the data at the step level")
	public void user_is_sending_the_data_at_the_step_level(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	   
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		WebElement uname = driver.findElement(By.id("email"));
//		

		List<List<String>> asLists = dataTable.asLists();
		//		for(int i = 0; i<asList.size(); i++)
//		{
//			uname.sendKeys(asList.get(i));
//			Thread.sleep(5000);
//			uname.clear();
//		}

System.out.println("To print all the records");

for(int i =0; i<asLists.size(); i++)
{
	for(int j = 0; j<asLists.get(i).size(); i++)
	{
		System.out.println(asLists.get(i).get(j));
	}
}
	}


}
