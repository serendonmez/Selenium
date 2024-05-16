package tests.day03_webDriverMethodlari_Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Locater_ByClassName {
    public static void main(String[] args) throws InterruptedException {
        // gerekli ayarlari yapin

// testotomasyonu anasayfaya gidin

// arama kutusunu locate edip

// dress icin arama yapin

// buulunan urun sayisinin 3'den fazla oldugunu test edin

// sayfayi kapatin



        System.setProperty("Webdriver.chrome.driver","KurulumDosyalari/chromedriver.exe");
        WebDriver driver =new ChromeDriver();


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.testotomasyonu.com/");

        WebElement aramaKutusu = driver.findElement(By.id("global-search"));

        aramaKutusu.sendKeys("dress"+Keys.ENTER);

        Thread.sleep(3000);

        aramaKutusu.submit();

        Thread.sleep(3000);

        driver.quit();












    }
}
