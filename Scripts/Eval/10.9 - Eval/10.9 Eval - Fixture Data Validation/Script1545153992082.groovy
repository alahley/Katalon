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

'Fires up the browser\n'
WebUI.openBrowser('https://stats.eval.kontiki.com/login/email')

'Filling out login info (username)'
WebUI.setText(findTestObject('Page_Log in/input_email'), 'alahley@kollective.com')

'Filling out login info (password)'
WebUI.setEncryptedText(findTestObject('Page_Log in/input_password'), '5wulVsUVXnXznlrpFL+mjg==')

'Clicks the Stay Logged In button'
WebUI.click(findTestObject('Page_Log in/input_remember'))

'Clicks the Submit button to login'
WebUI.click(findTestObject('Page_Log in/input_login-submit'))

'10 second Threshold: Waits for all angular elements on the landing page to load in 10 seconds or less\n'
WebUI.waitForAngularLoad(10)

WebUI.waitForPageLoad(0)

WebUI.navigateToUrl('https://stats.eval.kontiki.com/admin/users?sorts=last_name%20asc&name=eval%20demo')

'Waits for all angular elements on the landing page to load'
WebUI.waitForAngularLoad(10)

WebUI.click(findTestObject('Page_Users/a_Sudo'))

WebUI.waitForPageLoad(0)

'Waits for all angular elements on the landing page to load'
WebUI.waitForAngularLoad(10)

WebUI.verifyElementText(findTestObject('Page_Overview/span_You are sudoing as Eval D'), 'You are sudoing as Eval Demo.')

WebUI.click(findTestObject('Page_Overview/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Overview/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(15)

WebUI.waitForPageLoad(0)

'Verify the Total Live Events widget has a value of 14'
WebUI.verifyElementText(findTestObject('Page_Overview/div_14'), '14')

'Verify the Average Monthly Events widget has a value of 4'
WebUI.verifyElementText(findTestObject('Page_Overview/div_4'), '4')

'Verify the Unique Viewers widget has a value of 65,282'
WebUI.verifyElementText(findTestObject('Page_Overview/div_65282'), '65,282')

'Verify the Average Monthly Views widget has a value of 16,748'
WebUI.verifyElementText(findTestObject('Page_Overview/div_16748'), '16,748')

'Verify the Total Videos widget has a value of 15'
WebUI.verifyElementText(findTestObject('Page_Overview/div_15'), '15')

'Verify the Total Views widget has a value of 185,239'
WebUI.verifyElementText(findTestObject('Page_Overview/div_185239'), '185,239')

'Verify the Unique Viewers widget has a value of 114,063'
WebUI.verifyElementText(findTestObject('Page_Overview/div_114063'), '114,063')

'Verify the Total Hours Watched widget has a value of 15,421.6'
WebUI.verifyElementText(findTestObject('Page_Overview/div_15421.6'), '15,421.6')

'Verify the Unique Agents widget has a value of 364,941'
WebUI.verifyElementText(findTestObject('Page_Overview/div_364941'), '364,941')

'Verify the Deliveries widget has a value of 717,419'
WebUI.verifyElementText(findTestObject('Page_Overview/div_717419'), '717,419')

'Verify the Saved GB widget has a value of 22,536'
WebUI.verifyElementText(findTestObject('Page_Overview/div_22536'), '22,536')

'Verify the Total GB widget has a value of 24,669.05'
WebUI.verifyElementText(findTestObject('Page_Overview/div_24669.05'), '24,669.05')

'Verify the Peering Efficiency widget has a value of 91%'
WebUI.verifyElementText(findTestObject('Page_Overview/div_91'), '91%')

WebUI.closeBrowser()

