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

WebUI.selectOptionByLabel(findTestObject('BAJit/conciergeTab/leg2/dropOff/pleaseSelectDropOff_dropDown'), select, false)

WebUI.setText(findTestObject('BAJit/conciergeTab/leg2/dropOff/executiveCar/address_textBox'), address)

WebUI.click(findTestObject('BAJit/conciergeTab/leg2/dropOff/pleaseSelectDropOff_dropDown'))

WebUI.setText(findTestObject('BAJit/conciergeTab/leg2/dropOff/executiveCar/city_textBox'), city)

WebUI.setText(findTestObject('BAJit/conciergeTab/leg2/dropOff/executiveCar/state_textBox'), state)

WebUI.setText(findTestObject('BAJit/conciergeTab/leg2/dropOff/executiveCar/zip_textBox'), zip)

WebUI.setText(findTestObject('BAJit/conciergeTab/leg2/dropOff/executiveCar/country_textBox'), country)

WebUI.setText(findTestObject('BAJit/conciergeTab/leg2/dropOff/executiveCar/droppOffInstructions_textBox'), dropOffInstructions)

