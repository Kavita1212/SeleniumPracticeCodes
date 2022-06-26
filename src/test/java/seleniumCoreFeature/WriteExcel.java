package seleniumCoreFeature;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WriteExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("C:\\Users\\user\\git\\SeleniumCodes\\SeleniumCode\\Book2.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheetAt(0);
		int lastRow = sheet.getLastRowNum();
		for (int i = 0; i <=lastRow; i++) {
			Row row = sheet.getRow(i);
			Cell cell = row.createCell(2);
			cell.setCellValue("WriteToExcel");
		}
		FileOutputStream fos = new FileOutputStream("C:\\Users\\user\\git\\SeleniumCodes\\SeleniumCode\\Book2.xlsx");
		wb.write(fos);
		fos.close();
	}
}