import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UsersTest {


    public static WebDriver driver;

 @Test
    public void login()throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://users.bugred.ru/user/login/index.html");
        driver.findElement(By.name("login")).sendKeys("a.metelskyi@ukr.net");
        driver.findElement(By.name("password")).sendKeys("2607");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/form/table/tbody/tr[3]/td[2]/input")).click();
        WebElement Anton = driver.findElement(By.xpath("//a[contains(text(),'Добавить пользователя')]"));
        Assert.assertEquals(true, Anton.isDisplayed());
        driver.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).sendKeys("a.metelskyi@ukr.net");
        driver.findElement(By.xpath("//button[contains(text(),'Найти')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Добавить пользователя')]")).click();
        driver.findElement(By.xpath("//*[@id=\"fat-menu\"]/a")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Личный кабинет')]")).click();
        driver.findElement(By.xpath("//tbody/tr[3]/td[2]/select[1]")).click();
        driver.findElement(By.xpath("//option[contains(text(),'Мужской')]")).click();
        driver.findElement(By.xpath("//tbody/tr[6]/td[2]/textarea[1]")).sendKeys("Diving");
        driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]")).sendKeys("301220754311");
        driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]")).sendKeys("26");
        driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]")).sendKeys("07");
        driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]")).sendKeys("1983");
        driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]")).sendKeys("01");
        driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]")).sendKeys("05");
        driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]")).sendKeys("2020");
        driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).click();
        driver.quit();







 }
}
