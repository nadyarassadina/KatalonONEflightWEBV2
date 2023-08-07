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

WebUI.click(findTestObject('AMS/3homePage/mainMenuTabs/operator/operator_menuItem'))

WebUI.click(findTestObject('AMS/3homePage/mainMenuTabs/operator/newOperator_dropDownTab'))

WebUI.setText(findTestObject('AMS/operator/addNewOperator/name_textBox'), name)

WebUI.setText(findTestObject('AMS/operator/addNewOperator/url_textBox'), url)

WebUI.setText(findTestObject('AMS/operator/addNewOperator/dba_textBox'), dba)

WebUI.selectOptionByLabel(findTestObject('AMS/operator/addNewOperator/software_dropDown'), software, false)

WebUI.setText(findTestObject('AMS/operator/addNewOperator/certificate_textBox'), certificate)

WebUI.setText(findTestObject('AMS/operator/addNewOperator/certificateDate_textBox'), certDate)

WebUI.click(findTestObject('AMS/operator/addNewOperator/argusGold_checkBox'))

WebUI.click(findTestObject('AMS/operator/addNewOperator/isBaoStage1_checkBox'))

WebUI.click(findTestObject('AMS/operator/addNewOperator/bajSafety_checkBox'))

WebUI.click(findTestObject('AMS/operator/addNewOperator/addNewOperator_button'))

