package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01RadioDemo {
    private static String urlSelenium = "https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html";
    private static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("test");

        driver.findElement(By.cssSelector("input.button")).click();

        boolean displayed = driver.findElement(By.xpath("//td/h1[contains(text(),'Web Orders')]")).isDisplayed();

        if (displayed){
            System.out.println("Successfully logged in");
        }else {
            System.out.println("Please use valid credentials");
        }



    }
}
