import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class cadastro {

    WebDriver robo;

    @BeforeEach
    public void acessarSite(){

        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver1\\chromedriver.exe");
        robo = new ChromeDriver();
        robo.get("http://www.juliodelima.com.br/taskit/");

    }

    @Test
    public void cadastroDoMichael(){

        robo.findElement(By.id("signup")).click();
        robo.findElement(By.id("name-sign-up")).sendKeys("Michael Myers");
        robo.findElement(By.id("login-sign-up")).sendKeys("Halloween");
        robo.findElement(By.id("password-sign-up")).sendKeys("1978");
        robo.findElement(By.id("btn-submit-sign-up")).click();
        robo.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("Hi, Michael Myers", robo.findElement(By.className("me")).getText());

    }

    @Test
    public void cadastroDoNeo(){

        robo.findElement(By.id("signup")).click();
        robo.findElement(By.id("name-sign-up")).sendKeys("Neo");
        robo.findElement(By.id("login-sign-up")).sendKeys("Matrix");
        robo.findElement(By.id("password-sign-up")).sendKeys("2000");
        robo.findElement(By.id("btn-submit-sign-up")).click();
        robo.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("Hi, Neo", robo.findElement(By.className("me")).getText());

    }

    @Test
    public void cadastroDoTheo(){

        robo.findElement(By.id("signup")).click();
        robo.findElement(By.id("name-sign-up")).sendKeys("Theo");
        robo.findElement(By.id("login-sign-up")).sendKeys("Cachorro");
        robo.findElement(By.id("password-sign-up")).sendKeys("2020");
        robo.findElement(By.id("btn-submit-sign-up")).click();
        robo.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("Hi, Theo", robo.findElement(By.className("me")).getText());

    }

}
