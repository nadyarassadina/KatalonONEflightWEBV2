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

WebUI.click(findTestObject('AMS/vendor/services/addService1_button'))

WebUI.selectOptionByLabel(findTestObject('AMS/vendor/services/serviceType1_dropDown'), service1, false)

WebUI.click(findTestObject('AMS/vendor/services/saveService1_button'))

WebUI.click(findTestObject('AMS/vendor/services/addService2_button'))

WebUI.selectOptionByLabel(findTestObject('AMS/vendor/services/serviceType2_dropDown'), service2, false)

WebUI.click(findTestObject('AMS/vendor/services/saveService2_button'))

WebUI.click(findTestObject('AMS/vendor/services/addService3_button'))

WebUI.selectOptionByLabel(findTestObject('AMS/vendor/services/serviceType3_dropDown'), service3, false)

WebUI.click(findTestObject('AMS/vendor/services/saveService3_button'))

WebUI.click(findTestObject('AMS/vendor/airports/addAirport1_button'))

WebUI.setText(findTestObject('AMS/vendor/airports/airportIdent1_textBox'), airport1)

WebUI.click(findTestObject('AMS/vendor/airports/saveAirport1_button'))

WebUI.click(findTestObject('AMS/vendor/airports/addAirport2_button'))

WebUI.setText(findTestObject('AMS/vendor/airports/airportIdent2_textBox'), airport2)

WebUI.click(findTestObject('AMS/vendor/airports/saveAirport2_button'))

WebUI.click(findTestObject('AMS/vendor/airports/addAirport3_button'))

WebUI.setText(findTestObject('AMS/vendor/airports/airportIdent2_textBox'), airport3)

WebUI.click(findTestObject('AMS/vendor/airports/saveAirport3_button'))

WebUI.click(findTestObject('AMS/vendor/Page_/addLink1_button'))

WebUI.setText(findTestObject('AMS/vendor/Page_/url1_textBox'), url1)

WebUI.setText(findTestObject('AMS/vendor/Page_/description1_textBox'), description1)

WebUI.click(findTestObject('AMS/vendor/Page_/saveLink1_button'))

WebUI.click(findTestObject('AMS/vendor/Page_/addLink2_button'))

WebUI.setText(findTestObject('AMS/vendor/Page_/url2_textBox'), url2)

WebUI.setText(findTestObject('AMS/vendor/Page_/description2_textBox'), description2)

WebUI.click(findTestObject('AMS/vendor/Page_/saveLink2_button'))

WebUI.click(findTestObject('AMS/vendor/Page_/addLink3_button'))

WebUI.setText(findTestObject('AMS/vendor/Page_/url3_textBox'), url3)

WebUI.setText(findTestObject('AMS/vendor/Page_/description3_textBox'), description3)

WebUI.click(findTestObject('AMS/vendor/Page_/saveLink3_button'))

