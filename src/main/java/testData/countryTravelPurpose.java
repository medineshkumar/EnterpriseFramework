package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class countryTravelPurpose {

	@DataProvider(name = "countryTravelPurpose")
	public static Object[][] getcountryTravelPurposeData() {

		TestDataReader countryTravelPurposeObj = new TestDataReader(
				"C:\\Users\\dinesh.r\\EnterpriseTestData\\configurationData.xlsx");

		int row = countryTravelPurposeObj.getRowCount(6);
		int col = countryTravelPurposeObj.getColCount(6, 0);

		Object[][] countryTravelPurpose = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				countryTravelPurpose[i - 1][j] = countryTravelPurposeObj.readDataFromFile(6, i,
						j);
			}
		}

		return countryTravelPurpose;

	}

}
