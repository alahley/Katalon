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
WebUI.openBrowser('https://stats.us2.kontiki.com/login/email')

'Filling out login info (username)'
WebUI.setText(findTestObject('Page_Log in/input_email'), 'alahley@kollective.com')

'Filling out login info (password)'
WebUI.setEncryptedText(findTestObject('Page_Log in/input_password'), '5wulVsUVXnXznlrpFL+mjg==')

'Clicks the Stay Logged In button'
WebUI.click(findTestObject('Page_Log in/input_remember'))

'Clicks the Submit button to login'
WebUI.click(findTestObject('Page_Log in/input_login-submit'))

'10 second Threshold: Waits for all angular elements on the landing page to load in 10 seconds or less\n'
WebUI.waitForAngularLoad(45)

'Clicks the filter to access options'
WebUI.click(findTestObject('Page_Overview/strong_Filters'))

'Use the filter dropdown to set a Time Filter of "Is in the year"'
WebUI.selectOptionByValue(findTestObject('Page_Overview/select_is in the pastis on the'), 'string:year', true)

'Set 2017 in the "Is in the year" field'
WebUI.setText(findTestObject('Page_Overview/input_Time Filter_form-control'), '2017')

'10 second Threshold: Waits for all angular elements on the landing page to load in 10 seconds or less\n'
WebUI.waitForAngularLoad(45)

'Clicks the Run button'
WebUI.click(findTestObject('Page_Overview/button_Run'))

'10 second Threshold: Waits for all angular elements on the landing page to load in 10 seconds or less\n'
WebUI.waitForAngularLoad(45)

'Clicks the gear icon to access Clear Cache and Refresh option'
WebUI.click(findTestObject('Page_Overview/i_Stop_lk-icon-gear'))

'Clear cache and refresh to get clean data'
WebUI.click(findTestObject('Page_Overview/a_Clear Cache  Refresh'))

WebUI.waitForPageLoad(0)

'10 second Threshold: Waits for all angular elements on the landing page to load in 10 seconds or less\n'
WebUI.waitForAngularLoad(45)

'Verify "Total Live Events" widget is on the page'
WebUI.verifyElementText(findTestObject('Page_Overview/div_Events'), 'Events')

'FIXTURE DATA - Verify Total Live Events widget has a value of 2,563'
WebUI.verifyElementText(findTestObject('Page_Overview/div_172'), '172')

'Verify "Average Monthly Events" widget is on the page'
WebUI.verifyElementText(findTestObject('Page_Overview/div_Avg. Monthly Events'), 'Avg. Monthly Events')

'FIXTURE DATA - Verify Average Monthly Events widget has a value of 226'
WebUI.verifyElementText(findTestObject('Page_Overview/div_30'), '30')

'Verify "Unique Viewers" widget is on the page'
WebUI.verifyElementText(findTestObject('Page_Overview/div_Views'), 'Views')

'FIXTURE DATA - Verify Unique Viewers widget has a value of 14,388'
not_run: WebUI.verifyElementText(findTestObject('Page_Overview/div_22673'), '22,673')

'Verify Average Monthly Viewers widget exists on page'
WebUI.verifyElementText(findTestObject('Page_Overview/div_Avg. Monthly Views'), 'Avg. Monthly Views')

'FIXTURE DATA - Verify Average Monthly Views widget has a value of 7,762'
WebUI.verifyElementText(findTestObject('Page_Overview/div_4767'), '4,767')

'Verify Total Videos widget exists on page'
WebUI.verifyElementText(findTestObject('Page_Overview/div_Videos'), 'Videos')

'FIXTURE DATA - Verify Total Videos widget has a value of 1,585'
WebUI.verifyElementText(findTestObject('Page_Overview/div_36'), '36')

'Verify Total Views widget exists on page'
WebUI.verifyElementText(findTestObject('Page_Overview/div_Views'), 'Views')

'FIXTURE DATA - Verify Total views widget has a value of 17,443'
WebUI.verifyElementText(findTestObject('Page_Overview/div_176'), '176')

'Verify Unique Viewers widget exists on page'
WebUI.verifyElementText(findTestObject('Page_Overview/div_Agents'), 'Agents')

'FIXTURE DATA - Verify Unique Viewers widget has a value of 11,413'
not_run: WebUI.verifyElementText(findTestObject('Page_Overview/div_61'), '61')

'Verify Total Hours Watched widget exists on page'
WebUI.verifyElementText(findTestObject('Page_Overview/div_Hours Viewed'), 'Hours Viewed')

'FIXTURE DATA - Verify Total Hours Watched widget has a value of 1,404.1'
not_run: WebUI.verifyElementText(findTestObject('Page_Overview/div_9'), '9')

'Verify Unique Agent widget exists on page'
WebUI.verifyElementText(findTestObject('Page_Overview/div_Agents'), 'Agents')

'FIXTURE DATA - Verify Unique Agents widget has a value of 10,905'
not_run: WebUI.verifyElementText(findTestObject('Page_Overview/div_23985'), '23,985')

'Verify Deliveries widget exists on page'
WebUI.verifyElementText(findTestObject('Page_Overview/div_Deliveries (1)'), 'Deliveries')

'FIXTURE DATA - Verify Delivery widget has a value of 67,512'
WebUI.verifyElementText(findTestObject('Page_Overview/div_31864'), '31,864')

'Verify Saved GB widget exists on page'
WebUI.verifyElementText(findTestObject('Page_Overview/div_Saved GB'), 'Saved GB')

'FIXTURE DATA - Verify Saved GB widget has a value of 1,573'
WebUI.verifyElementText(findTestObject('Page_Overview/div_4382'), '4,382')

'Verify Total GB widget exists on page'
WebUI.verifyElementText(findTestObject('Page_Overview/div_Total GB'), 'Total GB')

'FIXTURE DATA - Verify Total GB widget has a value of 3,865.08'
not_run: WebUI.verifyElementText(findTestObject('Page_Overview/div_5413'), '5,413')

'Verify the Peering Efficiency widget appears on page'
not_run: WebUI.verifyElementPresent(findTestObject('Page_Overview/div_Peering Efficiency'), 0)

'Verify the Peering Efficiency widget appears on page and has a value of 41%'
not_run: WebUI.verifyElementPresent(findTestObject('Page_Overview/div_81'), 81)

'Verify the VoD Summary Peering Efficiency widget appears on page'
not_run: WebUI.verifyElementPresent(findTestObject('Page_Overview/div_VoD Summary Peering Effici'), 0)

'Verify the VoD Summary widget appears on page'
WebUI.verifyElementPresent(findTestObject('Page_Overview/a_Go to VoD Summary (1)'), 0)

'Verify the Live Event Summary CTA appears on page'
WebUI.verifyElementPresent(findTestObject('Page_Overview/a_Go to Live Event Summary'), 0)

'Verify the Network Summary CTA appears on page'
WebUI.verifyElementPresent(findTestObject('Page_Overview/a_Go to Network Summary'), 0)

'Waits for all angular elements on the landing page to load'
WebUI.waitForAngularLoad(45)

WebUI.waitForPageLoad(0)

WebUI.closeBrowser()

