package task13_apache_poi;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadSheet1_FileOperation {

	public static void main(String[] args) {
	
		
		try
		{
		
			// to Mention the file path, use this below 
			XSSFWorkbook workbook= new XSSFWorkbook("C:\\Users\\arvin\\eclipse-workspace\\Mavenone\\src\\test\\resources\\Sheet1.xlsx");
			
			//To read the index from 0th Row and 0th Column
			//XSSFSheet sheet= workbook.getSheet("data");
			XSSFSheet sheet= workbook.getSheetAt(0);
			
			//to go to first row
			XSSFRow firstRow= sheet.getRow(0);
			
			//To get the Total No. of Rows
			int rows= sheet.getPhysicalNumberOfRows(); // no of rows (5)
			
			//To get the Total No. of Columns
			int cells= firstRow.getPhysicalNumberOfCells(); //no of columns(3)
			
			
			//To start iteration Start from Row 0
			for(int i=1; i<rows;i++)

			{
				
				//To start iteration Start from Column 0
				for(int j=0; j<cells;j++)
				{
					
					//To get the value of Row, Column and the String Value
				//	String cellValue=sheet.getRow(i).getCell(j).getStringCellValue();
					String cellValue=sheet.getRow(i).getCell(j).getStringCellValue();

					
					//To write to an excel on a particular row
					//sheet.createRow(5).createCell(0).setCellValue("writing");
					
					System.out.println ("Cell value-->"+cellValue);
					
				} 
			}
			
			
		}
		catch(Exception ex)
		{
			
			ex.printStackTrace();
		}
	}

}
