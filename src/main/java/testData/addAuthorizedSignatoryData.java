package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class addAuthorizedSignatoryData {

	@DataProvider(name = "addAuthorizedSignatory")
	public static Object[][] getAuthorizedSignatoryData() {

		TestDataReader authorizedSignatoryObj = new TestDataReader("C:\\Users\\dinesh.r\\EnterpriseTestData\\configurationData.xlsx");

		int row = authorizedSignatoryObj.getRowCount(4);
		int col = authorizedSignatoryObj.getColCount(4, 0);

		Object[][] authorizedSignatory = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				authorizedSignatory[i - 1][j] = authorizedSignatoryObj.readDataFromFile(4, i, j);
			}
		}

		return authorizedSignatory;

	}

}
