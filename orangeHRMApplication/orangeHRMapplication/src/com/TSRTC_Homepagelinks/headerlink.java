package com.TSRTC_Homepagelinks;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class headerlink {
	public static void main(String[] args) throws IOException {
		
		FileInputStream testDataFile=new FileInputStream("./src/com/ExtenalFiles/TestData - Copy.xlsx");
		XSSFWorkbook workBook1=new XSSFWorkbook(testDataFile);
		XSSFSheet  sheet=workBook1.getSheet("Orange HRM Application");
		       Row   rowTestData= sheet.getRow(0);
		       Cell  rowOfCellTest=rowTestData.getCell(0);
		       String RowOfCallTestData=rowOfCellTest.getStringCellValue();
		       System.out.println(RowOfCallTestData);
	}

}
