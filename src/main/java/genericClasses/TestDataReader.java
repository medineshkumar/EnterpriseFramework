package genericClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataReader {

	DataFormatter df = new DataFormatter();

	XSSFWorkbook wbk;
	XSSFSheet sheet;

	int celltype;

	public TestDataReader(String filepath) {

		File file = new File(filepath);
		FileInputStream fis;

		try {
			fis = new FileInputStream(file);
			wbk = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.getMessage();
		} catch (IOException e) {
			e.getMessage();
		}
	}

	public Object readDataFromFile(int sheetnumber, int rownumber, int colnumber) {

		sheet = wbk.getSheetAt(sheetnumber);
		Object data = df.formatCellValue(sheet.getRow(rownumber).getCell(colnumber));
		return data;
	}

	public int getRowCount(int sheetnumber) {
		return wbk.getSheetAt(sheetnumber).getPhysicalNumberOfRows();
	}

	public int getColCount(int sheetnumber, int rownumber) {
		return wbk.getSheetAt(sheetnumber).getRow(rownumber).getPhysicalNumberOfCells();
	}

}
