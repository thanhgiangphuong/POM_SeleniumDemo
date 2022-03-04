package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;

    @FindBy(name = "email")
    private WebElement emailInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(css = "div[class = 'login-form-submit-btn']")
    private WebElement loginButton;

    @FindBy(css = "div[class = 'remeber-mark']")
    private WebElement rememberMeCheckbox;

    @FindBy(css = "div[class = 'forgot-password']")
    private WebElement forgotPassHyperlink;

    @FindBy(css = "div[class = 'directional-signup-link']")
    private WebElement signUpHereHyperlink;

    @FindBy(css = "div[class = 'far fa-eye']")
    private WebElement eyePassword;

    // Parameterized Constructor

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Create logIn method
    public void logIn(String email, String password){
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        loginButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
}
