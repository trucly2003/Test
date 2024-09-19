import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


def verifyPage(String objectPath, String expectedPattern) {
	String actualResult = WebUI.getText(findTestObject(objectPath))
	
	boolean isMatch = WebUI.verifyMatch(actualResult, expectedPattern, true, FailureHandling.OPTIONAL)
	
	if(isMatch) {
		WebUI.waitForPageLoad(30)
		WebUI.comment('page load success')
	}else {
		WebUI.comment('No data')
		KeywordUtil.markFailed("No data")
	}
}

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://test-ebms.logtechub.com/en/#/pages/default/home')

WebUI.setText(findTestObject('Object Repository/Page_eBMS-System/input_Language_ng-untouched ng-pristine ng-_8f9a18'), 'intern.lth005@logtechub.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_eBMS-System/input_Language_ng-untouched ng-pristine ng-_b7e998'), 
    'duhHTcrZliwS50omZjJDUg==')

WebUI.click(findTestObject('Object Repository/Page_eBMS-System/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_eBMS-System/span_SOWATCO - HAN_ng-arrow-wrapper'))

WebUI.click(findTestObject('Object Repository/Page_eBMS-System/td_VNHCM'))

WebUI.click(findTestObject('Object Repository/Page_eBMS-System/span_Select'))

WebUI.click(findTestObject('Object Repository/Page_eBMS System (Test)  Sowatco/a_Catalogue'))

WebUI.click(findTestObject('Object Repository/Page_eBMS System (Test)  Sowatco/a_Transport Network'))

WebUI.click(findTestObject('Object Repository/Page_eBMS System (Test)  Sowatco/a_Places'))

WebUI.delay(10)


String expectedPattern = 'Showing [1-9]\\d* to ([1-9]|10)\\d* of \\d+ entries'
verifyPage('Page_Places  eBMS System (Test)  Sowatco/span_Showing 1 to 10 of 414 entries', expectedPattern)

WebUI.click(findTestObject('Page_Distance Between Places  eBMS System (Test)  Sowatco/a_Distance Between Places'))
verifyPage('Page_Distance Between Places  eBMS System (Test)  Sowatco/span_Showing 1 to 10 of 46 entries', expectedPattern)



WebUI.closeBrowser()

