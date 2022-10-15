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

WebUI.click(findTestObject('Object Repository/Pages/Buildings/Summary/Contact/add/button_Select'))

WebUI.click(findTestObject('Object Repository/Pages/Buildings/Summary/Contact/add/span_832301'))

WebUI.click(findTestObject('Object Repository/Pages/Buildings/Summary/Contact/add/button_Add New'))

WebUI.setText(findTestObject('Pages/Buildings/Summary/Contact/add/input_name'), 'new')

WebUI.setText(findTestObject('Pages/Buildings/Summary/Contact/add/input_Title'), 'one')

WebUI.setText(findTestObject('Pages/Buildings/Summary/Contact/add/input_Company'), 'nc')

WebUI.setText(findTestObject('Pages/Buildings/Summary/Contact/add/input_phone'), '1234')

WebUI.setText(findTestObject('Pages/Buildings/Summary/Contact/add/input_email'), 'one@gmail.com')

WebUI.click(findTestObject('Object Repository/Pages/Buildings/Summary/Contact/add/button_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Pages/Buildings/Summary/Contact/add/div_New Contact added successfully'), 
    0)

WebUI.waitForPageLoad(6)

WebUI.closeBrowser()

