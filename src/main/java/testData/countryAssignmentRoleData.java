package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class countryAssignmentRoleData {

	@DataProvider(name = "countryAssignmentRole")
	public static Object[][] getcountryAssignmentRoleData() {

		TestDataReader countryAssignmentRoleObj = new TestDataReader("C:\\Users\\dinesh.r\\EnterpriseTestData\\configurationData.xlsx");

		int row = countryAssignmentRoleObj.getRowCount(2);
		int col = countryAssignmentRoleObj.getColCount(2, 0);

		Object[][] countryAssignmentRole = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				countryAssignmentRole[i - 1][j] = countryAssignmentRoleObj.readDataFromFile(2, i, j);
			}
		}

		return countryAssignmentRole;

	}

}
