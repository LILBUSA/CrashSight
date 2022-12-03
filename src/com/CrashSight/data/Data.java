package com.CrashSight.data;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;

import java.io.IOException;

public class Data {
    private final ExcelReader reader = new ExcelReader("CrashSight\\assets\\Housing_Data.xlsx"); // finished xlsx file will be stored here
    private DataSet delinquent_mortgage, household_debt, leverage, subprime_mortgage, special_loan, builders_sentiment, housing_inventory, mortgage_rates, difference_housingprices_rent; // all current variables expected be used
    private DataSet[] sets = new DataSet[] {delinquent_mortgage, household_debt, leverage, subprime_mortgage, special_loan, builders_sentiment, housing_inventory, mortgage_rates, difference_housingprices_rent};

    public Data() throws IOException { // constructor for Data object
         sets = updateData(sets);
    }

    public DataSet[] updateData(DataSet[] sets) {
        for (int i = 0; i < reader.wb.getNumberOfSheets(); i++) {
            for (int r = 1; i < reader.sheet.getPhysicalNumberOfRows(); i++) {
                sets[i].addPoint(new DataPoint((int)reader.readNumericCellData(r, 0), (int)reader.readNumericCellData(r, 1), reader.readNumericCellData(r, 2)));
//                Cell cell = reader.readCellData(r, 0);
//                    cell.getStringCellValue();
//                int c = 1;
//                do {
//                    cell = reader.readCellData(r, c);
//
//                } while (cell.getCellType() != CellType.BLANK);
            }
        }
        return sets;
    }
}
