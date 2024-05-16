package tests.day03_webDriverMethodlari_Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_WebElement {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("Webdriver,chrome, driver", "KurulumDosyalari/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.testotomasyonu.com/");

        WebElement aramaKutusu = driver.findElement(By.id("global-search"));

        aramaKutusu.sendKeys("phone");

        Thread.sleep(3000);

        aramaKutusu.submit();  // keys.ENTER


        Thread.sleep(3000);
        driver.quit();


    }
}
