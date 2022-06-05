package Zadanie1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Adresses {

    WebDriver driver;
    public Adresses (WebDriver driver) {
        this.driver = driver;
    }
    public void create() {
        driver.findElement(By.id("addresses-link")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/a")).click();
    }
}
