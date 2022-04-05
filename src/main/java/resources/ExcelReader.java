package resources;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {

    private Workbook workbook;

    public ExcelReader() {
        File file = new File("src/test/resources/TestData.xlsx");
        try {
            FileInputStream fs = new FileInputStream(file);
            workbook = new XSSFWorkbook(fs);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Sheet getSheetByName(String sheetName) {
        return workbook.getSheet(sheetName);
    }

    public Row getRowByIndex(Sheet sheet, int index) {
        return sheet.getRow(index);
    }
}