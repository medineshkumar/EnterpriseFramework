package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createBeneficiaryData {

	@DataProvider(name = "createBenificiary")
	public static Object[][] getcreateBenificiaryData() {

		TestDataReader createBenificiaryObj = new TestDataReader("C:\\Users\\dinesh.r\\EnterpriseTestData\\organisationData.xlsx");

		int row = createBenificiaryObj.getRowCount(0);
		int col = createBenificiaryObj.getColCount(0, 0);

		Object[][] createBenificiary = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createBenificiary[i - 1][j] = createBenificiaryObj.readDataFromFile(0, i, j);
			}
		}

		return createBenificiary;

	}

}
