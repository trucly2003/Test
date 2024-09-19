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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://test-ebms.logtechub.com/en/#/pages/default/home')

WebUI.setText(findTestObject('Object Repository/Page_eBMS-System/input_Language_ng-untouched ng-pristine ng-_8f9a18'), 'intern.lth005@logtechub.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_eBMS-System/input_Language_ng-untouched ng-pristine ng-_b7e998'), 
    'duhHTcrZliwS50omZjJDUg==')

WebUI.click(findTestObject('Page_eBMS-System/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_eBMS-System/div_SOWATCO - HAN_ng-input'))

WebUI.click(findTestObject('Object Repository/Page_eBMS-System/td_VNHCM'))

WebUI.click(findTestObject('Object Repository/Page_eBMS-System/span_Select'))

WebUI.click(findTestObject('Object Repository/Page_eBMS System (Test)  Sowatco/a_Catalogue'))

WebUI.click(findTestObject('Object Repository/Page_eBMS System (Test)  Sowatco/a_Transport Network'))

WebUI.click(findTestObject('Object Repository/Page_eBMS System (Test)  Sowatco/a_Places'))

String expectedPattern = 'Showing [1-9]\\d* to ([1-9]|10)\\d* of \\d+ entries'

verifyPage('Page_Places  eBMS System (Test)  Sowatco/span_Showing 1 to 10 of 414 entries', expectedPattern)

WebUI.click(findTestObject('Object Repository/Page_Places  eBMS System (Test)  Sowatco/a_Distance Between Places'))

WebUI.click(findTestObject('Page_Distance Between Places  eBMS System (Test)  Sowatco/a_Distance Between Places'))
verifyPage('Page_Distance Between Places  eBMS System (Test)  Sowatco/span_Showing 1 to 10 of 46 entries', expectedPattern)


WebUI.click(findTestObject('Object Repository/Page_Distance Between Places  eBMS System (_ba83dd/a_Route Information'))
verifyPage('Page_Distance Between Places  eBMS System (Test)  Sowatco/span_Showing 1 to 10 of 46 entries', expectedPattern)


WebUI.click(findTestObject('Object Repository/Page_Route Information  eBMS System (Test) _2f7c5c/a_Branch'))
verifyPage('Page_Route Information  eBMS System (Test)  Sowatco/span_Showing 1 to 10 of 89 entries', expectedPattern)

WebUI.click('Object Repository/Page_Branch  eBMS System (Test)  Sowatco/a_Administrative Units')
verifyPage('Page_Branch  eBMS System (Test)  Sowatco/span_Showing 7 to 7 of 7 entrie', expectedPattern)

WebUI.click(findTestObject('Object Repository/Page_Administrative Units  eBMS System (Tes_ce2bc3/a_Partner'))

WebUI.click(findTestObject('Object Repository/Page_Administrative Units  eBMS System (Tes_ce2bc3/a_Partner Group'))

WebUI.click(findTestObject('Object Repository/Page_Partner Group  eBMS System (Test)  Sowatco/a_Partner Group'))

WebUI.click(findTestObject('Object Repository/Page_Partner Group  eBMS System (Test)  Sowatco/a_Partner list'))

WebUI.click(findTestObject('Object Repository/Page_Partner list  eBMS System (Test)  Sowatco/a_Vehicle'))

WebUI.click(findTestObject('Object Repository/Page_Partner list  eBMS System (Test)  Sowatco/a_Vehicle List'))

WebUI.click(findTestObject('Object Repository/Page_Vehicle List  eBMS System (Test)  Sowatco/a_Vehicle Part'))

WebUI.click(findTestObject('Object Repository/Page_Vehicle Part  eBMS System (Test)  Sowatco/a_Vehicle Type'))

WebUI.click(findTestObject('Object Repository/Page_Vehicle Type  eBMS System (Test)  Sowatco/a_Sailor'))

WebUI.click(findTestObject('Object Repository/Page_Vehicle Type  eBMS System (Test)  Sowatco/a_Sailor List'))

WebUI.click(findTestObject('Object Repository/Page_Sailor List  eBMS System (Test)  Sowatco/a_Charge List'))

WebUI.click(findTestObject('Object Repository/Page_Charge List  eBMS System (Test)  Sowatco/a_Unit'))

WebUI.click(findTestObject('Object Repository/Page_Unit  eBMS System (Test)  Sowatco/a_Container Type'))

WebUI.click(findTestObject('Object Repository/Page_Container Type  eBMS System (Test)  Sowatco/a_Container'))

WebUI.click(findTestObject('Object Repository/Page_Container  eBMS System (Test)  Sowatco/a_Currency'))

WebUI.click(findTestObject('Object Repository/Page_Currency  eBMS System (Test)  Sowatco/a_Fuel Type'))

WebUI.click(findTestObject('Object Repository/Page_Fuel Type  eBMS System (Test)  Sowatco/a_Tariff Charge'))

WebUI.click(findTestObject('Object Repository/Page_Tariff Charge  eBMS System (Test)  Sowatco/path'))

