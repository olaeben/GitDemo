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

WebUI.setText(findTestObject('Object Repository/employee_info/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/employee_info/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/employee_info/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/employee_info/Page_OrangeHRM/span_My Info'))

WebUI.click(findTestObject('Object Repository/employee_info/Page_OrangeHRM/input_Employee Full Name_firstName'))

WebUI.click(findTestObject('Object Repository/employee_info/Page_OrangeHRM/input_Employee Full Name_firstName'))

WebUI.click(findTestObject('Object Repository/employee_info/Page_OrangeHRM/div_bianca joePersonal DetailsContact Detai_051e0c'))

WebUI.click(findTestObject('Object Repository/employee_info/Page_OrangeHRM/div_bianca joePersonal DetailsContact Detai_051e0c'))

WebUI.click(findTestObject('Object Repository/employee_info/Page_OrangeHRM/div_bianca joePersonal DetailsContact Detai_051e0c'))

WebUI.click(findTestObject('Object Repository/employee_info/Page_OrangeHRM/input_Employee Full Name_middleName'))

WebUI.click(findTestObject('Object Repository/employee_info/Page_OrangeHRM/input_Employee Full Name_middleName'))

WebUI.doubleClick(findTestObject('Object Repository/employee_info/Page_OrangeHRM/input_Employee Full Name_lastName'))

WebUI.setText(findTestObject('Object Repository/employee_info/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'), 
    'mana')

WebUI.setText(findTestObject('Object Repository/employee_info/Page_OrangeHRM/input_Employee Full Name_firstName'), '49575891')

WebUI.sendKeys(findTestObject('Object Repository/employee_info/Page_OrangeHRM/input_Employee Full Name_firstName'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/employee_info/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'), 
    '49575891')

WebUI.click(findTestObject('Object Repository/employee_info/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'))

WebUI.doubleClick(findTestObject('Object Repository/employee_info/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'))

WebUI.doubleClick(findTestObject('Object Repository/employee_info/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'))

WebUI.click(findTestObject('Object Repository/employee_info/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'))

WebUI.click(findTestObject('Object Repository/employee_info/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'))

WebUI.click(findTestObject('Object Repository/employee_info/Page_OrangeHRM/i_License Expiry Date_oxd-icon bi-calendar _fa83c8'))

WebUI.click(findTestObject('Object Repository/employee_info/Page_OrangeHRM/div_20'))

WebUI.click(findTestObject('Object Repository/employee_info/Page_OrangeHRM/i_License Expiry Date_oxd-icon bi-calendar _fa83c8'))

WebUI.click(findTestObject('Object Repository/employee_info/Page_OrangeHRM/div_20'))

WebUI.click(findTestObject('Object Repository/employee_info/Page_OrangeHRM/span_Female_oxd-radio-input oxd-radio-input_59a84c'))

WebUI.click(findTestObject('Object Repository/employee_info/Page_OrangeHRM/button_Save'))

WebUI.click(findTestObject('Object Repository/employee_info/Page_OrangeHRM/i_(1) Record Found_oxd-icon bi-check oxd-ch_637c94'))

WebUI.click(findTestObject('Object Repository/employee_info/Page_OrangeHRM/input_Test_Field_oxd-input oxd-input--focus'))

WebUI.doubleClick(findTestObject('Object Repository/employee_info/Page_OrangeHRM/input_Test_Field_oxd-input oxd-input--focus'))

WebUI.setText(findTestObject('Object Repository/employee_info/Page_OrangeHRM/input_Test_Field_oxd-input oxd-input--focus'), 
    '445')

WebUI.click(findTestObject('Object Repository/employee_info/Page_OrangeHRM/button_Save'))

WebUI.closeBrowser()

