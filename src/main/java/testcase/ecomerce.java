package testcase;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import base.base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ecomerce extends base{
	
	@Test
	public void mySeconedtest() throws MalformedURLException, InterruptedException 
	
	{
		AndroidDriver<AndroidElement> driver =capabilities();
		Thread.sleep(5000);
	}
	
	
	@Test
	
	public static void myFirstTest() {
		
		String WhatsYourName =myName();
		System.out.print(WhatsYourName);
		 
	}

}
