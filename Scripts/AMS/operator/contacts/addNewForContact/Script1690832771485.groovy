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

WebUI.click(findTestObject('AMS/operator/addNewForContact/addNewAddress/newAddress_button'))

WebUI.setText(findTestObject('AMS/operator/addNewForContact/addNewAddress/addressLine1_textBox'), addressLine1)

WebUI.setText(findTestObject('AMS/operator/addNewForContact/addNewAddress/addressLine2_textBox'), addressLine2)

WebUI.setText(findTestObject('AMS/operator/addNewForContact/addNewAddress/city_textBox'), city)

WebUI.selectOptionByLabel(findTestObject('AMS/operator/addNewForContact/addNewAddress/state_dropDown'), state, false)

WebUI.setText(findTestObject('AMS/operator/addNewForContact/addNewAddress/zipcode_textBox'), zip)

WebUI.selectOptionByLabel(findTestObject('AMS/operator/addNewForContact/addNewAddress/country_dropDown'), country, false)

WebUI.selectOptionByLabel(findTestObject('AMS/operator/addNewForContact/addNewAddress/addressType_dropDown'), addressType, 
    false)

WebUI.click(findTestObject('AMS/operator/addNewForContact/addNewAddress/addAddress_button'))

WebUI.click(findTestObject('AMS/operator/addNewForContact/addNewPhone/newPhone_button'))

WebUI.setText(findTestObject('AMS/operator/addNewForContact/addNewPhone/phoneNumber_textBox'), phoneNumber)

WebUI.selectOptionByLabel(findTestObject('AMS/operator/addNewForContact/addNewPhone/phoneType_dropDown'), phoneType, false)

WebUI.click(findTestObject('AMS/operator/addNewForContact/addNewPhone/addPhone_button'))

WebUI.click(findTestObject('AMS/operator/addNewForContact/addNewEmail/addNewEmail_button'))

WebUI.setText(findTestObject('AMS/operator/addNewForContact/addNewEmail/emailAddress_textBox'), emailAddress)

WebUI.selectOptionByLabel(findTestObject('AMS/operator/addNewForContact/addNewEmail/emailType_dropDown'), emailType, false)

WebUI.click(findTestObject('AMS/operator/addNewForContact/addNewEmail/addEmail_button'))

