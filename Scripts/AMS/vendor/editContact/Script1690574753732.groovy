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

WebUI.click(findTestObject('AMS/vendor/editContact/editName/editName_button'))

WebUI.setText(findTestObject('AMS/vendor/editContact/editName/firstName_textBox'), firstName)

WebUI.setText(findTestObject('AMS/vendor/editContact/editName/lastName_button'), lastName)

WebUI.click(findTestObject('AMS/vendor/editContact/editName/update_button'))

WebUI.click(findTestObject('AMS/vendor/editContact/editAddress/editAddress_button'))

WebUI.setText(findTestObject('AMS/vendor/editContact/editAddress/address1_textBox'), address)

WebUI.setText(findTestObject('AMS/vendor/editContact/editAddress/address2_textBox'), address2)

WebUI.setText(findTestObject('AMS/vendor/editContact/editAddress/city_textBox'), city)

WebUI.selectOptionByLabel(findTestObject('AMS/vendor/editContact/editAddress/state_dropDown'), state, false)

WebUI.setText(findTestObject('AMS/vendor/editContact/editAddress/zip_textBox'), zip)

WebUI.selectOptionByLabel(findTestObject('AMS/vendor/editContact/editAddress/addressType_dropDown'), addressType, false)

WebUI.click(findTestObject('AMS/vendor/editContact/editAddress/updateAddress_button'))

WebUI.click(findTestObject('AMS/vendor/editContact/editPhone_button/editPhone_button'))

WebUI.setText(findTestObject('AMS/vendor/editContact/editPhone_button/phoneNumber_textBox'), phoneNumber)

WebUI.selectOptionByLabel(findTestObject('AMS/vendor/editContact/editPhone_button/phoneType_dropDown'), phoneType, false)

WebUI.click(findTestObject('AMS/vendor/editContact/editPhone_button/updatePhone_button'))

WebUI.click(findTestObject('AMS/vendor/editContact/editEmail/editEmail_button'))

WebUI.setText(findTestObject('AMS/vendor/editContact/editEmail/emailAddress_textBox'), emailAddress)

WebUI.selectOptionByLabel(findTestObject('AMS/vendor/editContact/editEmail/emailType_dropDown'), emailType, false)

WebUI.click(findTestObject('AMS/vendor/editContact/editEmail/updateEmail_button'))

