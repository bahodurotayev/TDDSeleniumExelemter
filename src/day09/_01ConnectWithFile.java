package day09;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class _01ConnectWithFile {
    public static void main(String[] args) throws IOException {
        //1.Locate the properties within the project
        
        String filePath = System.getProperty("user.dir") + "/config/config.properties";
        FileInputStream file = new FileInputStream(filePath);

        Properties properties = new Properties();
        properties.load(file);

        String url = properties.getProperty("url");
        System.out.println("url = " + url);

        String browser = properties.getProperty("browser");
        System.out.println("browser = " + browser);

        // Values
        Collection<Object> values = properties.values();
        for (Object eachValue: values) {
            System.out.println(eachValue);
        }
        // Keys
        Set<Object> objects = properties.keySet();
        for (Object eachKey:objects) {
            System.out.println(eachKey);
        }

        //Keys and Value
        Set<Map.Entry<Object, Object>> entries = properties.entrySet();
        for (Map.Entry<Object,Object> entry: entries){
            System.out.println("Key : " + entry.getKey() + "Value : " + entry.getValue());
        }
    }
}
