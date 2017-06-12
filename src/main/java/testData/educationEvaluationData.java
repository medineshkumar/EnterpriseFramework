package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class educationEvaluationData {

	@DataProvider(name = "educationEvaluation")
	public static Object[][] geteducationEvaluationData() {

		TestDataReader educationEvaluationObj = new TestDataReader(
				"C:\\Users\\dinesh.r\\EnterpriseTestData\\configurationData.xlsx");

		int row = educationEvaluationObj.getRowCount(11);
		int col = educationEvaluationObj.getColCount(11, 0);

		Object[][] educationEvaluation = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				educationEvaluation[i - 1][j] = educationEvaluationObj.readDataFromFile(11, i, j);
			}
		}

		return educationEvaluation;

	}

}
