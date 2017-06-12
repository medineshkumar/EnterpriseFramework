package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createVendorTestData {

	@DataProvider(name = "createVendor")
	public static Object[][] getcreateVendorData() {

		TestDataReader createVendorObj = new TestDataReader("C:\\Users\\dinesh.r\\EnterpriseTestData\\usermanagementData.xlsx");

		int row = createVendorObj.getRowCount(0);
		int col = createVendorObj.getColCount(0, 0);

		Object[][] createVendor = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createVendor[i - 1][j] = createVendorObj.readDataFromFile(0, i, j);
			}
		}

		return createVendor;

	}

}
