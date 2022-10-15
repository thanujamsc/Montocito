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

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/New_Inspection/edit/a_Capital Expenditure'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/New_Inspection/edit/a_Inspection List'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/New_Inspection/edit/span_8144'))

WebUI.setText(findTestObject('Object Repository/Pages/Capital_Expenditure/New_Inspection/edit/input_Primary Inspected By_inspectedBy'), 
    Keys.chord(Keys.BACK_SPACE, 'ABCD'))

WebUI.setText(findTestObject('Object Repository/Pages/Capital_Expenditure/New_Inspection/edit/input_Property Type_propertyType'), 
    Keys.chord(Keys.BACK_SPACE, 'Building'))

WebUI.setText(findTestObject('Object Repository/Pages/Capital_Expenditure/New_Inspection/edit/input_Building Grade_buildingCondition'), 
    Keys.chord(Keys.ENTER, 'A'))

WebUI.setText(findTestObject('Object Repository/Pages/Capital_Expenditure/New_Inspection/edit/textarea_Building Description_buildingDescription'), 
    Keys.chord(Keys.BACK_SPACE, 'GOOD'))

WebUI.setText(findTestObject('Object Repository/Pages/Capital_Expenditure/New_Inspection/edit/textarea_Site Description_siteDescription'), 
    Keys.chord(Keys.BACK_SPACE, 'Good'))

WebUI.setText(findTestObject('Object Repository/Pages/Capital_Expenditure/New_Inspection/edit/input_Number of Tenants_numberOfTenants'), 
    Keys.chord(Keys.ENTER, '6'))

WebUI.setText(findTestObject('Object Repository/Pages/Capital_Expenditure/New_Inspection/edit/input_Number of Stories_numberOfStories'), 
    Keys.chord(Keys.BACK_SPACE, '10'))

WebUI.setText(findTestObject('Object Repository/Pages/Capital_Expenditure/New_Inspection/edit/input_Year Built_yearBuilt'), 
    Keys.chord(Keys.BACK_SPACE, '2004'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/New_Inspection/edit/button_Update Building Details'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Pages/Capital_Expenditure/New_Inspection/edit/div_Building details updated successfully'), 
    0)

WebUI.closeBrowser()

