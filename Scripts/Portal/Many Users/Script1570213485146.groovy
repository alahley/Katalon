import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://portal.eval.kollectivecd.com/')

WebUI.click(findTestObject('Object Repository/Page_Kollective Portal/span_Login'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Sign In with Auth0/div_Log in at kollective.com (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_loginfmt'), 'alahley@kollective.com')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your account/input_Enter password_passwd'), '5wulVsUVXnW8hI5NPgcWpA==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Do this to reduce the nu'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_concat(Don  t show this'))

WebUI.click(findTestObject('Object Repository/Page_Kollective Portal/svg_Home_MuiSvgIcon-root'))

WebUI.switchToWindowTitle('Kollective Portal')

WebUI.click(findTestObject('Object Repository/Page_Kollective Portal/span_Add User'))

WebUI.switchToWindowTitle('Kollective Portal')

WebUI.click(findTestObject('Object Repository/Page_Kollective Portal/span_Add User'))

WebUI.switchToWindowTitle('Kollective Portal')

WebUI.click(findTestObject('Object Repository/Page_Kollective Portal/span_Add User'))

WebUI.switchToWindowTitle('Kollective Portal')

WebUI.click(findTestObject('Page_Kollective Portal/span_Add User'))

WebUI.switchToWindowTitle('Kollective Portal')

WebUI.click(findTestObject('Page_Kollective Portal/span_Add User'))

WebUI.switchToWindowTitle('Kollective Portal')

WebUI.click(findTestObject('Page_Kollective Portal/span_Add User'))

WebUI.switchToWindowTitle('Kollective Portal')

WebUI.click(findTestObject('Page_Kollective Portal/span_Add User'))

WebUI.switchToWindowTitle('Kollective Portal')

WebUI.click(findTestObject('Page_Kollective Portal/span_Add User'))

WebUI.switchToWindowTitle('Kollective Portal')

WebUI.click(findTestObject('Page_Kollective Portal/span_Add User'))

