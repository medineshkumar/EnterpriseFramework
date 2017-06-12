package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class countryTypeForm {

	@DataProvider(name = "countryTypeForm")
	public static Object[][] getcountryTypeFormData() {

		TestDataReader countryTypeFormObj = new TestDataReader(
				"C:\\Users\\dinesh.r\\EnterpriseTestData\\configurationData.xlsx");

		int row = countryTypeFormObj.getRowCount(7);
		int col = countryTypeFormObj.getColCount(7, 0);

		Object[][] countryTypeForm = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				countryTypeForm[i - 1][j] = countryTypeFormObj.readDataFromFile(7, i,
						j);
			}
		}

		return countryTypeForm;

	}

}
