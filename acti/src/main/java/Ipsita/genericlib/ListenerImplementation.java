package Ipsita.genericlib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	String tcname = result.getName();
	TakesScreenshot ts = (TakesScreenshot)BaseClass.Listenerdriver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File trg = new File ("./FailedScreenshot/"+tcname+".png");
	try {
		FileUtils.copyFile(src, trg);
	} catch (IOException e) {
	
	}
	
	}

}
