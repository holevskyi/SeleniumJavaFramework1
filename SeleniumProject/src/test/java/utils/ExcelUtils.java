package utils;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	private static String path;
	private static String sheetName;

	public ExcelUtils(String path, String sheetName) {
		super();
		this.path = path;
		this.sheetName = sheetName;
	}

	public ExcelUtils() {
		super();
	}
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getSheetName() {
		return sheetName;
	}

	public void setSheetName(String sheetName) {
		this.sheetName = sheetName;
	}

	public static int getRowCount() {
		int rowCount = 0;
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(path);
			XSSFSheet sheet = workbook.getSheet(sheetName);
			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println(rowCount);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return rowCount;
	
	}
	
	public static int getColCount() {
		int colCount = 0;
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(path);
			XSSFSheet sheet = workbook.getSheet(sheetName);
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return colCount;
	
	}
	
	public static String getCellData(int rowNum, int colNum) {
		String cellData = " ";
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(path);
			XSSFSheet sheet = workbook.getSheet(sheetName);
			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return cellData;
	}
	
}