WebUI.click(findTestObject('Object Repository/Page_Tariff Charge  eBMS System (Test)  Sowatco/a_Catalogue'))

WebUI.click(findTestObject('Object Repository/Page_Tariff Charge  eBMS System (Test)  Sowatco/a_Transport Network'))

WebUI.click(findTestObject('Object Repository/Page_Tariff Charge  eBMS System (Test)  Sowatco/a_Catalogue'))

WebUI.click(findTestObject('Object Repository/Page_Tariff Charge  eBMS System (Test)  Sowatco/a_Pricing'))

WebUI.click(findTestObject('Object Repository/Page_Tariff Charge  eBMS System (Test)  Sowatco/a_FCL Pricing'))

WebUI.click(findTestObject('Object Repository/Page_Tariff Charge  eBMS System (Test)  Sowatco/a_FCL Selling Price'))

WebUI.click(findTestObject('Object Repository/Page_FCL Selling Price  eBMS System (Test) _3e77ec/a_FCL Buying Price'))

WebUI.click(findTestObject('Object Repository/Page_FCL Buying Price  eBMS System (Test)  Sowatco/a_Bulk Cargo Pricing'))

WebUI.click(findTestObject('Object Repository/Page_FCL Buying Price  eBMS System (Test)  Sowatco/a_Buying Price (By WeightVolume)'))

WebUI.click(findTestObject('Object Repository/Page_Buying Price (By WeightVolume)  eBMS S_e43e86/a_Buying Price (By Trip)'))

WebUI.click(findTestObject('Object Repository/Page_Buying Price (By Trip)  eBMS System (T_4fe0f2/a_Selling Price (By WeightVolume)'))

WebUI.click(findTestObject('Object Repository/Page_Selling Price (By WeightVolume)  eBMS _30721c/a_Selling Price (By Trip)'))

WebUI.click(findTestObject('Object Repository/Page_Selling Price (By Trip)  eBMS System (_34d387/a_Customer Service'))

WebUI.click(findTestObject('Object Repository/Page_Selling Price (By Trip)  eBMS System (_34d387/a_Common'))

WebUI.click(findTestObject('Object Repository/Page_Selling Price (By Trip)  eBMS System (_34d387/a_Sync Booking of partner'))

WebUI.click(findTestObject('Object Repository/Page_Sync Booking of partner  eBMS System (_7fc530/a_FCL'))

WebUI.click(findTestObject('Object Repository/Page_Sync Booking of partner  eBMS System (_7fc530/a_FCL Booking'))

WebUI.click(findTestObject('Object Repository/Page_FCL Booking  eBMS System (Test)  Sowatco/a_FCL Surcharge Behalf'))

WebUI.click(findTestObject('Object Repository/Page_FCL Surcharge Behalf  eBMS System (Tes_17797e/a_FCL Transport Surcharge'))

WebUI.click(findTestObject('Object Repository/Page_FCL Transport Surcharge  eBMS System (_0b961e/a_Bulk Cargo'))

WebUI.click(findTestObject('Object Repository/Page_FCL Transport Surcharge  eBMS System (_0b961e/a_Bulk Cargo Booking'))

WebUI.click(findTestObject('Object Repository/Page_Bulk Cargo Booking  eBMS System (Test)_c5dc16/a_Bulk Cargo Transport Surcharge'))

WebUI.click(findTestObject('Object Repository/Page_Bulk Cargo Transport Surcharge  eBMS S_9356ca/a_Bulk Cargo SurchargeBehalf'))

WebUI.click(findTestObject('Object Repository/Page_Bulk Cargo SurchargeBehalf  eBMS Syste_41867e/a_Operation'))

WebUI.click(findTestObject('Object Repository/Page_Bulk Cargo SurchargeBehalf  eBMS Syste_41867e/a_Common'))

WebUI.click(findTestObject('Object Repository/Page_Bulk Cargo SurchargeBehalf  eBMS Syste_41867e/a_Dispatching'))

WebUI.click(findTestObject('Object Repository/Page_Dispatching  eBMS System (Test)  Sowatco/a_Fuel Closing'))

WebUI.click(findTestObject('Object Repository/Page_Fuel Closing  eBMS System (Test)  Sowatco/a_FCL'))

WebUI.click(findTestObject('Object Repository/Page_Fuel Closing  eBMS System (Test)  Sowatco/a_FCL Transport Request List'))

WebUI.click(findTestObject('Object Repository/Page_FCL Transport Request List  eBMS Syste_583ae5/a_Bulk Cargo'))

WebUI.click(findTestObject('Object Repository/Page_FCL Transport Request List  eBMS Syste_583ae5/a_Bulk Cargo Transport Request List'))

WebUI.click(findTestObject('Object Repository/Page_Bulk Cargo Transport Request List  eBM_6d4e77/a_Revenue Protection - Bulk Cargo'))

WebUI.click(findTestObject('Object Repository/Page_Revenue Protection - Bulk Cargo  eBMS _3fc01e/a_Maintenance and Repair'))

