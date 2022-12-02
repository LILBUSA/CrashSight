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
        sheet = wb.getSheetAt(0); // sheet 0 of workbook
        formulaEvaluator = wb.getCreationHelper().createFormulaEvaluator();
    }

    /* returns the cell at the position (vRow, vColumn) of the current sheet
     */
    public Cell getCell(int vRow, int vColumn) {
        String value = null;          //variable for storing the cell value
        try {
            fis = new FileInputStream(file);
            wb = new XSSFWorkbook(fis);
        } catch(IOException e) {
            e.printStackTrace();
        }
        Row row = sheet.getRow(vRow); //returns the logical row
        return row.getCell(vColumn); //returns the cell
    }

    public double readNumericCellData(int vRow, int vColumn) {
        String value = null;          //variable for storing the cell value
        try {
            fis = new FileInputStream(file);
            wb = new XSSFWorkbook(fis);
        } catch(IOException e) {
            e.printStackTrace();
        }
        Row row = sheet.getRow(vRow); //returns the logical row
        Cell cell = row.getCell(vColumn);
        return cell.getNumericCellValue();
    }
}
