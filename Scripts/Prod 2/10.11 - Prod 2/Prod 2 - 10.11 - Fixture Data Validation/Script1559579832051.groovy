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
WebUI.openBrowser('https://stats.wg1.kontiki.com/login/email')

'Filling out login info (username)'
WebUI.setText(findTestObject('Page_Log in/input_email'), 'alahley@kollective.com')

'Filling out login info (password)'
WebUI.setEncryptedText(findTestObject('Page_Log in/input_password'), '5wulVsUVXnXznlrpFL+mjg==')

'Clicks the Stay Logged In button'
WebUI.click(findTestObject('Page_Log in/input_remember'))

'Clicks the Submit button to login'
WebUI.click(findTestObject('Page_Log in/input_login-submit'))

WebUI.waitForPageLoad(0)

'10 second Threshold: Waits for all angular elements on the landing page to load in 10 seconds or less\n'
WebUI.waitForAngularLoad(30)

'Clicks the filter to access options'
not_run: WebUI.click(findTestObject('Page_Overview/strong_Filters'))

'Use the filter dropdown to set a Time Filter of "Is in the year"'
not_run: WebUI.selectOptionByValue(findTestObject('Page_Overview/select_is in the pastis on the'), 'string:year', true)

'Set 2017 in the "Is in the year" field'
not_run: WebUI.setText(findTestObject('Page_Overview/input_Time Filter_form-control'), '2017')

'10 second Threshold: Waits for all angular elements on the landing page to load in 10 seconds or less\n'
not_run: WebUI.waitForAngularLoad(10)

'Clicks the Run button'
not_run: WebUI.click(findTestObject('Page_Overview/button_Run'))

'10 second Threshold: Waits for all angular elements on the landing page to load in 10 seconds or less\n'
not_run: WebUI.waitForAngularLoad(20)

'Clicks the gear icon to access Clear Cache and Refresh option'
not_run: WebUI.click(findTestObject('Page_Overview/i_Stop_lk-icon-gear'))

'Clear cache and refresh to get clean data'
not_run: WebUI.click(findTestObject('Page_Overview/a_Clear Cache  Refresh'))

'10 second Threshold: Waits for all angular elements on the landing page to load in 10 seconds or less\n'
not_run: WebUI.waitForAngularLoad(15)

not_run: WebUI.waitForPageLoad(0)

'Verify "Total Live Events" widget is on the page'
not_run: WebUI.verifyElementText(findTestObject('Page_Overview/div_Total Live Events'), 'Total Live Events')

'FIXTURE DATA - Verify Total Live Events widget has a value of 2,563'
not_run: WebUI.verifyElementText(findTestObject('Page_Overview/div_472'), '472')

'Verify "Average Monthly Events" widget is on the page'
not_run: WebUI.verifyElementText(findTestObject('Page_Live Event Summary/div_Average Monthly Events'), 'Average Monthly Events')

'FIXTURE DATA - Verify Average Monthly Events widget has a value of 226'
not_run: WebUI.verifyElementText(findTestObject('Page_Overview/div_46'), '46')

'Verify "Unique Viewers" widget is on the page'
not_run: WebUI.verifyElementText(findTestObject('Page_Overview/div_Unique Viewers'), 'Unique Viewers')

'FIXTURE DATA - Verify Unique Viewers widget has a value of 14,388'
not_run: WebUI.verifyElementText(findTestObject('Page_Overview/div_36651'), '36,651')

'Verify Average Monthly Viewers widget exists on page'
not_run: WebUI.verifyElementText(findTestObject('Page_Live Event Summary/div_Average Monthly Views'), 'Average Monthly Views')

'FIXTURE DATA - Verify Average Monthly Views widget has a value of 7,762'
not_run: WebUI.verifyElementText(findTestObject('Page_Overview/div_5316'), '5,316')

'Verify Total Videos widget exists on page'
not_run: WebUI.verifyElementText(findTestObject('Page_Overview/div_Total Videos'), 'Total Videos')