WebUI.click(findTestObject('Object Repository/Page_Revenue Protection - Bulk Cargo  eBMS _3fc01e/a_Maintenance request'))

WebUI.click(findTestObject('Object Repository/Page_Maintenance request  eBMS System (Test_ab4f1c/a_Maintenance Settlement'))

WebUI.click(findTestObject('Object Repository/Page_Maintenance Settlement  eBMS System (T_e94727/a_MR Payment Request'))

WebUI.click(findTestObject('Object Repository/Page_MR Payment Request  eBMS System (Test)_d7ffd4/a_Vehicle MR Plan'))

WebUI.click(findTestObject('Object Repository/Page_Vehicle MR Plan  eBMS System (Test)  Sowatco/a_Vehicle Repair Quotas'))

WebUI.click(findTestObject('Object Repository/Page_Vehicle Repair Quotas  eBMS System (Te_cb1335/a_Maintenance place'))

WebUI.click(findTestObject('Object Repository/Page_Maintenance place  eBMS System (Test) _065fe5/a_Maintenance type'))

WebUI.click(findTestObject('Object Repository/Page_Maintenance type  eBMS System (Test)  Sowatco/a_Material Management'))

WebUI.click(findTestObject('Object Repository/Page_Maintenance type  eBMS System (Test)  Sowatco/a_Import Material'))

WebUI.click(findTestObject('Object Repository/Page_Import Material  eBMS System (Test)  Sowatco/a_Export Material'))

WebUI.click(findTestObject('Object Repository/Page_Export Material  eBMS System (Test)  Sowatco/a_Closing material'))

WebUI.click(findTestObject('Object Repository/Page_Closing material  eBMS System (Test)  Sowatco/a_Accounting'))

WebUI.click(findTestObject('Object Repository/Page_Closing material  eBMS System (Test)  Sowatco/a_Payment Request'))

WebUI.click(findTestObject('Object Repository/Page_Payment Request  eBMS System (Test)  Sowatco/a_Fuel Transaction'))

WebUI.click(findTestObject('Object Repository/Page_Fuel Transaction  eBMS System (Test)  Sowatco/a_SOA list'))

WebUI.click(findTestObject('Object Repository/Page_SOA list  eBMS System (Test)  Sowatco/a_Parameters'))

WebUI.click(findTestObject('Object Repository/Page_Parameters  eBMS System (Test)  Sowatco/a_Cost  Revenue Allocation'))

WebUI.click(findTestObject('Object Repository/Page_Cost  Revenue Allocation  eBMS System _cd8d2e/a_Monthly Fuel Settlement'))

WebUI.click(findTestObject('Object Repository/Page_Monthly Fuel Settlement  eBMS System (_21f97f/a_Partner Debit'))

WebUI.click(findTestObject('Object Repository/Page_Partner Debit  eBMS System (Test)  Sowatco/a_Fuel Payment Request'))

WebUI.click(findTestObject('Object Repository/Page_Fuel Payment Request  eBMS System (Tes_509e0e/a_Unlock Trip Record'))

WebUI.click(findTestObject('Object Repository/Page_Unlock Trip Record  eBMS System (Test)_42f204/a_Receipts'))

WebUI.click(findTestObject('Object Repository/Page_Receipts  eBMS System (Test)  Sowatco/a_Management'))

WebUI.click(findTestObject('Object Repository/Page_Receipts  eBMS System (Test)  Sowatco/a_Authorization'))

WebUI.click(findTestObject('Object Repository/Page_Authorization  eBMS System (Test)  Sowatco/a_System'))

WebUI.click(findTestObject('Object Repository/Page_Authorization  eBMS System (Test)  Sowatco/a_User Info'))

WebUI.click(findTestObject('Object Repository/Page_User Info  eBMS System (Test)  Sowatco/a_Employee'))

WebUI.click(findTestObject('Object Repository/Page_Employee  eBMS System (Test)  Sowatco/a_Role'))

WebUI.click(findTestObject('Object Repository/Page_Role  eBMS System (Test)  Sowatco/a_Permission'))

WebUI.click(findTestObject('Object Repository/Page_Permission  eBMS System (Test)  Sowatco/a_Permission Instruction'))

WebUI.click(findTestObject('Object Repository/Page_Permission Instruction  eBMS System (T_3a982f/a_User Log'))

WebUI.click(findTestObject('Object Repository/Page_User Log  eBMS System (Test)  Sowatco/a_Menu'))

WebUI.closeBrowser()

def verifyPage(String objectPath, String expectedPattern) {
    String actualResult = WebUI.getText(findTestObject(objectPath))

    boolean isMatch = WebUI.verifyMatch(actualResult, expectedPattern, true, FailureHandling.OPTIONAL)

    if (isMatch) {
        WebUI.waitForPageLoad(30)

        WebUI.comment('page load success')
    } else {
        WebUI.comment('No data')

        KeywordUtil.markFailed('No data')
    }
}

