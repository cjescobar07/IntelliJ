package com.syntax.class31_READING_CONFIG_FILES;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class NewTask1 {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\cjesc\\Documents\\Batch12\\facebook.properties";
        FileOutputStream fileOutputStream=new FileOutputStream(path);

        Properties properties=new Properties();
        properties.put("Browser", "Chrome");
        properties.put("URL","https://facebook.com");
        properties.put("username", "user");
        properties.put("password","password123");

        properties.store(fileOutputStream, "updated configs");

        System.out.println(properties.get("username"));
        System.out.println(properties.get("password"));
    }
}
