package com.syntax.class31_READING_CONFIG_FILES;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFilesDemo3 {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\cjesc\\Documents\\Batch12\\trump.properties";
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        Properties properties=new Properties();
        properties.put("IsCrazy","false");
        properties.put("IsRich","True");
        properties.store(fileOutputStream,"Added some new fields");

    }
}
