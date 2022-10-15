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

WebUI.click(findTestObject('Object Repository/Pages/Buildings/Tenant_Delinquencies/add/a_Buildings'))

WebUI.click(findTestObject('Object Repository/Pages/Buildings/Tenant_Delinquencies/add/a_Building Report List'))

WebUI.click(findTestObject('Object Repository/Pages/Buildings/Tenant_Delinquencies/add/span_8146'))

WebUI.click(findTestObject('Object Repository/Pages/Buildings/Tenant_Delinquencies/add/button_Add New'))

WebUI.setText(findTestObject('Pages/Buildings/Tenant_Delinquencies/add/input_1'), '50')

WebUI.setText(findTestObject('Pages/Buildings/Tenant_Delinquencies/add/input_2'), 'name')

WebUI.setText(findTestObject('Pages/Buildings/Tenant_Delinquencies/add/input_3'), '90')

WebUI.setText(findTestObject('Pages/Buildings/Tenant_Delinquencies/add/input_4'), '20')

WebUI.setText(findTestObject('Pages/Buildings/Tenant_Delinquencies/add/input_5'), 'commnet')

WebUI.click(findTestObject('Object Repository/Pages/Buildings/Tenant_Delinquencies/add/button_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Pages/Buildings/Tenant_Delinquencies/add/div_New Contact added successfully'), 
    0)

WebUI.closeBrowser()

