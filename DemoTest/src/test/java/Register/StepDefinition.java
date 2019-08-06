package Register;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageBean.DemoPageFactory;

public class StepDefinition {

	private WebDriver driver;
	private DemoPageFactory demoPageFactory;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	@Given("^User is on 'Registration' Page$")
	public void user_is_on_Registration_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		driver.get("D:\\BDD\\DemoTest\\Demo.html");

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		demoPageFactory = new DemoPageFactory(driver);
	}

	@When("^user enters invalid Name$")
	public void user_enters_invalid_Name() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		demoPageFactory.setName("");
		demoPageFactory.setSubmitButton();

	}

	@Then("^display 'Please Enter Name'$")
	public void display_Please_Enter_Name() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String expectedMessage = "Please fill the Name";
		String actualMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid gender$")
	public void user_enters_invalid_gender() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		demoPageFactory.setName("Shahrukh");
		//demoPageFactory.setGen("");
		demoPageFactory.setSubmitButton();

	}

	@Then("^display 'Please Enter Gender'$")
	public void display_Please_Enter_Gender() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String expectedMessage = "Please select the Gender";
		String actualMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid Bike$")
	public void user_enters_invalid_Bike() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		demoPageFactory.setName("Shahrukh");
		demoPageFactory.setGen("Male");
		demoPageFactory.setSubmitButton();
	}

	@Then("^display 'Please Enter Bike'$")
	public void display_Please_Enter_Hobby() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String expectedMessage = "Please select the Bike";
		String actualMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}
	
	@When("^user enters invalid dob$")
	public void user_enters_invalid_dob() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		demoPageFactory.setName("Shahrukh");
		demoPageFactory.setGen("Male");
		demoPageFactory.setBike("pul");
		demoPageFactory.setSubmitButton();
	}

	@Then("^display 'Please Enter DOB'$")
	public void display_Please_Enter_DOB() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String expectedMessage = "Please select the DOB";
		String actualMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}
	
	
	
	@When("^User enters valid student details$")
	public void user_enters_valid_student_details() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		demoPageFactory.setName("Shahrukh");
		demoPageFactory.setGen("Male");
		demoPageFactory.setBike("pul");
		demoPageFactory.setDob("08/08/1997");
		Thread.sleep(3000);
		demoPageFactory.setSubmitButton();
	}

	@Then("^displays 'Student Register Successfully!'$")
	public void displays_Student_Register_Successfully() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String expectedMessage = "Yo Yo Honey Singh";
		String actualMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}
}
