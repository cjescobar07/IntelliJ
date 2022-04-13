package com.syntax.class32_HANDLING_EXCEL_FILES;

import com.syntax.util.ConfigReader;

import java.io.IOException;

public class ConfigReaderTester {
    public static void main(String[] args) throws IOException {
        System.out.println(ConfigReader.getProperty("URL"));
        System.out.println(ConfigReader.getProperty("password"));
    }
}
