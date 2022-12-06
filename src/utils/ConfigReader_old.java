package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader_old {
    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir") + "/config/config.properties";
        FileInputStream fileInputStream = new FileInputStream(filePath);
        Properties properties = new Properties();
        properties.load(fileInputStream);

        String browser = properties.getProperty("browser");
        WebDriver driver = new ChromeDriver();
        String url = properties.getProperty("url");
        driver.get(url);
    }
}
