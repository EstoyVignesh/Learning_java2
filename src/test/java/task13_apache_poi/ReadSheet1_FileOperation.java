package task13_apache_poi;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadSheet1_FileOperation {

	public static void main(String[] args) {
	
		
		try
		{
		
		XSSFWorkbook workbook= new XSSFWorkbook("C:\\Users\\arvin\\eclipse-workspace\\selenium_learning\\src\\test\\resources\\exceldata.xlsx");

		}
		catch(Exception ex)
		{
			
			ex.printStackTrace();
		}
	}

}
