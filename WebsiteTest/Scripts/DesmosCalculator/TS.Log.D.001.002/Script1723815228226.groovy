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

WebUI.navigateToUrl('https://www.desmos.com/')

WebUI.click(findTestObject('DesmosCalculator/Page_Desmos  Beautiful free math/Matrix_Calculator'))

WebUI.click(findTestObject('Object Repository/DesmosCalculator/PageMatrixCalculator/NewMatrix_button'))

WebUI.click(findTestObject('Object Repository/DesmosCalculator/PageMatrixCalculator/Number6_button'))

WebUI.click(findTestObject('Object Repository/DesmosCalculator/PageMatrixCalculator/RightRow_Button'))

WebUI.click(findTestObject('Object Repository/DesmosCalculator/PageMatrixCalculator/Number4_Button'))

WebUI.click(findTestObject('Object Repository/DesmosCalculator/PageMatrixCalculator/RightRow_Button'))

WebUI.click(findTestObject('Object Repository/DesmosCalculator/PageMatrixCalculator/Number1_Button'))

WebUI.click(findTestObject('Object Repository/DesmosCalculator/PageMatrixCalculator/RightRow_Button'))

WebUI.click(findTestObject('Object Repository/DesmosCalculator/PageMatrixCalculator/Number3_Button'))

WebUI.click(findTestObject('Object Repository/DesmosCalculator/PageMatrixCalculator/Enter_Button'))

WebUI.click(findTestObject('Object Repository/DesmosCalculator/PageMatrixCalculator/det_Button'))

WebUI.click(findTestObject('Object Repository/DesmosCalculator/PageMatrixCalculator/A_Button'))

WebUI.click(findTestObject('Object Repository/DesmosCalculator/PageMatrixCalculator/Enter_Button'))

WebUI.getText(findTestObject('Object Repository/DesmosCalculator/PageMatrixCalculator/HasilPerhitungan2'))

String verify = WebUI.getText(findTestObject('DesmosCalculator/Page_Desmos  Matrix Calculator/HasilPerhitungan2'))

WebUI.verifyElementText(findTestObject('DesmosCalculator/Page_Desmos  Matrix Calculator/HasilPerhitungan2'), verify)

if (verify == 'equals 14') {
    WebUI.takeScreenshot()

    println(verify)
}

WebUI.takeScreenshot()

WebUI.closeBrowser()

