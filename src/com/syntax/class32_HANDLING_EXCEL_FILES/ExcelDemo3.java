package com.syntax.class32_HANDLING_EXCEL_FILES;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDemo3 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\cjesc\\Documents\\Batch12\\BookOfBobaFett.xlsx";
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        XSSFWorkbook xlsx = new XSSFWorkbook();
        Sheet sheet = xlsx.createSheet("Tatooine");
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("Boba Fett");
        xlsx.write(fileOutputStream);


    }
}