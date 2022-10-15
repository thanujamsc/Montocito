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

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/edit/a_Capital Expenditure'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/edit/a_Inspection List'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/edit/span_8375'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/edit/a_Future RM'))

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/edit/svg_Unit Cost_svg-inline--fa fa-pencil-alt fa-w-16'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/edit/select_SelectADA Compliance Building Envelo_ab7b5e'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/edit/select_SelectEquipment'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/edit/select_SelectBreaker PanelExterior Pad-Moun_18f956'), 
    '18', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/edit/select_SelectLandlordTenantDualOther'), 
    'Dual', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/edit/select_YesNo'), 
    'No', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/edit/select_YesNo_1'), 
    'No', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/edit/select_SelectRMCapital'), 
    'Capital', true)

WebUI.setText(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/edit/input_Immediate Cost ()_immediateCost'), 
    Keys.chord(Keys.BACK_SPACE, '500'))

WebUI.setText(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/edit/input_Units_units'), 
    Keys.chord(Keys.BACK_SPACE, '80'))

WebUI.setText(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/edit/input_Unit Cost ()_unitCost'), 
    Keys.chord(Keys.ENTER, '63'))

WebUI.setText(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/edit/input_Quantity_quantity'), 
    Keys.chord(Keys.BACK_SPACE, '95'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/edit/select_ScheduledIn progressCompleted'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/edit/button_Update'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Pages/Capital_Expenditure/Inspection_List/New_Table/Future_RM/edit/div_Updated successfully'), 
    0)

WebUI.closeBrowser()

