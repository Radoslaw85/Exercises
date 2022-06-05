package Zadanie1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logowanie {

    WebDriver driver;

    public Logowanie (WebDriver driver) {
        this.driver = driver;
    }
    public void login() {
        driver.findElement(By.name("email")).sendKeys("arnold@power.pl");
        driver.findElement(By.name("password")).sendKeys("Arnoldtoja");
        driver.findElement(By.id("submit-login")).click();
    }
}
