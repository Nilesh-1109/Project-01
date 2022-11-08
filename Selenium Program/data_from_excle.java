package selenium_sep21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class data_from_excle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     
		FileInputStream file = new FileInputStream("C:\\Users\\User\\Desktop\\");
		XSSFWorkbook userdata = new XSSFWorkbook(file);
		XSSFSheet sheet = userdata.getSheet("sheet1");
		
	System.out.println(	sheet.getRow(3).getCell(2).getStringCellValue());
		
		
		
	}

}
