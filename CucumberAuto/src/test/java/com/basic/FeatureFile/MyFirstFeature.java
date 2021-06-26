package com.basic.FeatureFile;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyFirstFeature {
	
	WebDriver driver;
	
	@Given("^User need to be on Facebook login page$")
	public void User_need_to_be_on_Facebook_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\siboi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
	}
	
	@When("^User enters user first name$")
	public void User_enters_user_first_name() {
		
		driver.findElement(By.xpath("//input[@id='u_0_n_C2'")).sendKeys("David");
	}
	
	@Then("^User checks user first name is present$")
	public void User_checks_user_first_name_is_present() {
		String usernameActual = driver.findElement(By.xpath("//input[@id='u_0_n_C2'")).getAttribute("value");
		Assert.assertEquals("David", usernameActual);
	}
	
	@When("^Enter following data")
	public void Enter_following_data(DataTable table) {
		List<List<String>> data  = table.raw();
		
		String value1 = data.get(0).get(0);
		String value2 = data.get(0).get(1);
		String value3 = data.get(0).get(2);
		
		String value4 = data.get(1).get(0);
		String value5 = data.get(1).get(1);
		String value6 = data.get(1).get(2);
	}
}
