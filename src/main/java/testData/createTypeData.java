package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createTypeData {

	@DataProvider(name = "createType")
	public static Object[][] getTypeData() {

		TestDataReader createTypeObj = new TestDataReader("C:\\Users\\dinesh.r\\EnterpriseTestData\\systemSettingData.xlsx");

		int row = createTypeObj.getRowCount(1);
		int col = createTypeObj.getColCount(1, 0);

		Object[][] createType = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createType[i - 1][j] = createTypeObj.readDataFromFile(1, i, j);
			}
		}

		return createType;

	}

}
