package Zadanie1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie1Glowny {

    WebDriver driver;

    @Given("User have created an account on {string} website")
    public void userHaveCreatedAnAccountOnWebsite(String url) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
    @When("User click Sign in")
    public void userClickSignIn() {

        SignIn logowanie = new SignIn(driver);
        logowanie.click();
    }

    @And("Fill email and password and click on SIGN IN button")
    public void fillEmail() {
    Logowanie logowanie = new Logowanie(driver);
        logowanie.login();

    }

    @And("Click addresses and create new address")
    public void click() {
        Adresses adresses = new Adresses(driver);
        adresses.create();
    }

    @And("User fill necessary fields {string}, {string}, {string}, {string}, {string}, {string}")
    public void userAddress(String alias, String address, String city, String postal_code, String country, String phone) {
        Fields fields = new Fields(driver);
        fields.addedData(alias,address,city, postal_code, country, phone);
    }

    @And("Browser is closed")
    public void browserIsClosed() {
        driver.quit();
    }
}
