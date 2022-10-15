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

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Primary/add/a_Capital Expenditure'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Primary/add/a_Inspection List'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Primary/add/span_8375'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Primary/add/button_New Table'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Primary/add/span_Select'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Primary/add/div_Building Envelope'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Primary/add/button_Proceed'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Primary/add/button_Add New'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Primary/add/select_SelectPerimeter Walls Exterior Wall Framing'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Primary/add/select_SelectBrickEIFSHardiboardMultiple (D_ddb88f'), 
    '4', true)

WebUI.setText(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Primary/add/textarea_MaintenanceRepair Details_inspectedBy'), 
    'no')

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Primary/add/select_SelectLandlordTenantDualOther'), 
    'Landlord', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Primary/add/select_YesNo'), 
    'Yes', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Primary/add/select_YesNo_1'), 
    'Yes', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Primary/add/select_SelectRMCapital'), 
    'R&M', true)

WebUI.setText(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Primary/add/input_Immediate Cost ()_inspectedBy'), 
    '100')

WebUI.setText(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Primary/add/input_Units_inspectedBy'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Primary/add/input_Unit Cost ()_inspectedBy'), 
    '200')

WebUI.setText(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Primary/add/input_Quantity_inspectedBy'), 
    '50')

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Primary/add/button_Save'))

WebUI.click(findTestObject('Pages/Capital_Expenditure/Inspection_List/New_Table/Primary/add/button_Save Table2222'))

WebUI.verifyElementPresent(findTestObject('Pages/Capital_Expenditure/Inspection_List/New_Table/Primary/add/div_Saved successfully'), 
    0)

WebUI.closeBrowser()

