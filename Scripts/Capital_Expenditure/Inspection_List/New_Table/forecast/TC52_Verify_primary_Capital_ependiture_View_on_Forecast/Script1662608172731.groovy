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

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Forecast/a_Capital Expenditure'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Forecast/a_Inspection List'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Forecast/span_8375'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Forecast/button_New Table'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Forecast/span_Select'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Forecast/div_ADA Compliance'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Forecast/button_Proceed'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Forecast/button_Add New'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Forecast/select_SelectOther'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Forecast/select_SelectOther_1'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Forecast/textarea_MaintenanceRepair Details_inspectedBy'), 
    'test')

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Forecast/select_SelectLandlordTenantDualOther'), 
    'Tenant', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Forecast/select_YesNo'), 
    'Yes', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Forecast/select_SelectRMCapital'), 
    'R&M', true)

WebUI.setText(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Forecast/input_Immediate Cost ()_inspectedBy'), 
    '100')

WebUI.setText(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Forecast/input_Units_inspectedBy'), 
    '50')

WebUI.setText(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Forecast/input_Unit Cost ()_inspectedBy'), 
    '20')

WebUI.setText(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Forecast/input_Quantity_inspectedBy'), 
    '30')

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Forecast/button_Save'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Forecast/button_Save Table'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Forecast/a_Forecast'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Forecast/span_ADA Compliance'), 
    0)

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Forecast/a_Primary'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Forecast/svg_Expense Type_svg-inline--fa fa-trash-al_6068f8'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Forecast/button_Delete'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

