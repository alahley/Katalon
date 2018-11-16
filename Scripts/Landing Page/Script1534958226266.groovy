import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Fires up the browser\n'
WebUI.openBrowser('https://stats.tc1.kontiki.com/login/email')

'Filling out login ino'
WebUI.setText(findTestObject('Page_Log in/input_email'), 'alahley@kollective.com')

'Filling out login ino'
WebUI.setEncryptedText(findTestObject('Page_Log in/input_password'), '5wulVsUVXnXznlrpFL+mjg==')

'Clicks the Stay Logged In button'
WebUI.click(findTestObject('Page_Log in/input_remember'))

'Clicks the Submit button to login'
WebUI.click(findTestObject('Page_Log in/input_login-submit'))

'Waits for the landing page to load'
WebUI.waitForPageLoad(10)

'Clicks the Overview button to make sure the page will refresh in a timely manner\n\n//this is probably redundant here and can potentially be removed.'
WebUI.click(findTestObject('Page_Live Event Summary/a_Overview'))

'Wait\n'
WebUI.waitForPageLoad(5)

'Landing Page | Verify if elemets are visable to confirm page load'
WebUI.verifyElementVisibleInViewport(findTestObject('Page_Overview/div_Live Events'), 10)

'CTA | Clicks on the Live Event Summary CTA'
WebUI.click(findTestObject('Page_Overview/a_Go to Live Event Summary'))

'Wait | Angular elements take a long time to load...'
WebUI.waitForAngularLoad(10)

'Live Event Summary | Verify the text Viewership Summary is showing up in the top div'
WebUI.verifyElementText(findTestObject('Page_Live Event Summary/div_Viewership Summary'), 'Viewership Summary')

'Overview | Clicks the overview button to go back to the landing page'
WebUI.click(findTestObject('Page_Live Event Summary/a_Overview'))

WebUI.waitForAngularLoad(10)

WebUI.click(findTestObject('Page_Overview/a_Go to VoD Summary'))

WebUI.waitForAngularLoad(10)

WebUI.verifyElementVisibleInViewport(findTestObject('Page_Live Event Summary/div_Viewership Summary'), 10)

WebUI.click(findTestObject('Page_Video on Demand Summary/a_Overview'))

WebUI.waitForAngularLoad(10)

WebUI.click(findTestObject('Page_Overview/a_Go to Network Summary'))

WebUI.waitForAngularLoad(10)

WebUI.verifyElementVisibleInViewport(findTestObject('Page_Network Summary/div_Bandwidth  Peering'), 10)

WebUI.closeBrowser()

