package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties properties;
     public static void loadProperties(String filePath){
         try {
             FileInputStream fileInputStream = new FileInputStream(filePath);
         } catch (FileNotFoundException e) {
             throw new RuntimeException(e);
         }
     }
}
