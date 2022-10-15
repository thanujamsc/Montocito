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

WebUI.click(findTestObject('Object Repository/Pages/Buildings/New_Building_Report/Update/a_Buildings'))

WebUI.click(findTestObject('Object Repository/Pages/Buildings/New_Building_Report/Update/a_New Building Report'))

WebUI.click(findTestObject('Object Repository/Pages/Buildings/New_Building_Report/Update/span_Select or Search for an Entity ID or Name'))

WebUI.click(findTestObject('Object Repository/Pages/Buildings/New_Building_Report/Update/div_8146 - Beth Israel'))

WebUI.click(findTestObject('Object Repository/Pages/Buildings/New_Building_Report/Update/button_OK'))

WebUI.setText(findTestObject('Object Repository/Pages/Buildings/New_Building_Report/Update/input_Client Name_clientName'), 
    'anu')

WebUI.setText(findTestObject('Object Repository/Pages/Buildings/New_Building_Report/Update/input_Asset Manager_assetManager'), 
    'no')

WebUI.setText(findTestObject('Object Repository/Pages/Buildings/New_Building_Report/Update/input_Property Type_propertyType'), 
    'land')

WebUI.setText(findTestObject('Object Repository/Pages/Buildings/New_Building_Report/Update/input_Leased Status_leasedStatus'), 
    '100')

WebUI.click(findTestObject('Object Repository/Pages/Buildings/New_Building_Report/Update/button_Update Building Details'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Pages/Buildings/New_Building_Report/Update/div_Building report details updated successfully'), 
    0)

WebUI.closeBrowser()

