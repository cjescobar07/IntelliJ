package com.syntax.class31_READING_CONFIG_FILES;

import java.io.*;
import java.util.Properties;

public class PropertiesFilesDemo4 {
    public static void main(String[] args) throws IOException {

        // path of the file
        String path ="Files/Config.properties";

        // FileInputStream helps us read the data from a file
        FileInputStream fileInputStream  = new FileInputStream(path);

        // Special class that lets us read the data from .properties files
        Properties properties = new Properties();

        // Reads the existing data and storing in the properties
        properties.load(fileInputStream);

        // Adds new properties
        properties.put("URL", "www.google.com");

        // Creates a file on mentioned path
        FileOutputStream fileOutputStream = new FileOutputStream(path);

        // Stores all the data from the object inside that file
        properties.store(fileOutputStream, "added new property URL");

    }
}
