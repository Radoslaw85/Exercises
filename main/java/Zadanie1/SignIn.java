package Zadanie1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {
    WebDriver driver;
    public SignIn (WebDriver driver) {
        this.driver = driver;
    }
    public void click() {
    driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a")).click();
    }
}
