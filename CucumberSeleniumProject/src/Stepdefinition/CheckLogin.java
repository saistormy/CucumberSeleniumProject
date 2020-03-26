package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckLogin {	
	WebDriver driver;

	@Given("^Open Chrome and start application$")
	public void open_Chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\007\\Selenium\\JarFiles\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.get("http://demowebshop.tricentis.com/login");
		 driver.manage().window().maximize();
	    
	}

	@When("^I provide valid username and password$")
	public void i_provide_valid_username_and_password() throws Throwable {
		
		driver.findElement(By.id("Email")).sendKeys("saishankar522@gmail.com");
		 driver.findElement(By.name("Password")).sendKeys("Momdadme@007");
	   
	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
		 driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		 driver.findElement(By.linkText("Log out")).click();
	}
	
}

