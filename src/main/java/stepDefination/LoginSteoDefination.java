package stepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteoDefination {
	
	WebDriver driver;
	
	@Given("^user is on login page$")
	public void user_on_login_page() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\teerthp\\OneDrive - Talentica Software (I) Pvt. Ltd\\Desktop\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\teerthp\\OneDrive - Talentica Software (I) Pvt. Ltd\\Desktop\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("https://ui.freecrm.com/");
		driver.manage().window().maximize();
	}
	
	@When("^title of login page is free crm$")
	public void title_of_login_page_is_free_crm()  {
		String title = driver.getTitle();
		Assert.assertEquals("Cogmento CRM",title);
	}
	
	@Then("^user enters \"([^\"]*)\"$")
	public void user_enters_user_name(String username) throws InterruptedException  {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.name("email")).sendKeys(username);
	}
	
	@Then("^user types \"([^\"]*)\"$")
	public void user_enters_user_password(String password) throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button()  {
	    driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
	}
	
	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		String title = driver.getTitle();
		Assert.assertEquals("Cogmento CRM",title);	
	}
	
	@Then("^user clicked on contact button.$")
	public void user_clicked_on_contact_button() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[@href='/contacts']")).click();
	}
	
	@Then("^user press create button$")
	public void user_press_create_button() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='/contacts/new']")).click();
	}
	
	@Then("^user add \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_add_firstname_and_lastname(String firstname, String lastname) {
	   driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstname);
	   driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lastname);
	}
	
	@Then("user click save button")
	public void user_click_save_button() {
		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();		
	}
}
