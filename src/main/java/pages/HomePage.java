package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static common.CommonActions.*;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id= 'SignIn-emailInput']")
	WebElement userId;

	@FindBy(xpath = " //input[@id='SignIn-passwordInput']")
	WebElement passwordId;

	@FindBy(id = "SignIn-rememberMe")
	WebElement checkBox;

	@FindBy(id = "SignIn-submitButton")
	WebElement loginButton;

	public void inputTextInUserIdAndPasswordFieldThenClickLoginButton() {

		inputText(userId, "habibaummey78@gmail.com");
		inputText(passwordId, "Familyissweet1@");
		pause(5);
		clickElement(checkBox);
		pause(5);
		clickElement(loginButton);
		pause(5);
	}

	private void pause(int i) {

	}

}