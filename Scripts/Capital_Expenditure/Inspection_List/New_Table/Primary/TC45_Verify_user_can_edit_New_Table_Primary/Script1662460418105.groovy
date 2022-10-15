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

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Primary/edit/a_Capital Expenditure'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Primary/edit/a_Inspection List'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Primary/edit/span_8375'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Primary/edit/svg_Expense Type_svg-inline--fa fa-pencil-a_dd306d'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Primary/edit/select_SelectPerimeter Walls Exterior Wall Framing'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Primary/edit/select_SelectConcreteMasonryOtherSteelWood'), 
    '6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Primary/edit/select_SelectLandlordTenantDualOther'), 
    'Tenant', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Primary/edit/select_YesNo'), 
    'No', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Primary/edit/select_YesNo_1'), 
    'No', true)

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Primary/edit/button_Update'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Primary/edit/div_Updated successfully'), 
    0)

WebUI.closeBrowser()

