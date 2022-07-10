package com.cydeo.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {

    @Test
    public void read_from_excel_file() throws IOException {
        String path = "sampleData.xlsx";
        File file = new File(path);

        //to read from excel we need to load it to FileInput Stream
        FileInputStream fileInputStream = new FileInputStream(file);

        //workbook>sheet>row>cell

        // <1> Create a workbook
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        // <2> We need to get specific sheet from currently opened workbook
        XSSFSheet sheet = workbook.getSheet("Employees");

        // <3> Select row and cell
        //Print out Mary's cell
        //Indexes start from 0
        System.out.println(sheet.getRow(1).getCell(0));

        //print out Developer
        System.out.println(sheet.getRow(3).getCell(2));

        //Return the count of used cells only
        //Starts counting from 1
        int userRows = sheet.getPhysicalNumberOfRows();
        System.out.println(userRows);

        //Returns the number from top cell to bottom cell
        //It doesn't care if cell is empty or not
        //Starts counting from 0
        int lastUsedRow = sheet.getLastRowNum();
        System.out.println(lastUsedRow);

        //TODO: Create a logic to print Vinod's name
        for (int rowNum = 0; rowNum < userRows; rowNum++) {


            if (sheet.getRow(rowNum).getCell(0).toString().equals("Vinod")) {
                System.out.println(sheet.getRow(rowNum).getCell(0));
            }
        }

        //TODO: Create a logic to print out Linda's job_ID

    }

}
