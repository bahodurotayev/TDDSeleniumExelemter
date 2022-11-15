package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println(title);
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        driver.close();
    }
}
