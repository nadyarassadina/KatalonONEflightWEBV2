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

WebUI.click(findTestObject('AMS/createAMemberClient/createProfile/newLead_tab'))

WebUI.selectOptionByLabel(findTestObject('AMS/createAMemberClient/createProfile/source_dropDown'), source, false)

WebUI.selectOptionByLabel(findTestObject('AMS/createAMemberClient/createProfile/lead_dropDown'), stage, false)

WebUI.setText(findTestObject('AMS/createAMemberClient/createProfile/firstName_textBox'), firstName)

WebUI.setText(findTestObject('AMS/createAMemberClient/createProfile/lastName_textBox'), lastName)

WebUI.click(findTestObject('AMS/createAMemberClient/createProfile/plusPhone_button'))

WebUI.selectOptionByLabel(findTestObject('AMS/createAMemberClient/createProfile/selectAPhoneType_dropDown'), phoneType, 
    false)

WebUI.setText(findTestObject('AMS/createAMemberClient/createProfile/phoneNumber_textBox'), phoneNumber)

WebUI.click(findTestObject('AMS/createAMemberClient/createProfile/primaryPhone_checkBox'))

WebUI.click(findTestObject('AMS/createAMemberClient/createProfile/applyPhone_button'))

WebUI.click(findTestObject('AMS/createAMemberClient/createProfile/plusEmail_button'))

WebUI.selectOptionByLabel(findTestObject('AMS/createAMemberClient/createProfile/emailType_dropDown'), emailType, false)

WebUI.setText(findTestObject('AMS/createAMemberClient/createProfile/emailAddress_textBox'), emailAddress)

WebUI.click(findTestObject('AMS/createAMemberClient/createProfile/primaryEmail_checkBox'))

WebUI.click(findTestObject('AMS/createAMemberClient/createProfile/applyEmail_button'))

WebUI.click(findTestObject('AMS/createAMemberClient/createProfile/plusAddress_button'))

WebUI.selectOptionByLabel(findTestObject('AMS/createAMemberClient/createProfile/addressType_dropDown'), addressType, false)

WebUI.setText(findTestObject('AMS/createAMemberClient/createProfile/street1_textBox'), street1)

WebUI.setText(findTestObject('AMS/createAMemberClient/createProfile/street2_textBox'), street2)

WebUI.setText(findTestObject('AMS/createAMemberClient/createProfile/city_textBox'), city)

WebUI.selectOptionByLabel(findTestObject('AMS/createAMemberClient/createProfile/state_dropDown'), state, false)

WebUI.setText(findTestObject('AMS/createAMemberClient/createProfile/zip_textBox'), zip)

WebUI.click(findTestObject('AMS/createAMemberClient/createProfile/primaryAddress_checkBox'))

WebUI.click(findTestObject('AMS/createAMemberClient/createProfile/applyAddress_button'))

WebUI.click(findTestObject('AMS/createAMemberClient/createProfile/saveProfile_button'))

