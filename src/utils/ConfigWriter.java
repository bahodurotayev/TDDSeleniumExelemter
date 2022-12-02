package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigWriter {
    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir") + "/config/config.properties";
        FileInputStream file = new FileInputStream(filePath);
        Properties properties = new Properties();
        properties.load(file);

        properties.setProperty("Phone", "2313536");
        properties.setProperty("Email", "bo@bo.com");

        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        properties.store(fileOutputStream, "adding phone number");



    }
}
