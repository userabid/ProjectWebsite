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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://sistemtoko.com/')

WebUI.takeScreenshot()

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('SistemToko/Page_Dashboard/Login_Button'))

WebUI.setText(findTestObject('SistemToko/Page_Login/input_Email'), 'welpegssktok@gmail.com')

WebUI.setEncryptedText(findTestObject('SistemToko/Page_Login/input_Password'), 'RyzK/uu8Q1+7/zuOsKmZ+g==')

WebUI.click(findTestObject('SistemToko/Page_Login/button_Login'))

WebUI.getText(findTestObject('SistemToko/Page_Login/AlertMessageFalse'))

String verify = WebUI.getText(findTestObject('SistemToko/Page_Login/AlertMessageFalse'))

WebUI.verifyElementText(findTestObject('SistemToko/Page_Login/AlertMessageFalse'), verify)

if (verify == 'Operation Failed') {
    WebUI.takeScreenshot()

    println(verify)
}

WebUI.takeScreenshot()

WebUI.closeBrowser()

