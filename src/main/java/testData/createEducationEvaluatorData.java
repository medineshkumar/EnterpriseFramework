package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createEducationEvaluatorData {

	@DataProvider(name = "createEducationEvaluator")
	public static Object[][] getEducationEvaluatorData() {

		TestDataReader createEducationEvaluatorObj = new TestDataReader("C:\\Users\\dinesh.r\\EnterpriseTestData\\systemSettingData.xlsx");

		int row = createEducationEvaluatorObj.getRowCount(7);
		int col = createEducationEvaluatorObj.getColCount(7, 0);

		Object[][] createEducationEvaluator = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createEducationEvaluator[i - 1][j] = createEducationEvaluatorObj.readDataFromFile(7, i, j);
			}
		}

		return createEducationEvaluator;

	}

}
