package com.stepdefinition;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
@Before
public void beforeExecution() {
launchBrowser();
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
Date d =new Date();
System.out.println(d);

}

@After
public void afterExecution() throws IOException {
screenShot();
System.out.println("ScreenShot Taken");
Date d=new Date();
System.out.println(d);
quit();
}
}