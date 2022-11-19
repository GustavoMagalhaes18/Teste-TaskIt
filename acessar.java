import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class acessar {

    WebDriver robo;

    @Test
    public void acessarTaskIt(){

        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver1\\chromedriver.exe");
        robo = new ChromeDriver();
        robo.get("http://www.juliodelima.com.br/taskit/");
        robo.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Assertions.assertEquals("Task it!", robo.findElement(By.className("brand-logo")).getText());

    }

}
