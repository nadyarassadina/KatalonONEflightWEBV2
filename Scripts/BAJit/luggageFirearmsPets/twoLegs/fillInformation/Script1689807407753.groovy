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

WebUI.scrollToElement(findTestObject('BAJit/passengerTab/luggageFirearmsPets/leg1/continue_button'), 30)

WebUI.click(findTestObject('BAJit/passengerTab/luggageFirearmsPets/leg1/continue_button'))

WebUI.verifyTextPresent(errorMessage1, false)

WebUI.click(findTestObject('BAJit/passengerTab/luggageFirearmsPets/leg1/errorOk_button'))

WebUI.scrollToElement(findTestObject('BAJit/passengerTab/luggageFirearmsPets/leg1/luggage_textArea'), 30)

WebUI.setText(findTestObject('BAJit/passengerTab/luggageFirearmsPets/leg1/luggage_textArea'), luggageLeg1)

WebUI.setText(findTestObject('BAJit/passengerTab/luggageFirearmsPets/leg1/firearms_textArea'), firearmsLeg1)

WebUI.setText(findTestObject('BAJit/passengerTab/luggageFirearmsPets/leg1/pets_textArea'), petsLeg1)

WebUI.click(findTestObject('BAJit/passengerTab/luggageFirearmsPets/leg1/continue_button'))

WebUI.verifyTextPresent(errorMessage2, false)

WebUI.click(findTestObject('BAJit/passengerTab/luggageFirearmsPets/leg1/errorOk_button'))

WebUI.scrollToElement(findTestObject('BAJit/passengerTab/leg2_tab'), 30)

WebUI.click(findTestObject('BAJit/passengerTab/leg2_tab'))

WebUI.scrollToElement(findTestObject('BAJit/passengerTab/luggageFirearmsPets/leg2/luggage_textArea'), 30)

WebUI.setText(findTestObject('BAJit/passengerTab/luggageFirearmsPets/leg2/luggage_textArea'), luggageLeg2)

WebUI.setText(findTestObject('BAJit/passengerTab/luggageFirearmsPets/leg2/firearms_textArea'), firearmsLeg2)

WebUI.setText(findTestObject('BAJit/passengerTab/luggageFirearmsPets/leg2/pets_textArea'), petsLeg2)

WebUI.scrollToElement(findTestObject('BAJit/passengerTab/luggageFirearmsPets/leg2/continue_button'), 30)

WebUI.click(findTestObject('BAJit/passengerTab/luggageFirearmsPets/leg2/continue_button'))

