package com.syntax.class32_HANDLING_EXCEL_FILES;

import com.syntax.util.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelReaderTester {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\cjesc\\Documents\\Batch12\\Book1.xlsx";
        List<Map<String,String>> excelData = ExcelReader.getData(path,"Sheet2");
        System.out.println(excelData.get(1).get("FirstName"));
        System.out.println(excelData.get(4).get("Age"));
    }
}
