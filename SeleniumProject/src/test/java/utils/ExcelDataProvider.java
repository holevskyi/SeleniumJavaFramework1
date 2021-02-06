package utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	public static void main(String[] args) {
		testData();
	}
	
	@Test(dataProvider = "test1data")
	public void test1(String Username, String password) {
		System.out.println(Username + " " + password);
	}
	
	@DataProvider(name = "test1data")
	public static Object[][] getData() {
		Object [][] data = testData();
		return data;
	}

	public static Object[][] testData() {
		
		ExcelUtils excel = new ExcelUtils("C:\\Users\\olevs\\eclipse-workspace\\SeleniumProject\\excel\\data.xlsx",
				"Sheet1");
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		Object [][] dataArray = new Object[rowCount][colCount];
		
		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				String cellData = excel.getCellData(i, j);
				dataArray[i-1][j] = excel.getCellData(i, j);
			}
		}
		
		return dataArray;
	}

}
