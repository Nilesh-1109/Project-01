package selenium_sep21;

public class sjjjjklksdjsdjfjfv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
        FileOutputStream fos = new FileOutputStream("C:\\Users\\User\\Desktop\\TestData.xlsX");
     	XSSFWorkbook userdata = new XSSFWorkbook(); 
     	XSSFSheet sheet = userdata.getSheet("sheet");
	
    	Row row = sheet.createRow(4);
		Cell cell = row.createCell(2);
		cell.setCellValue("House Number");
		
		userdata.write(fos);
		fos.close();
		   
		
		
	}

}
