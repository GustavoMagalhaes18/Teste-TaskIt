import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class login {

    WebDriver robo;

    @BeforeEach
    public void acessarSite(){

        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver1\\chromedriver.exe");
        robo = new ChromeDriver();
        robo.get("http://www.juliodelima.com.br/taskit/");

    }

    @AfterEach
    public void quit(){

        robo.quit();

    }

    @Test
    public void loginDoMichael(){

        robo.findElement(By.className("modal-trigger")).click();
        robo.findElement(By.id("login-sign-in")).sendKeys("Halloween");
        robo.findElement(By.id("password-sign-in")).sendKeys("1978");
        robo.findElement(By.id("btn-submit-sign-in")).click();
        robo.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("Hi, Michael Myers", robo.findElement(By.className("me")).getText());

    }

    @Test
    public void loginDoNeo(){

        robo.findElement(By.className("modal-trigger")).click();
        robo.findElement(By.id("login-sign-in")).sendKeys("Matrix");
        robo.findElement(By.id("password-sign-in")).sendKeys("2000");
        robo.findElement(By.id("btn-submit-sign-in")).click();
        robo.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("Hi, Neo", robo.findElement(By.className("me")).getText());

    }

    @Test
    public void loginDoTheo(){

        robo.findElement(By.className("modal-trigger")).click();
        robo.findElement(By.id("login-sign-in")).sendKeys("Cachorro");
        robo.findElement(By.id("password-sign-in")).sendKeys("2020");
        robo.findElement(By.id("btn-submit-sign-in")).click();
        robo.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("Hi, Theo", robo.findElement(By.className("me")).getText());

    }

    @Test
    public void loginDoBruce(){

        robo.findElement(By.className("modal-trigger")).click();
        robo.findElement(By.id("login-sign-in")).sendKeys("Batman");
        robo.findElement(By.id("password-sign-in")).sendKeys("1234");
        robo.findElement(By.id("btn-submit-sign-in")).click();
        robo.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("Hi, Bruce Wayne", robo.findElement(By.className("me")).getText());

    }

    @Test
    public void loginDoClark(){

        robo.findElement(By.className("modal-trigger")).click();
        robo.findElement(By.id("login-sign-in")).sendKeys("Superman");
        robo.findElement(By.id("password-sign-in")).sendKeys("1938");
        robo.findElement(By.id("btn-submit-sign-in")).click();
        robo.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("Hi, Clark Kent", robo.findElement(By.className("me")).getText());

    }

    @Test
    public void loginDoPeter(){

        robo.findElement(By.className("modal-trigger")).click();
        robo.findElement(By.id("login-sign-in")).sendKeys("Spider Man");
        robo.findElement(By.id("password-sign-in")).sendKeys("1963");
        robo.findElement(By.id("btn-submit-sign-in")).click();
        robo.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("Hi, Peter Parker", robo.findElement(By.className("me")).getText());

    }

    @Test
    public void loginDoBarry(){

        robo.findElement(By.className("modal-trigger")).click();
        robo.findElement(By.id("login-sign-in")).sendKeys("Flash");
        robo.findElement(By.id("password-sign-in")).sendKeys("1952");
        robo.findElement(By.id("btn-submit-sign-in")).click();
        robo.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("Hi, Barry Allen", robo.findElement(By.className("me")).getText());

    }

    @Test
    public void loginDoLogan(){

        robo.findElement(By.className("modal-trigger")).click();
        robo.findElement(By.id("login-sign-in")).sendKeys("Wolverine");
        robo.findElement(By.id("password-sign-in")).sendKeys("1890");
        robo.findElement(By.id("btn-submit-sign-in")).click();
        robo.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("Hi, Logan", robo.findElement(By.className("me")).getText());

    }

    @Test
    public void loginDoScott(){

        robo.findElement(By.className("modal-trigger")).click();
        robo.findElement(By.id("login-sign-in")).sendKeys("Ciclope");
        robo.findElement(By.id("password-sign-in")).sendKeys("2022");
        robo.findElement(By.id("btn-submit-sign-in")).click();
        robo.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("Hi, Scott Summers", robo.findElement(By.className("me")).getText());

    }

    @Test
    public void loginDaJean(){

        robo.findElement(By.className("modal-trigger")).click();
        robo.findElement(By.id("login-sign-in")).sendKeys("Fenix");
        robo.findElement(By.id("password-sign-in")).sendKeys("1237");
        robo.findElement(By.id("btn-submit-sign-in")).click();
        robo.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("Hi, Jean Grey", robo.findElement(By.className("me")).getText());

    }

    @Test
    public void loginDoCharles(){

        robo.findElement(By.className("modal-trigger")).click();
        robo.findElement(By.id("login-sign-in")).sendKeys("Professor X");
        robo.findElement(By.id("password-sign-in")).sendKeys("3221");
        robo.findElement(By.id("btn-submit-sign-in")).click();
        robo.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("Hi, Charles Xavier", robo.findElement(By.className("me")).getText());

    }

    @Test
    public void loginDoMcCoy(){

        robo.findElement(By.className("modal-trigger")).click();
        robo.findElement(By.id("login-sign-in")).sendKeys("Fera");
        robo.findElement(By.id("password-sign-in")).sendKeys("5000");
        robo.findElement(By.id("btn-submit-sign-in")).click();
        robo.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("Hi, Hank McCoy", robo.findElement(By.className("me")).getText());

    }

    @Test
    public void loginDaOroro(){

        robo.findElement(By.className("modal-trigger")).click();
        robo.findElement(By.id("login-sign-in")).sendKeys("Tempestade");
        robo.findElement(By.id("password-sign-in")).sendKeys("0829");
        robo.findElement(By.id("btn-submit-sign-in")).click();
        robo.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("Hi, Ororo Munroe", robo.findElement(By.className("me")).getText());

    }

    @Test
    public void loginDoKurt(){

        robo.findElement(By.className("modal-trigger")).click();
        robo.findElement(By.id("login-sign-in")).sendKeys("Noturno");
        robo.findElement(By.id("password-sign-in")).sendKeys("6648");
        robo.findElement(By.id("btn-submit-sign-in")).click();
        robo.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("Hi, Kurt Wagner", robo.findElement(By.className("me")).getText());

    }

    @Test
    public void loginDoTony(){

        robo.findElement(By.className("modal-trigger")).click();
        robo.findElement(By.id("login-sign-in")).sendKeys("Homem de Ferro");
        robo.findElement(By.id("password-sign-in")).sendKeys("4300");
        robo.findElement(By.id("btn-submit-sign-in")).click();
        robo.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("Hi, Tony Stark", robo.findElement(By.className("me")).getText());

    }

    @Test
    public void loginDoSteve(){

        robo.findElement(By.className("modal-trigger")).click();
        robo.findElement(By.id("login-sign-in")).sendKeys("Capitão América");
        robo.findElement(By.id("password-sign-in")).sendKeys("1945");
        robo.findElement(By.id("btn-submit-sign-in")).click();
        robo.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("Hi, Steve Rogers", robo.findElement(By.className("me")).getText());

    }

    @Test
    public void loginDoThor(){

        robo.findElement(By.className("modal-trigger")).click();
        robo.findElement(By.id("login-sign-in")).sendKeys("Deus do Trovão");
        robo.findElement(By.id("password-sign-in")).sendKeys("1500");
        robo.findElement(By.id("btn-submit-sign-in")).click();
        robo.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("Hi, Thor", robo.findElement(By.className("me")).getText());

    }

    @Test
    public void loginHulk(){

        robo.findElement(By.className("modal-trigger")).click();
        robo.findElement(By.id("login-sign-in")).sendKeys("Hulk");
        robo.findElement(By.id("password-sign-in")).sendKeys("8056");
        robo.findElement(By.id("btn-submit-sign-in")).click();
        robo.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("Hi, Bruce Banner", robo.findElement(By.className("me")).getText());

    }

    @Test
    public void loginDoFormiga(){

        robo.findElement(By.className("modal-trigger")).click();
        robo.findElement(By.id("login-sign-in")).sendKeys("Homem Formiga");
        robo.findElement(By.id("password-sign-in")).sendKeys("4321");
        robo.findElement(By.id("btn-submit-sign-in")).click();
        robo.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("Hi, Hank Pym", robo.findElement(By.className("me")).getText());

    }

    @Test
    public void loginDaJanett(){

        robo.findElement(By.className("modal-trigger")).click();
        robo.findElement(By.id("login-sign-in")).sendKeys("Vespa");
        robo.findElement(By.id("password-sign-in")).sendKeys("7555");
        robo.findElement(By.id("btn-submit-sign-in")).click();
        robo.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("Hi, Janett Van Dyne", robo.findElement(By.className("me")).getText());

    }

    @Test
    public void loginDoClint(){

        robo.findElement(By.className("modal-trigger")).click();
        robo.findElement(By.id("login-sign-in")).sendKeys("Gavião Arqueiro");
        robo.findElement(By.id("password-sign-in")).sendKeys("1212");
        robo.findElement(By.id("btn-submit-sign-in")).click();
        robo.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("Hi, Clint Barton", robo.findElement(By.className("me")).getText());

    }

}
