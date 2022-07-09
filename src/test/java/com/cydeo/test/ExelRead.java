package com.cydeo.test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExelRead {
    @Test
    public void read_from_exel_file() throws IOException {
        String path = "Sample_Data.xlsx";
        File file = new File( path );

        //to read from exel we need to load file input stream
        FileInputStream fileInputStream = new FileInputStream( path );
        //workBook> sheet>row>cell
        //create a workBook
        XSSFWorkbook workbook = new XSSFWorkbook( fileInputStream );

        //how to get specific sheet from currently open workbook
        XSSFSheet sheet = workbook.getSheet( "Employees" );

        //how to get row and cell
        //print out 1 sell, indexes starting from 0;
        System.out.println( sheet.getRow( 1 ).getCell( 0 ) );
        //print out developer
        System.out.println( sheet.getRow( 3 ).getCell( 2 ) );
        //return number of used cells only  started from 1. did not count empty rows
        int used_rows = sheet.getPhysicalNumberOfRows();
        System.out.println( "used_rows = " + used_rows );

        //return the number from top cell to bottom, count all(even empty). Started from 0
        int lastUsedRow = sheet.getLastRowNum();
        System.out.println( "lastUsedRow = " + lastUsedRow );

        //todo create a logic to print Alex name
        for (int rowNum = 0; rowNum < used_rows; rowNum++) {
            if (sheet.getRow( rowNum ).getCell( 0 ).toString().equals( "Alex" )) {
                System.out.println( "rowNum = " + sheet.getRow( rowNum ).getCell( 0 ) );
            }
        }
        //todo create a logic to print Alex job id
        //check out what name is alex and his id
        for (int rowNum = 0; rowNum < used_rows; rowNum++) {
            if (sheet.getRow( rowNum ).getCell( 0 ).toString().equals( "Alex" )) {
                System.out.println( "Alex job id = " + sheet.getRow( rowNum ).getCell( 2 ) );
            }

        }
    }
}
