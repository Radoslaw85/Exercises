package Zadanie1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class check {
    WebDriver driver;

    public check(WebDriver driver) {
        this.driver = driver;
    }
    public String terminator() {
        WebElement txt = driver.findElement(By.xpath("//*[@id=\"address-25392\"]/div[1]/address"));
        return txt.getText();
    }
}
