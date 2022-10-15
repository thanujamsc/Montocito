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

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/delete/a_Capital Expenditure'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/delete/a_Inspection List'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/delete/span_8375'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/delete/a_Future RM'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/delete/svg_Unit Cost_svg-inline--fa fa-trash-alt fa-w-14'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/delete/button_Yes'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/delete/div_Deleted successfully'), 
    0)

WebUI.closeBrowser()
