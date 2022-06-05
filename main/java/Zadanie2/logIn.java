package Zadanie2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logIn {
    WebDriver driver;
    public logIn(WebDriver driver){
        this.driver = driver;
    }
    public void log(){
        driver.findElement(By.name("email")).sendKeys("arnold@power.pl");
        driver.findElement(By.name("password")).sendKeys("Arnoldtoja");
        driver.findElement(By.id("submit-login")).click();
    }
}
