package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class deputationLetterData {

	@DataProvider(name = "deputationLetter")
	public static Object[][] getDeputationLetterData() {

		TestDataReader deputationLetterObj = new TestDataReader(
				"C:\\Users\\dinesh.r\\EnterpriseTestData\\configurationData.xlsx");

		int row = deputationLetterObj.getRowCount(9);
		int col = deputationLetterObj.getColCount(9, 0);

		Object[][] deputationLetter = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				deputationLetter[i - 1][j] = deputationLetterObj.readDataFromFile(9, i,
						j);
			}
		}

		return deputationLetter;

	}

}
