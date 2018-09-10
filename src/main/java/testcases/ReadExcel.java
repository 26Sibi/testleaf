package testcases;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public String[][] getData (String fileName) throws IOException {
		
		//Open WorkBook
		XSSFWorkbook wBook = new XSSFWorkbook("./data/"+fileName+".xlsx");
		//Go to Spreadsheet
		XSSFSheet sheet=wBook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		int cellCount = sheet.getRow(0).getLastCellNum();
		String [][] data = new String[rowCount][cellCount];
		for (int i = 1; i <= rowCount; i++) {
			//Go to Row
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < cellCount; j++) {
				//Go to Cell
				XSSFCell cell = row.getCell(j);
				//Read the Data
				data[i-1][j] = cell.getStringCellValue();
				//System.out.println(data);
			}
		}
		wBook.close();
		return data;
	
	}

}
