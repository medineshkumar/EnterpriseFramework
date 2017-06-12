package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createTravelPurposeData {

	@DataProvider(name = "createTravelPurpose")
	public static Object[][] getTravelPurposeData() {

		TestDataReader createTravelPurposeObj = new TestDataReader("C:\\Users\\dinesh.r\\EnterpriseTestData\\systemSettingData.xlsx");

		int row = createTravelPurposeObj.getRowCount(6);
		int col = createTravelPurposeObj.getColCount(6, 0);

		Object[][] createTravelPurpose = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createTravelPurpose[i - 1][j] = createTravelPurposeObj.readDataFromFile(6, i, j);
			}
		}

		return createTravelPurpose;

	}

}
