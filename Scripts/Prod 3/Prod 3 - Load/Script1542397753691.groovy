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
WebUI.openBrowser('https://stats.ac1.kontiki.com/login/email')

'Filling out login info (username)'
WebUI.setText(findTestObject('Object Repository/Page_Log in/input_email (2)'), 'alahley@kollective.com')

'Filling out login info (password)'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in/input_password (2)'), '5wulVsUVXnXznlrpFL+mjg==')

'Clicks the Stay Logged In button'
WebUI.click(findTestObject('Object Repository/Page_Log in/input_remember (2)'))

'Clicks the Submit button to login'
WebUI.click(findTestObject('Object Repository/Page_Log in/input_login-submit (2)'))

'10 second Threshold: Waits for all angular elements on the landing page to load in 10 seconds or less\n'
WebUI.waitForAngularLoad(10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Overview/a'), 0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.ac1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=24546790-ef8f-4234-82a8-a4e6f301124c&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2224546790-ef8f-4234-82a8-a4e6f301124c%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'ACTUAL LIVE EVENT Live In Progress Event\n'
WebUI.navigateToUrl('https://stats.ac1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=90767043-6efd-4b65-a11e-0b42967f6b3b&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2290767043-6efd-4b65-a11e-0b42967f6b3b%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.ac1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=b1dd01d4-d83e-4c7d-95cd-1bda21e3c0f4&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22b1dd01d4-d83e-4c7d-95cd-1bda21e3c0f4%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.ac1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=9136bfd0-eb87-441c-877c-7be0d13c12ee&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%229136bfd0-eb87-441c-877c-7be0d13c12ee%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event with no Moid, time filter in the past 5 minutes'
WebUI.navigateToUrl('https://stats.ac1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=&format_moid_filter=&time_filter=5%20minutes&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%225%22,%22unit%22:%22min%22%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'ACTUAL LIVE EVENT Live In Progress Event\n'
WebUI.navigateToUrl('https://stats.ac1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=608f167c-2fc2-456c-b41d-13d13a25986b&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22608f167c-2fc2-456c-b41d-13d13a25986b%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.ac1.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=a6ccf98e-ab4e-40ad-9761-4227f31f6420&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22a6ccf98e-ab4e-40ad-9761-4227f31f6420%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.ac1.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=33e2867b-f623-472f-b398-ba8317f00e50&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2233e2867b-f623-472f-b398-ba8317f00e50%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.ac1.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=9136bfd0-eb87-441c-877c-7be0d13c12ee&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%229136bfd0-eb87-441c-877c-7be0d13c12ee%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event with no Moid, time filter set to the past 15 minutes'
WebUI.navigateToUrl('https://stats.ac1.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=&format_moid_filter=&time_filter=15%20minutes&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%2215%22,%22unit%22:%22min%22%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'ACTUAL LIVE EVENT Live In Progress Event\n'
WebUI.navigateToUrl('https://stats.ac1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=608f167c-2fc2-456c-b41d-13d13a25986b&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22608f167c-2fc2-456c-b41d-13d13a25986b%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.ac1.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=62e0c489-d575-4aca-ac54-ace9bc1dce04&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2262e0c489-d575-4aca-ac54-ace9bc1dce04%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.ac1.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=67818c67-45f5-4409-9bb8-b40622522e49&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2267818c67-45f5-4409-9bb8-b40622522e49%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.ac1.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=d60f6002-85e5-0ed2-1112-dc07f9ec63fb&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22d60f6002-85e5-0ed2-1112-dc07f9ec63fb%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event with no Moid, time filter set to the past 90 minutes'
WebUI.navigateToUrl('https://stats.ac1.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=20ad83d7-7990-df07-957e-f7230f56d82a&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2220ad83d7-7990-df07-957e-f7230f56d82a%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.ac1.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=eb6edb63-264e-4bea-8883-50110b74c51e&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22eb6edb63-264e-4bea-8883-50110b74c51e%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.ac1.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=1c2dce91-2a67-b5fd-2f4a-f75b969bcb9a&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%221c2dce91-2a67-b5fd-2f4a-f75b969bcb9a%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.ac1.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=f88a64ee-e75e-47c9-bb0f-5e2a2c38770a&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22f88a64ee-e75e-47c9-bb0f-5e2a2c38770a%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.ac1.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=1c2dce91-2a67-b5fd-2f4a-f75b969bcb9a&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%221c2dce91-2a67-b5fd-2f4a-f75b969bcb9a%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Explore Views/div_Toggle Dropdown'))

WebUI.click(findTestObject('Page_Explore Views/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event with no Moid, time filter set to the past week'
WebUI.navigateToUrl('https://stats.ac1.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=&format_moid_filter=&time_filter=1%20weeks&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%221%22,%22unit%22:%22wk%22%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Newwork Content with a specific Moid'
WebUI.navigateToUrl('https://stats.ac1.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=1c2dce91-2a67-b5fd-2f4a-f75b969bcb9a&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%221c2dce91-2a67-b5fd-2f4a-f75b969bcb9a%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Newwork Content with a specific Moid'
WebUI.navigateToUrl('https://stats.ac1.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=b6d7cf23-0352-4211-9b4c-30e1ee20e228&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22b6d7cf23-0352-4211-9b4c-30e1ee20e228%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Newwork Content with a specific Moid'
WebUI.navigateToUrl('https://stats.ac1.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=20ad83d7-7990-df07-957e-f7230f56d82a&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2220ad83d7-7990-df07-957e-f7230f56d82a%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Newwork Content with a specific Moid'
WebUI.navigateToUrl('https://stats.ac1.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=90bb66f7-8ccb-40c0-8cc5-f3f4cc74cdb5&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2290bb66f7-8ccb-40c0-8cc5-f3f4cc74cdb5%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Newwork Content with a specific Moid'
WebUI.navigateToUrl('https://stats.ac1.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=26c3c7d0-36e3-4738-a1c0-4dd33e961df2&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2226c3c7d0-36e3-4738-a1c0-4dd33e961df2%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Newwork Content with a specific Moid'
WebUI.navigateToUrl('https://stats.ac1.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=7800d9e1-5b21-4eaf-971d-08a37ffd3eba&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%227800d9e1-5b21-4eaf-971d-08a37ffd3eba%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Newwork Summary with a specific Moid'
WebUI.navigateToUrl('https://stats.ac1.kontiki.com/dashboards/analytics_external::network_summary?time_filter=6%20months&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.navigateToUrl('https://stats.ac1.kontiki.com/dashboards/analytics_external::Overview?time_filter=6%20months&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Object Repository/Page_Overview/a'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Overview/a_Log Out'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Log in/div_Logout Successful.'), 0)

WebUI.verifyTextPresent('Logout Successful.', false)

WebUI.closeBrowser()

