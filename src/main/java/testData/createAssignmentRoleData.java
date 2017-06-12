package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createAssignmentRoleData {

	@DataProvider(name = "createAssignmentRole")
	public static Object[][] getAssignmentRoleData() {

		TestDataReader createAssignmentRoleObj = new TestDataReader(
				"C:\\Users\\dinesh.r\\EnterpriseTestData\\systemSettingData.xlsx");

		int row = createAssignmentRoleObj.getRowCount(2);
		int col = createAssignmentRoleObj.getColCount(2, 0);

		Object[][] createAssignmentRole = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createAssignmentRole[i - 1][j] = createAssignmentRoleObj.readDataFromFile(2, i, j);
			}
		}

		return createAssignmentRole;

	}

}
