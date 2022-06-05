package Zadanie2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class proceed1 {
    WebDriver driver;
    public proceed1(WebDriver driver){
        this.driver = driver;
    }
    public void proc(){
        driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")).click();
    }
}
