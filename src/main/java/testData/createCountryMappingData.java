package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createCountryMappingData {

	@DataProvider(name = "createCountryMapping")
	public static Object[][] getcreateCountryMappingData() {

		TestDataReader createCountryMappingObj = new TestDataReader("C:\\Users\\dinesh.r\\EnterpriseTestData\\configurationData.xlsx");

		int row = createCountryMappingObj.getRowCount(0);
		int col = createCountryMappingObj.getColCount(0, 0);

		Object[][] createCountryMapping = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createCountryMapping[i - 1][j] = createCountryMappingObj.readDataFromFile(0, i, j);
			}
		}

		return createCountryMapping;

	}

}
