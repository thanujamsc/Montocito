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

WebUI.click(findTestObject('Object Repository/Pages/Buildings/Summary/Contact/edit/button_Select'))

WebUI.click(findTestObject('Object Repository/Pages/Buildings/Summary/Contact/edit/span_832301'))

WebUI.click(findTestObject('Object Repository/Pages/Buildings/Summary/Contact/edit/button_Edit All'))

WebUI.setText(findTestObject('Pages/Buildings/Summary/Contact/edit/input_one'), Keys.chord(Keys.ENTER, 'brand'))

WebUI.waitForPageLoad(20)

WebUI.setText(findTestObject('Pages/Buildings/Summary/Contact/edit/input_two'), Keys.chord(Keys.ENTER, '11'))

WebUI.setText(findTestObject('Pages/Buildings/Summary/Contact/edit/input_three'), Keys.chord(Keys.ENTER, 'conpany'))

WebUI.setText(findTestObject('Pages/Buildings/Summary/Contact/edit/input_four'), Keys.chord(Keys.ENTER, '123859632'))

WebUI.setText(findTestObject('Pages/Buildings/Summary/Contact/edit/input_five'), Keys.chord(Keys.ENTER, 'a@gmail.com'))

WebUI.click(findTestObject('Object Repository/Pages/Buildings/Summary/Contact/edit/button_Save All'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Pages/Buildings/Summary/Contact/edit/div_Contact data updated successfully'), 
    0)

WebUI.closeBrowser()

