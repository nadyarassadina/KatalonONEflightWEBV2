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

WebUI.click(findTestObject('AMS/vendor/addNewContact1/newContact_button'))

WebUI.setText(findTestObject('AMS/vendor/addNewContact1/firstName_textBox'), firstName)

WebUI.setText(findTestObject('AMS/vendor/addNewContact1/lastName_textBox'), lastName)

WebUI.setText(findTestObject('AMS/vendor/addNewContact1/phoneNumber_textBox'), phoneNumber)

WebUI.selectOptionByLabel(findTestObject('AMS/vendor/addNewContact1/phoneType_dropDown'), phoneType, false)

WebUI.setText(findTestObject('AMS/vendor/addNewContact1/emailAddress_textBox'), emailAddress)

WebUI.selectOptionByLabel(findTestObject('AMS/vendor/addNewContact1/emailType_dropDown'), emailType, false)

WebUI.click(findTestObject('AMS/vendor/addNewContact1/privateAddress_checkBox'))

WebUI.selectOptionByLabel(findTestObject('AMS/vendor/addNewContact1/addressType'), addressType, false)

WebUI.setText(findTestObject('AMS/vendor/addNewContact1/street1_textBox'), street1)

WebUI.setText(findTestObject('AMS/vendor/addNewContact1/street2_textBox'), street2)

WebUI.setText(findTestObject('AMS/vendor/addNewContact1/city_textBox'), city)

WebUI.selectOptionByLabel(findTestObject('AMS/vendor/addNewContact1/state_dropDown'), state, false)

WebUI.setText(findTestObject('AMS/vendor/addNewContact1/zipcode_textBox'), zipCode)

WebUI.click(findTestObject('AMS/vendor/addNewContact1/save_button'))

