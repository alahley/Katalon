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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

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

'Waits for all angular elements on the landing page to load'
WebUI.waitForAngularLoad(10)

WebUI.click(findTestObject('Page_Overview/span_Admin (1) (1) (1) (1)'))

WebUI.click(findTestObject('Page_General Settings/a_Users'))

'Waits for all angular elements on the landing page to load'
WebUI.waitForAngularLoad(10)

WebUI.click(findTestObject('Page_Users/a_Sudo (1)'))

'Waits for all angular elements on the landing page to load'
WebUI.waitForAngularLoad(10)

WebUI.verifyElementPresent(findTestObject('Page_Overview/div_14 (2) (1) (1)'), 0)

'Verify "Total Live Events" widget is on the page'
WebUI.verifyElementText(findTestObject('Page_Overview/div_14 (2) (1) (1)'), 'Total Live Events')

'FIXTURE DATA - Verify Total Live Events widget has a value of 14'
WebUI.verifyElementText(findTestObject('Page_Overview/div_14 (1) (1) (1) (1)'), '14')

'Verify "Average Monthly Events" widget is on the page'
WebUI.verifyElementText(findTestObject('Page_Overview/div_4 (2) (1) (1)'), 'Average Monthly Events')

'FIXTURE DATA - Verify Average Monthly Events widget has a value of 4'
WebUI.verifyElementText(findTestObject('Page_Overview/div_4 (1) (1) (1) (1)'), '4')

'Verify "Unique Viewers" widget is on the page'
WebUI.verifyElementText(findTestObject('Page_Overview/div_66458 (2) (1) (1)'), 'Unique Viewers')

'FIXTURE DATA - Verify Unique Viewers widget has a value of 66,458'
WebUI.verifyElementText(findTestObject('Page_Overview/div_66458 (1) (1) (1) (1)'), '66,458')

'Verify Average Monthly Viewers widget exists on page'
WebUI.verifyElementText(findTestObject('Page_Overview/div_16748 (2) (1) (1)'), 'Average Monthly Views')

'FIXTURE DATA - Verify Average Monthly Views widget has a value of 16,748'
WebUI.verifyElementText(findTestObject('Page_Overview/div_16748 (1) (1) (1) (1)'), '16,748')

'Verify Total Videos widget exists on page'
WebUI.verifyElementText(findTestObject('Page_Overview/div_15 (1) (1)'), 'Total Videos')

'FIXTURE DATA - Verify Total Videos widget has a value of 15'
WebUI.verifyElementText(findTestObject('Page_Overview/div_15 (2)'), '15')

'Verify Unique Viewers widget exists on page'
WebUI.verifyElementText(findTestObject('Page_Overview/div_130493 (1) (1)'), 'Unique Viewers')

'FIXTURE DATA - Verify Unique Viewers widget has a value of 130,493'
WebUI.verifyElementText(findTestObject('Page_Overview/div_130493 (2)'), '130,493')

'Verify Total Views widget exists on page'
WebUI.verifyElementText(findTestObject('Page_Overview/div_191836 (1) (1)'), 'Total Views')

'FIXTURE DATA - Verify Total Views widget has a value of 191,836'
WebUI.verifyElementText(findTestObject('Page_Overview/div_191836 (2)'), '191,836')

'Verify Total Hours Watched widget exists on page'
WebUI.verifyElementText(findTestObject('Page_Overview/div_15969 (1) (1)'), 'Total Hours Watched')

'FIXTURE DATA - Verify Total Hours Watched widget has a value of 15,969'
WebUI.verifyElementText(findTestObject('Page_Overview/div_15969 (2)'), '15,969')

'Verify Unique Agent widget exists on page'
WebUI.verifyElementText(findTestObject('Page_Overview/div_385459'), 'Unique Agents')

'FIXTURE DATA - Verify Unique Agents widget has a value of 385,459'
WebUI.verifyElementText(findTestObject('Page_Overview/div_385459 (1)'), '385,459')

'Verify Deliveries widget exists on page'
WebUI.verifyElementText(findTestObject('Page_Overview/div_724516'), 'Deliveries')

'FIXTURE DATA - Verify Delivery widget has a value of 724,516'
WebUI.verifyElementText(findTestObject('Page_Overview/div_724516 (1)'), '724,516')

'Verify Saved GB widget exists on page'
WebUI.verifyElementText(findTestObject('Page_Overview/div_22661'), 'Saved GB')

'FIXTURE DATA - Verify Saved GB widget has a value of 22,661'
WebUI.verifyElementText(findTestObject('Page_Overview/div_22661 (1)'), '22,661')

'Verify Total GB widget exists on page'
WebUI.verifyElementText(findTestObject('Page_Overview/div_24817'), 'Total GB')

'FIXTURE DATA - Verify Total GB widget has a value of 24,816.64'
WebUI.verifyElementText(findTestObject('Page_Overview/div_24817 (1)'), '24,816.64')

'CTA - Use the Live Event Summary button'
WebUI.click(findTestObject('Page_Overview/a_Go to Live Event Summary'))

'LIVE EVENTS SUMMARY PAGE - Waits for all angular elements on the Summary page'
WebUI.waitForAngularLoad(20)

'Verify Viewership Summary title is present on page'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Live Event Summary/div_Viewership Summary (1) (1)'), 0)

'Verify Events Summary title is present on page'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Live Event Summary/div_Events Summary (1)'), 0)

'Verify In-Progress and Recent Live Events title is present on page'
WebUI.verifyElementPresent(findTestObject('Page_Live Event Summary/div_In-Progress and Recent Liv'), 0)

'Verify sub title Click on an event for detailed metrics (In-Progress and Recent Live Events) title is present on page'
WebUI.verifyElementPresent(findTestObject('Page_Live Event Summary/div_Click on an event for deta'), 0)

'Verify the Live Events graph is present on page'
WebUI.verifyElementPresent(findTestObject('Page_Live Event Summary/a_Live Events'), 0)

'Verify the Peering Efficiency graph is present on page'
WebUI.verifyElementPresent(findTestObject('Page_Overview/div_Peering Efficiency (1)'), 0)

WebUI.acceptAlert()

not_run: WebUI.acceptAlert()

not_run: WebUI.acceptAlert()

not_run: WebUI.acceptAlert()

not_run: WebUI.click(findTestObject('Object Repository/Page_Live Event Summary/div_66991 (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Live Event Summary/div_Views (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Live Event Summary/div_Unique Viewers (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Live Event Summary/div_66458 (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Live Event Summary/div_16748 (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Live Event Summary/div_Average Monthly Views (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Live Event Summary/span_Live Views (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Live Event Summary/span_Views with Buffering (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Live Event Summary/span_Views by Buffering Time (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Live Event Summary/div_Viewership Summary (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Live Event Summary/div_Events Summary (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Live Event Summary/div_14 (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Live Event Summary/div_Total Live Events (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Live Event Summary/div_4 (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Live Event Summary/div_Average Monthly Events (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Live Event Summary/span_Live Events (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Live Event Summary/span_Peering Efficiency (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Live Event Summary/div_No Results (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Live Event Summary/span_Recent Live Events (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Live Event Summary/div_Recent Live EventsAn Error (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Live Event Summary/div_In-Progress and Recent Liv'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Live Event Summary/div_Click on an event for deta'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Live Event Summary/span_In Progress Events'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Live Event Summary/span_Recent Live Events (1)'))

WebUI.closeBrowser()

