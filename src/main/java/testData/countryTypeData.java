package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class countryTypeData {

	@DataProvider(name = "createCountryType")
	public static Object[][] getcreateCountryTypeData() {

		TestDataReader createCountryTypeObj = new TestDataReader("C:\\Users\\dinesh.r\\EnterpriseTestData\\configurationData.xlsx");

		int row = createCountryTypeObj.getRowCount(1);
		int col = createCountryTypeObj.getColCount(1, 0);

		Object[][] createCountryType = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createCountryType[i - 1][j] = createCountryTypeObj.readDataFromFile(1, i, j);
			}
		}

		return createCountryType;

	}

}