'FIXTURE DATA - Verify Total Videos widget has a value of 1,585'
not_run: WebUI.verifyElementText(findTestObject('Page_Overview/div_245'), '245')

'Verify Total Views widget exists on page'
not_run: WebUI.verifyElementText(findTestObject('Page_Overview/div_Total Views'), 'Total Views')

'FIXTURE DATA - Verify Total views widget has a value of 17,443'
not_run: WebUI.verifyElementText(findTestObject('Page_Overview/div_3748'), '3,748')

'Verify Unique Viewers widget exists on page'
not_run: WebUI.verifyElementText(findTestObject('Page_Overview/div_Unique Viewers'), 'Unique Viewers')

'FIXTURE DATA - Verify Unique Viewers widget has a value of 11,413'
not_run: WebUI.verifyElementText(findTestObject('Page_Overview/div_2683'), '2,683')

'Verify Total Hours Watched widget exists on page'
not_run: WebUI.verifyElementText(findTestObject('Page_Overview/div_Total Hours Watched'), 'Total Hours Watched')

'FIXTURE DATA - Verify Total Hours Watched widget has a value of 1,404.1'
not_run: WebUI.verifyElementText(findTestObject('Page_Overview/div_1167.4'), '1,167.4')

'Verify Unique Agent widget exists on page'
not_run: WebUI.verifyElementText(findTestObject('Page_Overview/div_Unique Agents'), 'Unique Agents')

'FIXTURE DATA - Verify Unique Agents widget has a value of 10,905'
not_run: WebUI.verifyElementText(findTestObject('Page_Overview/div_56499'), '56,499')

'Verify Deliveries widget exists on page'
not_run: WebUI.verifyElementText(findTestObject('Page_Overview/div_Deliveries'), 'Deliveries')

'FIXTURE DATA - Verify Delivery widget has a value of 67,512'
not_run: WebUI.verifyElementText(findTestObject('Page_Overview/div_219148'), '219,148')

'Verify Saved GB widget exists on page'
not_run: WebUI.verifyElementText(findTestObject('Page_Overview/div_Saved GB'), 'Saved GB')

'FIXTURE DATA - Verify Saved GB widget has a value of 1,573'
not_run: WebUI.verifyElementText(findTestObject('Page_Overview/div_15517'), '15,517')

'Verify Total GB widget exists on page'
not_run: WebUI.verifyElementText(findTestObject('Page_Overview/div_Total GB'), 'Total GB')

'FIXTURE DATA - Verify Total GB widget has a value of 3,865.08'
not_run: WebUI.verifyElementText(findTestObject('Page_Overview/div_21067.65'), '21,067.65')

'Verify the Peering Efficiency widget appears on page'
not_run: WebUI.verifyElementPresent(findTestObject('Page_Overview/div_Peering Efficiency'), 0)

'Verify the Peering Efficiency widget appears on page and has a value of 41%'
not_run: WebUI.verifyElementPresent(findTestObject('Page_Overview/div_74'), 74)

'Verify the VoD Summary Peering Efficiency widget appears on page'
not_run: WebUI.verifyElementPresent(findTestObject('Page_Overview/div_VoD Summary Peering Effici'), 0)

'Verify the VoD Summary widget appears on page'
not_run: WebUI.verifyElementPresent(findTestObject('Page_Overview/a_Go to VoD Summary (1)'), 0)

'Verify the Peering Efficiency donut chart appears on page'
not_run: WebUI.verifyElementPresent(findTestObject('Page_Overview/div_Peering Efficiency'), 0)

'Verify the Peering Efficiency widget appears on page and has a value of 66% in the donut chart'
not_run: WebUI.verifyElementPresent(findTestObject('Page_Overview/div_Peering Efficiency (1)'), 0)

'Verify the Live Views widget appears on page'
not_run: WebUI.verifyElementPresent(findTestObject('Page_Overview/div_Live Views'), 0)

'Verify the Live Events widget appears on page'
not_run: WebUI.verifyElementPresent(findTestObject('Page_Overview/div_Live Events'), 0)

