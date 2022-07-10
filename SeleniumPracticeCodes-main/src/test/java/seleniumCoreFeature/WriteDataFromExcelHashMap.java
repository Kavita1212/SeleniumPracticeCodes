package seleniumCoreFeature;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataFromExcelHashMap {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f = new FileInputStream("");
		
		XSSFWorkbook xs = new XSSFWorkbook(f);
		XSSFSheet sheet = xs.getSheet("1");
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			int key = (int) sheet.getRow(i).getCell(0).getNumericCellValue();
			String value = sheet.getRow(i).getCell(1).getStringCellValue();
			
			map.put(key, value);
			
		}
		Iterator<Entry<Integer,String>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer,String> newMap = itr.next();
			System.out.println(newMap.getKey() + " | "+newMap.getValue());
		}
		//xs.close();
		f.close();
		
		

	}

}
