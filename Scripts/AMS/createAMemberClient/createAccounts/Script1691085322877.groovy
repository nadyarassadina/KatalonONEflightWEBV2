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

WebUI.click(findTestObject('AMS/createAMemberClient/accounts/addAccount_button'))

WebUI.setText(findTestObject('AMS/createAMemberClient/accounts/businessName_textBox'), businessName)

WebUI.setText(findTestObject('AMS/createAMemberClient/accounts/businessContact_textBox'), businessContact)

WebUI.setText(findTestObject('AMS/createAMemberClient/accounts/title_textBox'), title)

WebUI.selectOptionByLabel(findTestObject('AMS/createAMemberClient/accounts/adress_dropDown'), address, false)

WebUI.selectOptionByLabel(findTestObject('AMS/createAMemberClient/accounts/phone_dropDown'), phone, false)

WebUI.click(findTestObject('AMS/createAMemberClient/accounts/email_dropDown'))

WebUI.click(findTestObject('AMS/createAMemberClient/accounts/email_checkBox'))

WebUI.selectOptionByLabel(findTestObject('AMS/createAMemberClient/accounts/accountType_dropDown'), accountType, false)

WebUI.setText(findTestObject('AMS/createAMemberClient/accounts/accountNumber_textBox'), accountNumber)

WebUI.selectOptionByLabel(findTestObject('AMS/createAMemberClient/accounts/accountStatus_dropDown'), accountStatus, false)

WebUI.selectOptionByLabel(findTestObject('AMS/createAMemberClient/accounts/accaunt_dropDown'), account, false)

WebUI.selectOptionByLabel(findTestObject('AMS/createAMemberClient/accounts/productCategory_dropDown'), productCategory, 
    false)

WebUI.selectOptionByLabel(findTestObject('AMS/createAMemberClient/accounts/product_dropDown'), product, false)

WebUI.selectOptionByLabel(findTestObject('AMS/createAMemberClient/accounts/annualType_dropDown'), annualType, false)

WebUI.setText(findTestObject('AMS/createAMemberClient/accounts/activationDate_textBox'), activationDate)

WebUI.setText(findTestObject('AMS/createAMemberClient/accounts/dueOn_textBox'), dueOn)

WebUI.setText(findTestObject('AMS/createAMemberClient/accounts/anniversaryDate_textBox'), anniversaryDate)

WebUI.click(findTestObject('AMS/createAMemberClient/accounts/save_button'))

