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

WebUI.click(findTestObject('AMS/operator/contacts_tab'))

WebUI.click(findTestObject('AMS/operator/createNewContact3/addNewContact_button'))

WebUI.setText(findTestObject('AMS/operator/createNewContact3/title_textBox'), title)

WebUI.setText(findTestObject('AMS/operator/createNewContact3/firstName_textBox'), firstName)

WebUI.setText(findTestObject('AMS/operator/createNewContact3/lastName_textBox'), lastName)

WebUI.click(findTestObject('AMS/operator/createNewContact3/isPrivate_checkBox'))

WebUI.setText(findTestObject('AMS/operator/createNewContact3/phoneNumber_textBox'), phoneNumber)

WebUI.selectOptionByLabel(findTestObject('AMS/operator/createNewContact3/phoneType_dropDown'), phoneType, false)

WebUI.setText(findTestObject('AMS/operator/createNewContact3/emailAddress_textBox'), emailAddress)

WebUI.selectOptionByLabel(findTestObject('AMS/operator/createNewContact3/emailtype_dropDown'), emailType, false)

WebUI.setText(findTestObject('AMS/operator/createNewContact3/addressLine1_textBox'), addressLine1)

WebUI.setText(findTestObject('AMS/operator/createNewContact3/addressLine2_textBox'), addressLine2)

WebUI.setText(findTestObject('AMS/operator/createNewContact3/city_textBox'), city)

WebUI.selectOptionByLabel(findTestObject('AMS/operator/createNewContact3/state_dropDown'), state, false)

WebUI.setText(findTestObject('AMS/operator/createNewContact3/zipcode_textBox'), zipCode)

WebUI.selectOptionByLabel(findTestObject('AMS/operator/createNewContact3/country_dropDown'), country, false)

WebUI.selectOptionByLabel(findTestObject('AMS/operator/createNewContact3/addressType_dropDown'), addressType, false)

WebUI.click(findTestObject('AMS/operator/createNewContact3/addNewContact_button (1)'))

