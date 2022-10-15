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

WebUI.click(findTestObject('Object Repository/Pages/Buildings/Building_report_list/Variance_Analysis/edit/a_Buildings'))

WebUI.click(findTestObject('Object Repository/Pages/Buildings/Building_report_list/Variance_Analysis/edit/a_Building Report List'))

WebUI.click(findTestObject('Object Repository/Pages/Buildings/Building_report_list/Variance_Analysis/edit/span_8146'))

WebUI.click(findTestObject('Object Repository/Pages/Buildings/Building_report_list/Variance_Analysis/edit/button_dddd_btn btn-light btn-sm d-print-none'))

WebUI.setText(findTestObject('Object Repository/Pages/Buildings/Building_report_list/Variance_Analysis/edit/div_test'), 
    Keys.chord(Keys.ENTER, 'test'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Pages/Buildings/Building_report_list/Variance_Analysis/edit/button_Save Changes'), 
    0)

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

