package Zadanie2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class myStore {
    WebDriver driver;
    public myStore(WebDriver driver) {
        this.driver = driver;
    }
    public void store(){
        driver.findElement(By.xpath("//*[@id=\"_desktop_logo\"]/a")).click();
    }
}
