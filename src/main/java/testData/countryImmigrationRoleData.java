package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class countryImmigrationRoleData {

	@DataProvider(name = "countryImmigrationRole")
	public static Object[][] getcountryImmigrationRoleData() {

		TestDataReader countryImmigrationRoleObj = new TestDataReader("C:\\Users\\dinesh.r\\EnterpriseTestData\\configurationData.xlsx");

		int row = countryImmigrationRoleObj.getRowCount(3);
		int col = countryImmigrationRoleObj.getColCount(3, 0);

		Object[][] countryImmigrationRole = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				countryImmigrationRole[i - 1][j] = countryImmigrationRoleObj.readDataFromFile(3, i, j);
			}
		}

		return countryImmigrationRole;

	}

}
