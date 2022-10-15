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

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/add/a_Capital Expenditure'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/add/a_Inspection List'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/add/span_8375'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/add/a_Future RM'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/add/button_Add New'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/add/select_SelectADA Compliance Building Envelo_ab7b5e'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/add/select_SelectPerimeter Walls Exterior Wall Framing'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/add/select_SelectBrickEIFSHardiboardMultiple (D_ddb88f'), 
    '5', true)

WebUI.setText(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/add/textarea_MaintenanceRepair Details_maintena_840f81'), 
    'ZZZ')

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/add/select_SelectLandlordTenantDualOther'), 
    'Landlord', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/add/select_YesNo'), 
    'Yes', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/add/select_YesNo_1'), 
    'Yes', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/add/select_SelectRMCapital'), 
    'R&M', true)

WebUI.setText(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/add/input_Immediate Cost ()_immediateCost'), 
    '100')

WebUI.setText(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/add/input_Units_units'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/add/input_Unit Cost ()_unitCost'), 
    '30')

WebUI.setText(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/add/input_Quantity_quantity'), 
    '52')

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/add/svg_Scheduled Maintenance Date_svg-inline--_efaf84'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/add/div_8'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/add/select_ScheduledIn progressCompleted'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/add/button_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/add/div_Saved successfully'), 
    0)

WebUI.closeBrowser()

