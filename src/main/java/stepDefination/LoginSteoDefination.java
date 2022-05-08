package stepDefination;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteoDefination {
	
	WebDriver driver;
	
	@Given("^user is on login page$")
	public void user_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\teerthp\\OneDrive - Talentica Software (I) Pvt. Ltd\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		driver.manage().window().maximize();
	}
	
	@When("^title of login page is free crm$")
	public void title_of_login_page_is_free_crm()  {
	    // Write code here that turns the phrase above into concrete actions
		String title = driver.getTitle();
		Assert.assertEquals("Cogmento CRM",title);
	}
	
	@Then("^user enters \"([^\"]*)\" and \"(.*)\"$")
	public void user_enters_user_name_and_password(String username, String password) throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input")).sendKeys(username);
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button()  {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
	}
	
	@Then("^user is on home page$")
	public void user_is_on_home_page() {
//		String title = driver.getTitle();
//		Assert.assertEquals("Cogmento CRM",title);
		boolean value = driver.findElement(By.className("user-display")).isDisplayed();
		System.out.print(value);
//			assert.assertTrue(value);;
		
	}

}
