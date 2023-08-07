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

WebUI.click(findTestObject('AMS/vendor/editContact/addAddress/addAddress_button'))

WebUI.setText(findTestObject('AMS/vendor/editContact/addAddress/address_testBox'), address)

WebUI.setText(findTestObject('AMS/vendor/editContact/addAddress/address2_textBox'), address2)

WebUI.setText(findTestObject('AMS/vendor/editContact/addAddress/city_textBox'), city)

WebUI.selectOptionByLabel(findTestObject('AMS/vendor/editContact/addAddress/state_dropDown'), state, false)

WebUI.setText(findTestObject('AMS/vendor/editContact/addAddress/zip_textBox'), zip)

WebUI.selectOptionByLabel(findTestObject('AMS/vendor/editContact/addAddress/addressType_dropDown'), addressType, false)

WebUI.click(findTestObject('AMS/vendor/editContact/addAddress/add_button'))

WebUI.click(findTestObject('AMS/vendor/editContact/addPhone/addPhone_button'))

WebUI.setText(findTestObject('AMS/vendor/editContact/addPhone/phoneNumber_textBox'), phoneNumber)

WebUI.selectOptionByLabel(findTestObject('AMS/vendor/editContact/addPhone/phoneType_dropDown'), phoneType, false)

WebUI.click(findTestObject('AMS/vendor/editContact/addPhone/add_button'))

WebUI.click(findTestObject('AMS/vendor/editContact/addEmail/addEmail_button'))

WebUI.setText(findTestObject('AMS/vendor/editContact/addEmail/emailAddress_textBox'), emailAddress)

WebUI.selectOptionByLabel(findTestObject('AMS/vendor/editContact/addEmail/emailType_dropDown'), emailType, false)

WebUI.click(findTestObject('AMS/vendor/editContact/addEmail/add_button'))

