package tests.day02_webDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WebDriverMethodlari {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("Webdriver.chrome.driver","KurulumDosyalari/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.testotomasyonu.com/");

        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getTitle());



        driver.getTitle();
         // -> incelede baslaik bulmak icin   //title

        System.out.println(driver.getPageSource());

        System.out.println(driver.getWindowHandle());// 95E0D6982E70DA078589E68C2C239507


        System.out.println(driver.getWindowHandles()); //[95E0D6982E70DA078589E68C2C239507]

        Thread.sleep(3000);
        driver.quit();
    }
}
