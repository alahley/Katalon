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
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

'Fires up the browser\n'
WebUI.openBrowser('https://stats.tc1.kontiki.com/login/email')

'Filling out login info (username)'
WebUI.setText(findTestObject('Object Repository/Page_Log in/input_email (1)'), 'alahley@kollective.com')

'Filling out login info (password)'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in/input_password (1)'), '5wulVsUVXnXznlrpFL+mjg==')

'Clicks the Stay Logged In button'
WebUI.click(findTestObject('Object Repository/Page_Log in/input_remember (1)'))

'Clicks the Submit button to login'
WebUI.click(findTestObject('Object Repository/Page_Log in/input_login-submit (1)'))

'Waits for all angular elements on the landing page to load'
WebUI.waitForAngularLoad(10)

'Clicks the Overview button to make sure the page will refresh in a timely manner\n\n//this is probably redundant here and can potentially be removed.'
WebUI.click(findTestObject('Object Repository/Page_Live Event Summary/a_Overview (1) (1)'))

'Wait\n'
WebUI.waitForAngularLoad(5)

'Landing Page | Verify if elemets are visable to confirm page load'
WebUI.verifyElementVisibleInViewport(findTestObject('Object Repository/Page_Overview/div_Live Events (2)'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_SCCM Summary/div_OverviewNetworkNetwork Sum (1)'), 10)

WebUI.click(findTestObject('Object Repository/Page_Overview/a_Network (2)'))

'Navigate to Network Summary'
WebUI.click(findTestObject('Object Repository/Page_Overview/a_Network Summary (1)'))

WebUI.waitForAngularLoad(0)

not_run: WebUI.click(findTestObject('Page_Network Summary/a_Network'))

'Navigate to Network Content'
not_run: WebUI.click(findTestObject('Page_Network Summary/a_Network Content'))

not_run: WebUI.waitForAngularLoad(0)

WebUI.click(findTestObject('Page_Network Content/a_Network'))

'Navigate to Network Locality'
WebUI.click(findTestObject('Page_Network Content/a_Network Locality'))

WebUI.waitForAngularLoad(0)

WebUI.click(findTestObject('Page_Network Locality/a_Live Events'))

WebUI.click(findTestObject('Object Repository/Page_Overview/a_Live Event Summary'))

WebUI.waitForAngularLoad(0)

WebUI.click(findTestObject('Object Repository/Page_Live Event Summary/a_Live Events (1)'))

WebUI.click(findTestObject('Object Repository/Page_Live (In Progress) Event/a_Live Event'))

WebUI.waitForAngularLoad(0)

'Navigate to Live Event dashboard'
WebUI.click(findTestObject('Page_Live Event/a_Live Events (1)'))

WebUI.click(findTestObject('Object Repository/Page_Live Event Summary/a_Live (In Progress) Event'))

WebUI.waitForAngularLoad(0)

WebUI.click(findTestObject('Object Repository/Page_Live (In Progress) Event/a_Video on Demand (1)'))

'Navigate to Video on Demand Summary'
WebUI.click(findTestObject('Object Repository/Page_Video on Demand Summary/a_Video on Demand Summary (1)'))

WebUI.waitForAngularLoad(0)

WebUI.click(findTestObject('Object Repository/Page_Video on Demand Summary/a_Video on Demand (1)'))

WebUI.click(findTestObject('Object Repository/Page_Video on Demand/a_Video on Demand_1 (1)'))

WebUI.waitForAngularLoad(0)

'Navigate to SCCM dashboard'
WebUI.click(findTestObject('Object Repository/Page_SCCM Summary/a_SCCM (1)'))

WebUI.waitForAngularLoad(0)

WebUI.closeBrowser()

not_run: WebUI.click(findTestObject('Object Repository/Page_Overview/a_Live Events (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Overview/a_Live Events (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Overview/a_Live Events (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Live Event Summary/a_Live Events_1'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Live (In Progress) Event/a_Live Events'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Live Event/a_Video on Demand'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Live Event/a_Video on Demand Summary'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Video on Demand Summary/a_Video on Demand (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Video on Demand Summary/a_Video on Demand_1'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Video on Demand/a_SCCM'))

not_run: WebUI.click(findTestObject('Object Repository/Page_SCCM Summary/a_Browse'))

not_run: WebUI.click(findTestObject('Object Repository/Page_SCCM Summary/div_Release Notes_flyout-backg'))

not_run: WebUI.click(findTestObject('Object Repository/Page_SCCM Summary/a_Explore'))

not_run: WebUI.click(findTestObject('Object Repository/Page_SCCM Summary/div_Deliveries  Agents_flyout-'))

not_run: WebUI.click(findTestObject('Object Repository/Page_SCCM Summary/a_Develop'))

not_run: WebUI.click(findTestObject('Object Repository/Page_SCCM Summary/div_Release Notes_flyout-backg'))

not_run: WebUI.click(findTestObject('Object Repository/Page_SCCM Summary/img_Home_img-logo'))

not_run: WebUI.closeBrowser()

