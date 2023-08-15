package excel;

import org.testng.annotations.DataProvider;

public class Arraydata {

		@DataProvider(parallel = !true)
	public String[][] getData() {
			String[][] exceldata = ReadExcel.getExceldata();
			String[][] data = new String[3][2];
			
			//r1
			data[0][0] = "naveen4664nk@gmail.com";
			data[0][1] ="Police@1434";
			
			//r2
			data[1][0]="9095133370";
			data[1][1]="9095133370";
			
			data[2][0] ="nk@lovegmail.com";
			data[2][1] ="123@nk";
			
			
			
			
			
			
			
		return data;
		
	}

	}


