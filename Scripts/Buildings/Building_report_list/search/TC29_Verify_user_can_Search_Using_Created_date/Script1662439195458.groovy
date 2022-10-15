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

CustomKeywords.'sample.Login.loginIntoApplicationWithGlobalVariable'()

WebUI.click(findTestObject('Object Repository/Pages/Buildings/Building_report_list/Search/By_Date/a_Buildings'))

WebUI.click(findTestObject('Object Repository/Pages/Buildings/Building_report_list/Search/By_Date/a_Building Report List'))

WebUI.click(findTestObject('Object Repository/Pages/Buildings/Building_report_list/Search/By_Date/svg_Created Date_svg-inline--fa fa-undo fa-w-16'))

WebUI.click(findTestObject('Pages/Buildings/Building_report_list/Search/By_Date/svg_date'))

WebUI.click(findTestObject('Object Repository/Pages/Buildings/Building_report_list/Search/By_Date/div_5'))

WebUI.click(findTestObject('Object Repository/Pages/Buildings/Building_report_list/Search/By_Date/button_Created Date_btn btn-primary me-2'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Pages/Buildings/Building_report_list/Search/By_Date/span_8139'), 
    0)

WebUI.closeBrowser()

