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

WebUI.click(findTestObject('AMS/5flightPage/addNewFlight/addANewFlight_button'))

WebUI.scrollToElement(findTestObject('AMS/5flightPage/addNewFlight/fromLeg1_textBox'), 30)

WebUI.setText(findTestObject('AMS/5flightPage/addNewFlight/fromLeg1_textBox'), fromLeg1)

WebUI.setText(findTestObject('AMS/5flightPage/addNewFlight/toLeg1_textBox'), toLeg1)

WebUI.setText(findTestObject('AMS/5flightPage/addNewFlight/toLeg2_textBox'), toLeg2)

WebUI.setText(findTestObject('AMS/5flightPage/addNewFlight/dateLeg1_textBox'), dateLeg1)

WebUI.setText(findTestObject('AMS/5flightPage/addNewFlight/timeLeg1_textBox'), timeLeg1)

WebUI.setText(findTestObject('AMS/5flightPage/addNewFlight/dateLeg2_textBox'), dateLeg2)

WebUI.setText(findTestObject('AMS/5flightPage/addNewFlight/timeLeg2_textBox'), timeLeg2)

WebUI.setText(findTestObject('AMS/5flightPage/addNewFlight/paxLeg1_textBox'), paxLeg1)

WebUI.setText(findTestObject('AMS/5flightPage/addNewFlight/paxLeg2_textBox'), paxLeg2)

WebUI.click(findTestObject('AMS/5flightPage/addNewFlight/updateFlightPlan_button'))

WebUI.selectOptionByLabel(findTestObject('AMS/5flightPage/addNewFlight/selectAccount_dropDown'), account, false)

WebUI.click(findTestObject('AMS/5flightPage/addNewFlight/updateFlightPlan_button'))
