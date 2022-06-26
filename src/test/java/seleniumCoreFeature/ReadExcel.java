package seleniumCoreFeature;

import java.io.FileInputStream;

import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("C:\\Users\\user\\git\\SeleniumCodes\\SeleniumCode\\Book2.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheetAt(0);
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println(cell.getStringCellValue());
	}
}