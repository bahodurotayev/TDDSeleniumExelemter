package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _01Select {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formstone.it/components/dropdown/demo/");
        driver.manage().window().maximize();

        Select select = new Select(driver.findElement(By.xpath("//select[@name='demo_basic']")));
        select.selectByIndex(1);

    }
}
