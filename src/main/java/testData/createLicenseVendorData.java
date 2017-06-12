package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createLicenseVendorData {

	@DataProvider(name = "createLicenseVendor")
	public static Object[][] getLicenseVendorData() {

		TestDataReader createLicenseVendorObj = new TestDataReader("C:\\Users\\dinesh.r\\EnterpriseTestData\\systemSettingData.xlsx");

		int row = createLicenseVendorObj.getRowCount(10);
		int col = createLicenseVendorObj.getColCount(10, 0);

		Object[][] createLicenseVendorForm = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createLicenseVendorForm[i - 1][j] = createLicenseVendorObj.readDataFromFile(10, i, j);
			}
		}

		return createLicenseVendorForm;

	}

}
