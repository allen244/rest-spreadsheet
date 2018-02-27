package com.avs.restspreadsheet.utils;

import com.avs.restspreadsheet.domain.Column;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
@Slf4j
public class ReadSpreadSheetHelper {


    public ReadSpreadSheetHelper() {
    }


    private static final String FILE_NAME = "test.xlsx";

    public static void main(String[] args) {
        ReadSpreadSheetHelper helper = new ReadSpreadSheetHelper();
        helper.readColumNames();

    }

    public List<String> readColumNames() {
        Column column = new Column();
        try {

            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet datatypeSheet = workbook.getSheetAt(0);
            Iterator<Row> iterator = datatypeSheet.iterator();


            while (iterator.hasNext()) {

                Row currentRow = iterator.next();
                Iterator<Cell> cellIterator = currentRow.iterator();

                while (cellIterator.hasNext()) {

                    Cell currentCell = cellIterator.next();

                    if (currentCell.getCellTypeEnum() == CellType.STRING) {
                        System.out.print(currentCell.getStringCellValue() + "--");

                        System.out.println(CellReference.convertNumToColString(currentCell.getColumnIndex()));

                        column.addColumn(currentCell.getStringCellValue());

                    }
                }

                break;
            }


        } catch (FileNotFoundException e) {

            log.warn(e.getMessage());

        } catch (IOException e) {
            log.warn(e.getMessage());
        }

        return column.getColumns();
    }
}