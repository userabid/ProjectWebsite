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

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('SistemToko/Page_Dashboard/button_register'))

WebUI.setText(findTestObject('SistemToko/Page_Register/input_Email'), 'sporwins@naverly.com')

WebUI.setEncryptedText(findTestObject('SistemToko/Page_Register/input_Password'), 'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.setEncryptedText(findTestObject('SistemToko/Page_Register/input_Re-enterPassword'), 'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.setText(findTestObject('SistemToko/Page_Register/input_FullName'), 'Try This Website')

WebUI.setText(findTestObject('SistemToko/Page_Register/input_Phone'), '08123456789')

WebUI.click(findTestObject('SistemToko/Page_Register/button_Register'))

WebUI.getText(findTestObject('SistemToko/Page_Register/AlertMessageRegist'))

String verify = WebUI.getText(findTestObject('SistemToko/Page_Register/AlertMessageRegist'))

WebUI.verifyElementText(findTestObject('SistemToko/Page_Register/AlertMessageRegist'), verify)

if (verify == 'Operation Failed') {
    WebUI.takeScreenshot()

    println(verify)
}

WebUI.takeScreenshot()

WebUI.closeBrowser()

