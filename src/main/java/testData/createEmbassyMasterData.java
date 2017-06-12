package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createEmbassyMasterData {

	@DataProvider(name = "createEmbassyMaster")
	public static Object[][] getEmbassyMasterData() {

		TestDataReader creatEmbassyMasterObj = new TestDataReader(
				"C:\\Users\\dinesh.r\\EnterpriseTestData\\superadmin.xlsx");

		int row = creatEmbassyMasterObj.getRowCount(1);
		int col = creatEmbassyMasterObj.getColCount(1, 0);

		Object[][] createEmbassyMaster = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createEmbassyMaster[i - 1][j] = creatEmbassyMasterObj.readDataFromFile(1, i, j);
			}
		}

		return createEmbassyMaster;

	}

}
