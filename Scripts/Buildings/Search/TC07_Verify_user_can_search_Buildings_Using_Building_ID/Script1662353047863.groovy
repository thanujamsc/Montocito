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

WebUI.click(findTestObject('Object Repository/Pages/Buildings/search/Search_by_ID/button_Select'))

WebUI.click(findTestObject('Pages/Buildings/search/Search_by_ID/reset'))

WebUI.setText(findTestObject('Object Repository/Pages/Buildings/search/Search_by_ID/input_Building Id_buildingID'), '870301')

WebUI.click(findTestObject('Object Repository/Pages/Buildings/search/Search_by_ID/button_State_btn btn-primary me-2'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Pages/Buildings/search/Search_by_ID/div_Building grid filter updated'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Pages/Buildings/search/Search_by_ID/span_870301'), 0)

WebUI.closeBrowser()

