package com.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\gowth\\eclipse-frameworkspace\\Cucumber\\driver\\chromedriver.exe");
	 driver = new ChromeDriver();
}
public void loadUrl(String url) {
driver.get(url);
}
public void fill(String s,WebElement e){
e.sendKeys(s);
}
public void buttonClk(WebElement e) {
e.click();
}
public String getCurrentUrl() {
return driver.getCurrentUrl();
}
public void screenShot() throws IOException {
TakesScreenshot ts=(TakesScreenshot)driver;
File src = ts.getScreenshotAs(OutputType.FILE);
File f =new File("D:\\Gowtham\\fb.png");
FileUtils.copyFile(src,f);
}
//public void verifyUrl(String s) {
//Assert.assertEquals(s, driver.getCurrentUrl());
//}
public void quit() {
driver.quit();
}

}