'Verify the VoD Views widget appears on page'
not_run: WebUI.verifyElementPresent(findTestObject('Page_Overview/span_VoD Views'), 0)

'Verify the VoD over time widget appears on page'
not_run: WebUI.verifyElementPresent(findTestObject('Page_Overview/div_VoD over time'), 0)

'Verify the Deliveries by Month widget appears on page'
not_run: WebUI.verifyElementPresent(findTestObject('Page_Overview/span_Deliveries by Month'), 0)

'Verify the Live Event Summary CTA appears on page'
not_run: WebUI.verifyElementPresent(findTestObject('Page_Overview/a_Go to Live Event Summary'), 0)

'Verify the VoD Summary CTA appears on page'
not_run: WebUI.verifyElementPresent(findTestObject('Page_Overview/a_Go to VoD Summary'), 0)

'Verify the Network Summary CTA appears on page'
not_run: WebUI.verifyElementPresent(findTestObject('Page_Overview/a_Go to Network Summary'), 0)

'Waits for all angular elements on the landing page to load'
not_run: WebUI.waitForAngularLoad(10)

WebUI.navigateToUrl('https://stats.wg1.kontiki.com/admin/users?sorts=last_name%20asc&name=demo')

'Waits for all angular elements on the landing page to load'
WebUI.waitForAngularLoad(30)

WebUI.click(findTestObject('Page_Users/a_Sudo'))

WebUI.waitForPageLoad(0)

'Waits for all angular elements on the landing page to load'
WebUI.waitForAngularLoad(30)

WebUI.verifyElementText(findTestObject('Page_Overview/span_You are sudoing as Demo U'), 'You are sudoing as Demo User.')

WebUI.navigateToUrl('https://stats.wg1.kontiki.com/dashboards/analytics_external::Overview?time_filter=&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22anytime%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

'Waits for all angular elements on the landing page to load'
WebUI.waitForAngularLoad(30)

WebUI.click(findTestObject('Page_Overview/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Overview/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(30)

WebUI.waitForPageLoad(0)

'Verify the Total Live Events widget has a value of 14'
WebUI.verifyElementText(findTestObject('Page_Overview/div_15'), '15')

'Verify the Average Monthly Events widget has a value of 4'
WebUI.verifyElementText(findTestObject('Page_Overview/div_3'), '3')

'Verify the Unique Viewers widget has a value of 65,282'
WebUI.verifyElementText(findTestObject('Page_Overview/div_72889'), '72,889')

'Verify the Average Monthly Views widget has a value of 16,748'
WebUI.verifyElementText(findTestObject('Page_Overview/div_15007'), '15,007')

'Verify the Total Videos widget has a value of 15'
WebUI.verifyElementText(findTestObject('Page_Overview/div_15'), '15')

'Verify the Total Views widget has a value of 163,134'
WebUI.verifyElementText(findTestObject('Page_Overview/div_405168'), '405,168')

'Verify the Unique Viewers widget has a value of 103,654'
WebUI.verifyElementText(findTestObject('Page_Overview/div_218173'), '218,173')

'Verify the Total Hours Watched widget has a value of 13,578.7'
WebUI.verifyElementText(findTestObject('Page_Overview/div_33714.4'), '33,714.4')

'Verify the Unique Agents widget has a value of 343,541'
WebUI.verifyElementText(findTestObject('Page_Overview/div_602952'), '602,952')

'Verify the Deliveries widget has a value of 628,085'
WebUI.verifyElementText(findTestObject('Page_Overview/div_1086802'), '1,086,802')

'Verify the Saved GB widget has a value of 19,290\n'
WebUI.verifyElementText(findTestObject('Page_Overview/div_37744'), '37,744')

'Verify the Total GB widget has a value of 21,243.22'
WebUI.verifyElementText(findTestObject('Page_Overview/div_42824.36'), '42,824.36')

'Verify the Peering Efficiency widget has a value of 91%'
WebUI.verifyElementText(findTestObject('Page_Overview/div_88'), '88%')

WebUI.closeBrowser()
