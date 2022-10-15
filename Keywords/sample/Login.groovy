package sample


import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
/*
 * Open browser
 * Navigate to URL -> get to Global variable
 * Provide username and password
 * Click on Login
 * */
/*
 * Will read value from Global Variable
 * */
public class Login {
	@Keyword
	def static void loginIntoApplication(String applicationURL,String username,String password){

		WebUI.openBrowser(applicationURL)

		WebUI.maximizeWindow()



		WebUI.sendKeys(findTestObject('Pages/Login/input_Sign in_loginfmt'), username)
		WebUI.click(findTestObject('Object Repository/Pages/Login/input_Create one_idSIButton9'))
		WebUI.sendKeys(findTestObject('Pages/Login/input_Enter password_passwd'), password)
		WebUI.click(findTestObject('Object Repository/Pages/Login/input_concat(Don, , t show this again)_idSIButton9'))
		WebUI.waitForPageLoad(6)
	}

	@Keyword
	def static void loginIntoApplicationWithGlobalVariable(){
		loginIntoApplication(GlobalVariable.urlLogin, GlobalVariable.username, GlobalVariable.password)
	}
}
