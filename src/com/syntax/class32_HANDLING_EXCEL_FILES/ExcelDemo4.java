package com.syntax.class32_HANDLING_EXCEL_FILES;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDemo4 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\cjesc\\Documents\\Batch12\\Book2.xlsx";
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        XSSFWorkbook xlsx = new XSSFWorkbook();
        Sheet sheet = xlsx.createSheet("Sheet1");

        for (int i = 0; i < 10; i++){
            Row row = sheet.createRow(i);
        for (int j = 0; j < 10; j++){
            Cell cell = row.createCell(j);
            cell.setCellValue(i+ " " + j);
             }
        }
        xlsx.write(fileOutputStream);



    }
}
