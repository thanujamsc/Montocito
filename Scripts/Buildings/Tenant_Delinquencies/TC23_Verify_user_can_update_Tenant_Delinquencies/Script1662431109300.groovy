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

WebUI.click(findTestObject('Object Repository/Pages/Buildings/Tenant_Delinquencies/update/a_Buildings'))

WebUI.click(findTestObject('Object Repository/Pages/Buildings/Tenant_Delinquencies/update/a_Building Report List'))

WebUI.click(findTestObject('Object Repository/Pages/Buildings/Tenant_Delinquencies/update/span_8146'))

WebUI.click(findTestObject('Object Repository/Pages/Buildings/Tenant_Delinquencies/update/button_Edit All'))

WebUI.setText(findTestObject('Pages/Buildings/Tenant_Delinquencies/update/input_1'), Keys.chord(Keys.BACK_SPACE, '500'))

WebUI.setText(findTestObject('Pages/Buildings/Tenant_Delinquencies/update/input_2'), Keys.chord(Keys.BACK_SPACE, 'good'))

WebUI.setText(findTestObject('Pages/Buildings/Tenant_Delinquencies/update/input_3'), Keys.chord(Keys.BACK_SPACE, '80'))

WebUI.setText(findTestObject('Pages/Buildings/Tenant_Delinquencies/update/input_4'), Keys.chord(Keys.ENTER, '60'))

WebUI.setText(findTestObject('Pages/Buildings/Tenant_Delinquencies/update/input_T4'), Keys.chord(Keys.ENTER, 'no'))

WebUI.click(findTestObject('Object Repository/Pages/Buildings/Tenant_Delinquencies/update/button_Save All'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Pages/Buildings/Tenant_Delinquencies/update/div_Tenant delinquency data updated successfully'), 
    0)

WebUI.closeBrowser()

