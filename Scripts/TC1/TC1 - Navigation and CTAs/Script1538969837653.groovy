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
WebUI.openBrowser('https://stats.tc1.kontiki.com/login/email')

'Filling out login info (username)'
WebUI.setText(findTestObject('Page_Log in/input_email (2)'), 'alahley@kollective.com')

'Filling out login info (password)'
WebUI.setEncryptedText(findTestObject('Page_Log in/input_password (2)'), '5wulVsUVXnXznlrpFL+mjg==')

'Clicks the Stay Logged In button'
WebUI.click(findTestObject('Page_Log in/input_remember (2)'))

'Clicks the Submit button to login'
WebUI.click(findTestObject('Page_Log in/input_login-submit (2)'))

'10 second Threshold: Waits for all angular elements on the landing page to load in 10 seconds or less\n'
WebUI.waitForAngularLoad(10)

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Page_Network Summary/a_Overview'))

WebUI.verifyElementVisible(findTestObject('Page_Overview/a_Go to Live Event Summary'))

WebUI.click(findTestObject('Page_Overview/a_Go to Live Event Summary'))

'10 second Threshold: Waits for all angular elements on the landing page to load in 10 seconds or less\n'
WebUI.waitForAngularLoad(10)

WebUI.verifyElementText(findTestObject('Page_Live Event Summary/div_Live Event Summary'), 'Live Event Summary')

WebUI.click(findTestObject('Page_Network Summary/a_Overview'))

'10 second Threshold: Waits for all angular elements on the landing page to load in 10 seconds or less\n'
WebUI.waitForAngularLoad(10)

WebUI.verifyElementVisible(findTestObject('Page_Overview/a_Go to VoD Summary'))

WebUI.click(findTestObject('Page_Overview/a_Go to VoD Summary'))

'10 second Threshold: Waits for all angular elements on the landing page to load in 10 seconds or less\n'
WebUI.waitForAngularLoad(15)

WebUI.verifyElementText(findTestObject('Page_Video on Demand Summary/div_Video on Demand Summary'), 'Video on Demand Summary')

WebUI.click(findTestObject('Page_Network Summary/a_Overview'))

'10 second Threshold: Waits for all angular elements on the landing page to load in 10 seconds or less\n'
WebUI.waitForAngularLoad(10)

WebUI.verifyElementVisible(findTestObject('Page_Overview/a_Go to Network Summary'))

WebUI.click(findTestObject('Page_Overview/a_Go to Network Summary'))

'10 second Threshold: Waits for all angular elements on the landing page to load in 10 seconds or less\n'
WebUI.waitForAngularLoad(20)

WebUI.verifyElementText(findTestObject('Page_Network Summary/div_Network Summary'), 'Network Summary')

WebUI.click(findTestObject('Page_Network Summary/a_Overview'))

'10 second Threshold: Waits for all angular elements on the landing page to load in 10 seconds or less\n'
WebUI.waitForAngularLoad(10)

WebUI.click(findTestObject('Page_Overview/a_Network'))

WebUI.verifyElementPresent(findTestObject('Page_Overview/a_Network Summary'), 0)

WebUI.verifyElementClickable(findTestObject('Page_Overview/a_Network Summary'))

WebUI.click(findTestObject('Page_Overview/a_Network Summary'))

'10 second Threshold: Waits for all angular elements on the landing page to load in 10 seconds or less\n'
WebUI.waitForAngularLoad(10)

WebUI.click(findTestObject('Page_Overview/a_Network'))

WebUI.verifyElementPresent(findTestObject('Page_Network Summary/a_Network Content'), 0)

WebUI.verifyElementClickable(findTestObject('Page_Network Summary/a_Network Content'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Network Summary/a_Network Content'), FailureHandling.CONTINUE_ON_FAILURE)

'10 second Threshold: Waits for all angular elements on the landing page to load in 10 seconds or less\n'
WebUI.waitForAngularLoad(20)

WebUI.click(findTestObject('Page_Overview/a_Network'))

WebUI.verifyElementPresent(findTestObject('Page_Network Content/a_Network Locality'), 0)

WebUI.verifyElementClickable(findTestObject('Page_Network Content/a_Network Locality'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Network Content/a_Network Locality'), FailureHandling.CONTINUE_ON_FAILURE)

'10 second Threshold: Waits for all angular elements on the landing page to load in 10 seconds or less\n'
WebUI.waitForAngularLoad(10)

WebUI.click(findTestObject('Page_Network Locality/a_Live Events'))

WebUI.verifyElementPresent(findTestObject('Page_Network Locality/a_Live Event Summary'), 0)

WebUI.verifyElementClickable(findTestObject('Page_Network Locality/a_Live Event Summary'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Live Event Summary/a_Live Event'), 0)

WebUI.verifyElementClickable(findTestObject('Page_Live Event Summary/a_Live Event'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Live Event/a_Live (In Progress) Event'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Live Event/a_Live (In Progress) Event'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Video on Demand'))

WebUI.verifyElementPresent(findTestObject('Page_Live (In Progress) Event/a_Video on Demand Summary'), 0)

WebUI.verifyElementClickable(findTestObject('Page_Live (In Progress) Event/a_Video on Demand Summary'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Video on Demand Summary/a_Video on Demand_1'), 0)

WebUI.verifyElementClickable(findTestObject('Page_Video on Demand Summary/a_Video on Demand_1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Video on Demand/a_SCCM'), 0)

WebUI.verifyElementClickable(findTestObject('Page_Video on Demand/a_SCCM'))

WebUI.click(findTestObject('Page_Video on Demand/a_SCCM'))

'10 second Threshold: Waits for all angular elements on the landing page to load in 10 seconds or less\n'
WebUI.waitForAngularLoad(20)

WebUI.click(findTestObject('Page_SCCM Summary/a'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_SCCM Summary/lk-flyout_HomePopularFavorites'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_SCCM Summary/a_Log Out'), 0)

WebUI.click(findTestObject('Page_SCCM Summary/a_Log Out'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Log in/div_Logout Successful.'), 0)

WebUI.verifyTextPresent('Logout Successful.', false)

WebUI.closeBrowser()

