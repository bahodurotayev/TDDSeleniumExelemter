package day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _02 {
    private static String urlSelenium = "https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html";
    private static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(urlSelenium);

        List<WebElement> elements = driver.findElements(By.xpath("//input[@name='browser']"));

        System.out.println("======Selected======");
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).isSelected()){
                System.out.println(elements.get(i).getAttribute("value"));
            }
        }

    driver.close();
    }
}
