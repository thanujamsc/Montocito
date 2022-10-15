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

WebUI.click(findTestObject('Object Repository/Pages/Buildings/search/Seach_by_Name/button_Select'))

WebUI.click(findTestObject('Object Repository/Pages/Buildings/search/Seach_by_Name/svg_State_svg-inline--fa fa-undo fa-w-16'))

WebUI.setText(findTestObject('Object Repository/Pages/Buildings/search/Seach_by_Name/input_Building name_buildingName'), 
    'TN')

WebUI.click(findTestObject('Pages/Buildings/search/Seach_by_Name/button_State_btn btn-primary me-2'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Pages/Buildings/search/Seach_by_Name/div_Building grid filter added'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Pages/Buildings/search/Seach_by_Name/span_TN Oncology Lebanon'), 
    0)

WebUI.closeBrowser()

