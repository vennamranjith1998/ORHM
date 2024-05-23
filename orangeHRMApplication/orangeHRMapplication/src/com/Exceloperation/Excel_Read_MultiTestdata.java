package com.Exceloperation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_MultiTestdata 
{
	public static void main(String[] args) throws IOException {
		FileInputStream testDataFile = new FileInputStream("./src/com/ExtenalFiles/TestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(testDataFile);
		XSSFSheet testDataSheet = workBook.getSheet("Sheet1");

			// Identifying the Number of Active Rows(only Rows with TestData)  in the Sheet

			int rowsCount=testDataSheet.getLastRowNum();

			// To to Every Active Row of the Sheet
			for(int rowIndex=0;rowIndex<=rowsCount;rowIndex++)
			{
			// going to a particular Row in the Sheet
				Row row=testDataSheet.getRow(rowIndex);

			// of the Current Active Row - finding the Number of active Cells in it
				int rowOfCellsCount=row.getLastCellNum();

			// to goto Every Active Row of Its Corresponding Active Cells
				for(int rowOfCellIndex=0;rowOfCellIndex<rowOfCellsCount;rowOfCellIndex++)
				{
			// To goto an Active Row of its corresponding Active Cell
						Cell rowOfActiveCell=row.getCell(rowOfCellIndex);

			// get the Test data from the Active Row of an Active Cell
						String testData=rowOfActiveCell.getStringCellValue();

						System.out.print(testData+"  ");

				}

				System.out.println();
			}
		


			

		}


		
	}


