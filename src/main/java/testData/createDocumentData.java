package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createDocumentData {

	@DataProvider(name = "createDocument")
	public static Object[][] getDocumentData() {

		TestDataReader createDocumentObj = new TestDataReader("C:\\Users\\dinesh.r\\EnterpriseTestData\\systemSettingData.xlsx");

		int row = createDocumentObj.getRowCount(5);
		int col = createDocumentObj.getColCount(5, 0);

		Object[][] createDocument = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createDocument[i - 1][j] = createDocumentObj.readDataFromFile(5, i, j);
			}
		}

		return createDocument;

	}

}
