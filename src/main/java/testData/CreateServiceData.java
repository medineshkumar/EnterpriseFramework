package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class CreateServiceData {

	@DataProvider(name = "createService")
	public static Object[][] getServiceData() {

		TestDataReader createServiceObj = new TestDataReader("C:\\Users\\dinesh.r\\EnterpriseTestData\\systemSettingData.xlsx");

		int row = createServiceObj.getRowCount(0);
		int col = createServiceObj.getColCount(0, 0);

		Object[][] createService = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createService[i - 1][j] = createServiceObj.readDataFromFile(0, i, j);
			}
		}

		return createService;

	}

}
