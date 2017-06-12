package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class supportLetterData {

	@DataProvider(name = "supportLetter")
	public static Object[][] getSupportLetterData() {

		TestDataReader supportLetterObj = new TestDataReader(
				"C:\\Users\\dinesh.r\\EnterpriseTestData\\configurationData.xlsx");

		int row = supportLetterObj.getRowCount(8);
		int col = supportLetterObj.getColCount(8, 0);

		Object[][] supportLetter = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				supportLetter[i - 1][j] = supportLetterObj.readDataFromFile(8, i,
						j);
			}
		}

		return supportLetter;

	}

}
