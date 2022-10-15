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

WebUI.click(findTestObject('Pages/Portfolios/Portfolio_Rollup/edit/button_Select'))

WebUI.click(findTestObject('Pages/Portfolios/Portfolio_Rollup/edit/button_Portfolio Rollup'))

WebUI.click(findTestObject('Object Repository/Pages/Portfolios/Portfolio_Rollup/edit/span_Edit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Portfolios/Portfolio_Rollup/edit/select_MonthQuarter'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Pages/Portfolios/Portfolio_Rollup/edit/button_Add Comment'))

WebUI.setText(findTestObject('Object Repository/Pages/Portfolios/Portfolio_Rollup/edit/div_Comment'), 'Comment')

WebUI.click(findTestObject('Object Repository/Pages/Portfolios/Portfolio_Rollup/edit/button_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Pages/Portfolios/Portfolio_Rollup/edit/div_Comment Added successfully'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Portfolios/Portfolio_Rollup/edit/select_MonthQuarter'), 
    '1', true)

WebUI.closeBrowser()

