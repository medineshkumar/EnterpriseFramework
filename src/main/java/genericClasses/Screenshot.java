package genericClasses;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	// WebDriver driver;

	public static String takescreenshot(WebDriver driver, String path, String filename) {

		TakesScreenshot takescreen = (TakesScreenshot) driver;

		File file = takescreen.getScreenshotAs(OutputType.FILE);

		String destfile = path + filename + ".png";

		try {
			FileUtils.copyFile(file, new File(destfile));
		} catch (IOException e) {

			e.printStackTrace();
		}

		return destfile;
	}
	

	public static void takeFullPageScreenShot(String path){
		
		BufferedImage img;
		try {
			img = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			String finalPath = path+".png";
			ImageIO.write(img, "png", new File(finalPath));
		} catch (HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
