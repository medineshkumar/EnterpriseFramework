package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createLicenseData {

	@DataProvider(name = "createLicense")
	public static Object[][] getLicenseData() {

		TestDataReader createLicenseObj = new TestDataReader(
				"C:\\Users\\dinesh.r\\EnterpriseTestData\\superadmin.xlsx");

		int row = createLicenseObj.getRowCount(0);
		int col = createLicenseObj.getColCount(0, 0);

		Object[][] createLicense = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createLicense[i - 1][j] = createLicenseObj.readDataFromFile(0, i, j);
			}
		}

		return createLicense;

	}

}
