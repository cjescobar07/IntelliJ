package com.syntax.class32_HANDLING_EXCEL_FILES;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDemo6 {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\cjesc\\Documents\\Batch12\\Book1.xlsx";
        FileInputStream fileInputStream = new  FileInputStream(path);
        XSSFWorkbook xlsx = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xlsx.getSheetAt(0);
        Row row = sheet.createRow(6);
        row.createCell(0).setCellValue("Son");
        row.createCell(1).setCellValue("Goku");
        row.createCell(2).setCellValue("35");
        row.createCell(3).setCellValue("Planet Vegeta");
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        xlsx.write(fileOutputStream);


    }
}
