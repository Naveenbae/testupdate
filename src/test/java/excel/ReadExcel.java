package excel;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] getExceldata() {
		
		 String filelocation = "./test-data/login-data.xlsx";
		 XSSFWorkbook wk = null;
		try {
			wk = new XSSFWorkbook(filelocation);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 XSSFSheet sheet = wk.getSheetAt(0);
		 int lastRowNum = sheet.getLastRowNum();
		 int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		 System.out.println("Phy num: "+physicalNumberOfRows);
		 System.out.println("no of last row: "+lastRowNum);
		 short lastCellNum = sheet.getRow(0).getLastCellNum();
		 System.out.println("no of cell: "+lastCellNum);
		 String[][] data = new String[lastRowNum][lastCellNum];
		 for (int i = 1 ; i <= lastRowNum ; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter dt = new DataFormatter();
				String value = dt.formatCellValue(cell);
				//String value = cell.getStringCellValue();
				System.out.println(value);
				data[i-1][j] = value;
				
				
				
			} 
		}
		return data;
		 
	}

}

