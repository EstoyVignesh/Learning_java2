package com.apache.excel;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		//XSSFWorkbook
		//XSSFSheet
		//XSSFRow
		//XSSCell
		try
		{
			XSSFWorkbook workbook1 = new XSSFWorkbook("C:\\Users\\arvin\\eclipse-workspace\\Mavenone\\src\\test\\resources\\exceldata1.xlsx");
			
			XSSFSheet sheet1 = workbook1.getSheetAt(0);
			
			XSSFRow firstRow1 = sheet1.getRow(0);
			
			int rows = sheet1.getPhysicalNumberOfRows();
			
			int row = firstRow1.getPhysicalNumberOfCells();
			
			for(int i =0;i<rows;i++)
			{
				for(int j=0;j<row;j++)
				{
					
					String cellVal = sheet1.getRow(i).getCell(j).getStringCellValue();
					
					System.out.println("cellVal --> : "+cellVal);
				}
			}
			

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

			
			
			
			
			
			
		}
	}


