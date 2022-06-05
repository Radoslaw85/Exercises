package Zadanie2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Zadanie2 {
    WebDriver driver;

        @Given("User will be on the website {string}")

                public void website (String url) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(url);
        }
    @When("user will click SIGN IN button to log in")
    public void SIGNIN() {
            SignIn signIn = new SignIn(driver);
            signIn.user();
    }

    @And("user will fill email and password field to log in")
    public void LogIn() {
            logIn logIn = new logIn(driver);
            logIn.log();
    }

    @And("user click My Store")
    public void MyStore() {
            myStore myStore = new myStore(driver);
            myStore.store();
    }

    @And("user will click on Hummingbird Printed Sweater and add size M and quantity five and click add to cart")
    public void Hummingbird() throws InterruptedException{
            sweater sweater = new sweater(driver);
            sweater.sweaterAdd();
    }

    @And("user will click PROCEED TO CHECK OUT button")
    public void PROCEEDTOCHECKOUT() {
            proceed1 proceed1 = new proceed1(driver);
            proceed1.proc();
    }

    @And("user will click again PROCEED TO CHECK OUT button")
    public void ClickAgain() {
            proceed2 proceed2 = new proceed2(driver);
            proceed2.proc2();
    }

    @Then("user will confirm address and click on SHIPPING METHOD and will choose PrestaShop")
    public void SHIPPINGMETHOD() {
            shipping shipping = new shipping(driver);
            shipping.shipp();
    }

    @And("user will click on PAYMENT tab and will choose Pay by Check method and click on order with an obligation to pay")
    public void PAYMENT() throws IOException {
            payment payment = new payment(driver);
            payment.pay();
    }

    @And("user will check order details")
    public void OrderDetails() {
            orderDetails orderDetails = new orderDetails(driver);
            orderDetails.details();
    }

    @And("user will check if order have status Awaiting check payment")
    public void Status() {
    }

    @And("Browser will be closed")
    public void browserClosed() {
    }
}
