package pageBean;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoPageFactory {

WebDriver driver;
	
	//step 1 : identify elements
	@FindBy(name="uname")
	@CacheLookup
	WebElement name;
	
	@FindBy(name="gender")
	@CacheLookup
	WebElement gen;
	
	@FindBy(name="DtOB")
	@CacheLookup
	WebElement dob;
	
	@FindBy(name="bike")
	@CacheLookup
	WebElement bike;
	

	@FindBy(name="submit")
	@CacheLookup
	WebElement submitButton;
	
	//initiating the elements
	public DemoPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getBike() {
		return bike;
	}

	public void setBike(String bike) {
		this.bike.sendKeys(bike);;
	}


	public WebElement getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob.sendKeys(dob);;
	}

	public WebElement getName() {
		return name;
	}

	public void setName(String name) {
		this.name.sendKeys(name);;
	}

	public WebElement getGen() {
		return gen;
	}

	public void setGen(String gen) {
		this.gen.click();
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public void setSubmitButton() {
		this.submitButton.click();
	}


}
