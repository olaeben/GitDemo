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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/Leave_hrm/Page_OrangeHRM/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Leave_hrm/Page_OrangeHRM/Page_OrangeHRM/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Leave_hrm/Page_OrangeHRM/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/Leave_hrm/Page_OrangeHRM/Page_OrangeHRM/span_Leave'))

WebUI.click(findTestObject('Object Repository/Leave_hrm/Page_OrangeHRM/Page_OrangeHRM/i_More_oxd-icon bi-three-dots-vertical'))

WebUI.click(findTestObject('Object Repository/Leave_hrm/Page_OrangeHRM/Page_OrangeHRM/a_Leave List'))

WebUI.doubleClick(findTestObject('Object Repository/Leave_hrm/Page_OrangeHRM/Page_OrangeHRM/input_From Date_oxd-input oxd-input--focus'))

WebUI.setText(findTestObject('Object Repository/Leave_hrm/Page_OrangeHRM/Page_OrangeHRM/input_From Date_oxd-input oxd-input--focus'), 
    '2024-04-05')

WebUI.setText(findTestObject('Object Repository/Leave_hrm/Page_OrangeHRM/Page_OrangeHRM/input_From Date_oxd-input oxd-input--focus'), 
    '2024-20-06')

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/div_Employee Name'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/Leave_hrm/Page_OrangeHRM/Page_OrangeHRM/div_-- Select --'))

WebUI.click(findTestObject('Object Repository/Leave_hrm/Page_OrangeHRM/Page_OrangeHRM/button_Search'))

WebUI.verifyAlertNotPresent(0)

WebUI.click(findTestObject('Object Repository/Leave_hrm/Page_OrangeHRM/Page_OrangeHRM/button_Reset'))

WebUI.closeBrowser()

