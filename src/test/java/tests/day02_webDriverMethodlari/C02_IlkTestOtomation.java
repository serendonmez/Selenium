package tests.day02_webDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_IlkTestOtomation {
    public static void main(String[] args) {
        // gerekli ayarlari yapip
// testotomasyonu anasayfaya gidin
// testotomasyonu anasayfanin acildigini test edin
// sayfayi kapatin

        System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");


        String expectedUrl= "https://www.testotomasyonu.com/";
        String actualUrl= driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println(" test passed");
        }else {
            System.out.println(" test failed");
        }

        System.out.println(expectedUrl);
        System.out.println(actualUrl);
        driver.quit();


    }
}
