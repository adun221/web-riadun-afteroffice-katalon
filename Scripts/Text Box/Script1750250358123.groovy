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

WebUI.openBrowser('https://demoqa.com/text-box')
WebUI.maximizeWindow()
WebUI.click(findTestObject('Object Repository/Text Box/step-1'))
WebUI.setText(findTestObject('Object Repository/Text Box/step-1'), 'Riadun')
WebUI.click(findTestObject('Object Repository/Text Box/step-2'))
WebUI.setText(findTestObject('Object Repository/Text Box/step-2'), 'Riadun@gmail.com')
WebUI.click(findTestObject('Object Repository/Text Box/step-3'))
WebUI.setText(findTestObject('Object Repository/Text Box/step-3'), 'Jakarta aja ya')
WebUI.click(findTestObject('Object Repository/Text Box/step-4'))
WebUI.setText(findTestObject('Object Repository/Text Box/step-4'), 'Jakarta aja ya')
WebUI.click(findTestObject('Object Repository/Text Box/step-5'))