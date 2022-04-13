package com.syntax.class32_HANDLING_EXCEL_FILES;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo1 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\cjesc\\Documents\\Batch12\\Book1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xlsx = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xlsx.getSheet("Sheet1");
        System.out.println(xlsx.getSheetIndex("Sheet1"));
        System.out.print(sheet.getRow(0).getCell(0)+" ");
        System.out.println(sheet.getRow(0).getCell(1));

        System.out.print(sheet.getRow(1).getCell(0)+" ");
        System.out.println(sheet.getRow(1).getCell(1));

        System.out.print(sheet.getRow(2).getCell(0)+" ");
        System.out.println(sheet.getRow(2).getCell(1));

        System.out.print(sheet.getRow(3).getCell(0)+" ");
        System.out.println(sheet.getRow(3).getCell(1));

        System.out.print(sheet.getRow(4).getCell(0)+" ");
        System.out.println(sheet.getRow(4).getCell(1));
    }

}
