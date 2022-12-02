package com.CrashSight.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
    File file;
    FileInputStream fis;
    XSSFWorkbook wb;
    XSSFSheet sheet;
    FormulaEvaluator formulaEvaluator;
    DataFormatter formatter = new DataFormatter();
    public ExcelReader(String pathName) throws IOException {
        file = new File(pathName);
        fis = new FileInputStream(file);
        wb = new XSSFWorkbook(fis);
        sheet = wb.getSheetAt(0);
        formulaEvaluator = wb.getCreationHelper().createFormulaEvaluator();
    }

    public String readCellData(int vRow, int vColumn) {
        String value = null;          //variable for storing the cell value
        Workbook wb = null;           //initialize Workbook null
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\bigta\\IdeaProjects\\Event Token Calculator\\assets\\championstats.xlsx");
            wb = new XSSFWorkbook(fis);
        } catch(IOException e) {
            e.printStackTrace();
        }
        Sheet sheet = wb.getSheetAt(0);   //getting the XSSFSheet object at given index
        Row row = sheet.getRow(vRow); //returns the logical row
        Cell cell = row.getCell(vColumn); //getting the cell representing the given column
        value = formatter.formatCellValue(cell);    //getting cell value
        return value;               //returns the cell value
    }
}
