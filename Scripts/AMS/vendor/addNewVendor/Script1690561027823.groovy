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

WebUI.click(findTestObject('AMS/3homePage/mainMenuTabs/concierge/concierge_menuItem'))

WebUI.click(findTestObject('AMS/3homePage/mainMenuTabs/concierge/vendorList_dropDownTab'))

WebUI.click(findTestObject('AMS/vendor/addNewVendor/addANewVendor_button'))

WebUI.setText(findTestObject('AMS/vendor/addNewVendor/name_textBox'), name)

WebUI.selectOptionByLabel(findTestObject('AMS/vendor/addNewVendor/status_dropDown'), status, false)

WebUI.setText(findTestObject('AMS/vendor/addNewVendor/description_textBox'), description)

WebUI.setText(findTestObject('AMS/vendor/addNewVendor/license_tab'), license)

WebUI.setText(findTestObject('AMS/vendor/addNewVendor/licenseDate_textBox'), licenseDate)

WebUI.setText(findTestObject('AMS/vendor/addNewVendor/address_textBox'), address)

WebUI.setText(findTestObject('AMS/vendor/addNewVendor/addressStreet2_textBox'), address2)

WebUI.setText(findTestObject('AMS/vendor/addNewVendor/city_textBox'), city)

WebUI.selectOptionByLabel(findTestObject('AMS/vendor/addNewVendor/state_dropDown'), state, false)

WebUI.setText(findTestObject('AMS/vendor/addNewVendor/zip_textBox'), zip)

WebUI.selectOptionByLabel(findTestObject('AMS/vendor/addNewVendor/service_dropDown'), service, false)

WebUI.setText(findTestObject('AMS/vendor/addNewVendor/airportIdent_textBox'), airportIdent)

WebUI.setText(findTestObject('AMS/vendor/addNewVendor/firstName_textBox'), firstName)

WebUI.setText(findTestObject('AMS/vendor/addNewVendor/email_textBox'), email)

WebUI.setText(findTestObject('AMS/vendor/addNewVendor/phone_textBox'), phone)

WebUI.setText(findTestObject('AMS/vendor/addNewVendor/lastName_textBox'), lastName)

WebUI.selectOptionByLabel(findTestObject('AMS/vendor/addNewVendor/emailType_dropDown'), emailType, false)

WebUI.selectOptionByLabel(findTestObject('AMS/vendor/addNewVendor/phoneType_dropDown'), phoneType, false)

WebUI.click(findTestObject('AMS/vendor/addNewVendor/addNewVendor_button'))

