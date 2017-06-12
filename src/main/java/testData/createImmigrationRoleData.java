package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createImmigrationRoleData {

	@DataProvider(name = "createImmigrationRole")
	public static Object[][] getImmigrationRoleData() {

		TestDataReader createImmigrationRoleObj = new TestDataReader(
				"C:\\Users\\dinesh.r\\EnterpriseTestData\\systemSettingData.xlsx");

		int row = createImmigrationRoleObj.getRowCount(3);
		int col = createImmigrationRoleObj.getColCount(3, 0);

		Object[][] createImmigrationRole = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createImmigrationRole[i - 1][j] = createImmigrationRoleObj.readDataFromFile(3, i, j);
			}
		}

		return createImmigrationRole;

	}

}
