package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createMileStoneFieldData {

	@DataProvider(name = "createMileStoneField")
	public static Object[][] getMileStoneFieldData() {

		TestDataReader createMileStoneFieldObj = new TestDataReader("C:\\Users\\dinesh.r\\EnterpriseTestData\\systemSettingData.xlsx");

		int row = createMileStoneFieldObj.getRowCount(8);
		int col = createMileStoneFieldObj.getColCount(8, 0);

		Object[][] createMileStoneField = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createMileStoneField[i - 1][j] = createMileStoneFieldObj.readDataFromFile(8, i, j);
			}
		}

		return createMileStoneField;

	}

}
