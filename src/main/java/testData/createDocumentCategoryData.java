package testData;

import org.testng.annotations.DataProvider;

import genericClasses.TestDataReader;

public class createDocumentCategoryData {

	@DataProvider(name = "createDocumentCategory")
	public static Object[][] getDocumentCategoryData() {

		TestDataReader createDocumentCategoryObj = new TestDataReader(
				"C:\\Users\\dinesh.r\\EnterpriseTestData\\systemSettingData.xlsx");

		int row = createDocumentCategoryObj.getRowCount(4);
		int col = createDocumentCategoryObj.getColCount(4, 0);

		Object[][] createDocumentCategory = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {

				createDocumentCategory[i - 1][j] = createDocumentCategoryObj.readDataFromFile(4, i, j);
			}
		}

		return createDocumentCategory;

	}

}
