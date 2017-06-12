package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createUserDefindedKeywordData {

	@DataProvider(name = "userDefinedKeyword")
	public static Object[][] getuserDefinedKeywordData() {

		TestDataReader userDefinedKeywordObj = new TestDataReader(
				"C:\\Users\\dinesh.r\\EnterpriseTestData\\configurationData.xlsx");

		int row = userDefinedKeywordObj.getRowCount(10);
		int col = userDefinedKeywordObj.getColCount(10, 0);

		Object[][] userDefinedKeyword = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				userDefinedKeyword[i - 1][j] = userDefinedKeywordObj.readDataFromFile(10, i, j);
			}
		}

		return userDefinedKeyword;

	}

}
