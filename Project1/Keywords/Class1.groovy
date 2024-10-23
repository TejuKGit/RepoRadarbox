import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Keywords1
 {

	public static void openBrowserAndNavigateToURL(String url) 
	{
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(url)
		WebUI.delay(2)
		WebUI.takeScreenshot()
	}



	public static void landOnAirportview()
	 {
		WebUI.click(findTestObject('Object Repository/New Folder (4)/Page_AirNav RadarBox - Live Flight Tracker _6aae32/svg'))

		WebUI.click(findTestObject('Object Repository/New Folder (4)/Page_AirNav RadarBox - Live Flight Tracker _6aae32/span_Solutions'))

		WebUI.click(findTestObject('Object Repository/New Folder (4)/Page_AirNav RadarBox - Live Flight Tracker _6aae32/span_Flight Tracking'))

		WebUI.click(findTestObject('Object Repository/New Folder (4)/Page_AirNav RadarBox - Live Flight Tracker _6aae32/a_Airport View'))
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.delay(15)
		WebUI.scrollToElement(findTestObject('Object Repository/New Folder (2)/Page_Airport View - AirNav RadarBox - Globa_0ad097/input_Name_full_name'), 0)
	}

	public static void enterDetails(String user, String email)
	 {
		WebUI.delay(5)
		WebUI.setText(findTestObject('Object Repository/New Folder (2)/Page_Airport View - AirNav RadarBox - Globa_0ad097/input_Name_full_name'),
				user)

		WebUI.setText(findTestObject('Object Repository/New Folder (2)/Page_Airport View - AirNav RadarBox - Globa_0ad097/input_Email_email'),
				email)
		WebUI.delay(2)
		WebUI.takeScreenshot()
	}

	public static void closeBrowser() 
	{
		WebUI.delay(2)
		WebUI.closeBrowser()
	}
}
