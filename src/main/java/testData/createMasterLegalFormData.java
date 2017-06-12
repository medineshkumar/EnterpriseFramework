package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createMasterLegalFormData {

	@DataProvider(name = "createMasterLegalForm")
	public static Object[][] getMasterLegalFormData() {

		TestDataReader createMasterLegalFormObj = new TestDataReader("C:\\Users\\dinesh.r\\EnterpriseTestData\\systemSettingData.xlsx");

		int row = createMasterLegalFormObj.getRowCount(9);
		int col = createMasterLegalFormObj.getColCount(9, 0);

		Object[][] createMasterLegalForm = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createMasterLegalForm[i - 1][j] = createMasterLegalFormObj.readDataFromFile(9, i, j);
			}
		}

		return createMasterLegalForm;

	}

}
