package com.week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData{

	
	public  static String[][] readData() throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./day1/Data.xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");		
		int rowcount = ws.getLastRowNum();
		System.out.println(rowcount);	
		int columncount = ws.getRow(0).getLastCellNum();
		System.out.println(columncount);
		String cellval = ws.getRow(1).getCell(1).getStringCellValue();
		System.out.println(cellval);
		String[][] data = new String[rowcount][columncount];
		for(int i=0;i<=rowcount;i++) {
			
			for(int j=0;j<=columncount;j++) {
				
				String alldata = ws.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j] = alldata;
				
			}			
		}
		wb.close();
		return data;
	}		
}
