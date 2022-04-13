package com.syntax.class31_READING_CONFIG_FILES;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFilesDemo1 {
    public static void main(String[] args) throws IOException {

        // Step 1. locating the file that we want to read
        String path = "Files/Config.properties";

        // Step 2. Navigate to the location
        FileInputStream fileInputStream = new FileInputStream(path);

        // Properties: a special class which know how to read the .properties files
        Properties properties = new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.get("username"));
        System.out.println(properties.get("password"));


    }
}
