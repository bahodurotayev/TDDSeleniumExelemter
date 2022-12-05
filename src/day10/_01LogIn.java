package day10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class _01LogIn {
    public static WebDriver driver;
    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir") + "/config/config.properties";
        FileInputStream fileInputStream = new FileInputStream(filePath);
        Properties properties = new Properties();
        properties.load(fileInputStream);

        String browser = properties.getProperty("edge");

        switch (browser){
            case "chrome":
                System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
                 driver = new ChromeDriver();
                break;

            case "edge":
                System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
                 driver = new EdgeDriver();
                break;
        }

        driver.get(properties.getProperty("url"));
    }
}
