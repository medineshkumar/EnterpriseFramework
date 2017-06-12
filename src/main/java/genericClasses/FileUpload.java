package genericClasses;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileUpload {

	public static void setPath(String path){
		StringSelection string = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(string, null);
	}
		
	public static void uploadFile(String filePath){
		
		setPath(filePath);
		
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
		} catch (AWTException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
