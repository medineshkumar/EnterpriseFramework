package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class assignmentImmigrationRoleMappingData {

	@DataProvider(name = "assignmentImmigrationRoleMapping")
	public static Object[][] getassignmentImmigrationRoleMappingData() {

		TestDataReader assignmentImmigrationRoleMappingObj = new TestDataReader(
				"C:\\Users\\dinesh.r\\EnterpriseTestData\\configurationData.xlsx");

		int row = assignmentImmigrationRoleMappingObj.getRowCount(5);
		int col = assignmentImmigrationRoleMappingObj.getColCount(5, 0);

		Object[][] assignmentImmigrationRoleMapping = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				assignmentImmigrationRoleMapping[i - 1][j] = assignmentImmigrationRoleMappingObj.readDataFromFile(5, i,
						j);
			}
		}

		return assignmentImmigrationRoleMapping;

	}

}
