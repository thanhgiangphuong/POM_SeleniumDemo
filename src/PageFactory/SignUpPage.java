package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class SignUpPage {
    private WebDriver driver;

    @FindBy(id = "card1")
    private WebElement internalPersonalRadioButton;

    @FindBy(id = "card2")
    private WebElement projectCreatorRadioButton;

    @FindBy(name = "firstname")
    private WebElement firstNameInput;

    @FindBy(name = "lastname")
    private WebElement lastNameInput;

    @FindBy(name = "email")
    private WebElement emailInput;

    @FindBy(name = "password")
    private WebElement passwordlInput;

    @FindBy(name = "confirmPassword")
    private WebElement cfmPasswordInput;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/form/div/div[4]/div/span/div/i")
    private WebElement EyeIconPassword;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/form/div/div[5]/div/span/div/i")
    private WebElement EyeIconCfmPassword;

    @FindBy(css = "div[class = 'font-weight-bold']")
    private WebElement privatePolicyHyperlink;

    @FindBy(css = "div[type = 'submit'][class = 'btn btn-block']")
    private WebElement signUpButton;

    @FindBy(css = "div[class='font-weight-bold']")
    private WebElement loginHereHyperlink;


    // Parameterized Constructor
    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Create signUp method
    public void signUp (String firstname, String lastname, String email, String password, String confirmpassword){
        internalPersonalRadioButton.click();
        firstNameInput.sendKeys(firstname);
        lastNameInput.sendKeys(lastname);
        emailInput.sendKeys(email);
        passwordlInput.sendKeys(password);
        cfmPasswordInput.sendKeys(confirmpassword);
        signUpButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
}
