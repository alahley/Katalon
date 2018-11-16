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
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=8aa69eab-6e2e-4d01-9a6a-c6940bd8221f&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%228aa69eab-6e2e-4d01-9a6a-c6940bd8221f%22%7D,%7B%7D%5D,%22id%22:6%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:7%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:8%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'ACTUAL LIVE EVENT Live In Progress Event\n'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=010d316d-a31a-4870-ab34-5ba6ccec3660&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22010d316d-a31a-4870-ab34-5ba6ccec3660%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=eb2ade5e-0996-4db2-8dbe-e8eaa9a08446&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22eb2ade5e-0996-4db2-8dbe-e8eaa9a08446%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=37a8da7c-3e99-45c7-a9a5-1551f41ef585&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2237a8da7c-3e99-45c7-a9a5-1551f41ef585%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event with no Moid, time filter in the past 5 minutes'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=&format_moid_filter=&time_filter=5%20minutes&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:6%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:7%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%225%22,%22unit%22:%22min%22%7D%5D,%22id%22:8%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'ACTUAL LIVE EVENT Live In Progress Event\n'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=010d316d-a31a-4870-ab34-5ba6ccec3660&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22010d316d-a31a-4870-ab34-5ba6ccec3660%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=cf62cb35-9260-4a50-94a8-48e8ef3552f5&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22cf62cb35-9260-4a50-94a8-48e8ef3552f5%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=26200d04-9835-4990-b894-fcdbaea38ea7&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2226200d04-9835-4990-b894-fcdbaea38ea7%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=8fe0b927-3c64-43ff-a770-6acf0832842d&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%228fe0b927-3c64-43ff-a770-6acf0832842d%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event with no Moid, time filter set to the past 15 minutes'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=&format_moid_filter=&time_filter=15%20minutes&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:6%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:7%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%2215%22,%22unit%22:%22min%22%7D%5D,%22id%22:8%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'ACTUAL LIVE EVENT Live In Progress Event\n'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=010d316d-a31a-4870-ab34-5ba6ccec3660&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22010d316d-a31a-4870-ab34-5ba6ccec3660%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=0fde3c93-ef36-488f-a0d1-42c032b95f7d&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%220fde3c93-ef36-488f-a0d1-42c032b95f7d%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=6527c65e-9fb5-4e17-ab2a-a171c4dd7f78&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%226527c65e-9fb5-4e17-ab2a-a171c4dd7f78%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=eb2ade5e-0996-4db2-8dbe-e8eaa9a08446&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22eb2ade5e-0996-4db2-8dbe-e8eaa9a08446%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event with no Moid, time filter set to the past 90 minutes'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=&format_moid_filter=&time_filter=90%20minutes&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:6%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:7%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%2290%22,%22unit%22:%22min%22%7D%5D,%22id%22:8%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=010d316d-a31a-4870-ab34-5ba6ccec3660&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22010d316d-a31a-4870-ab34-5ba6ccec3660%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=30ff8073-8aa8-4891-b168-c9505486ad00&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2230ff8073-8aa8-4891-b168-c9505486ad00%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=b615263b-4e74-4cf2-8f32-2710795d1a80&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22b615263b-4e74-4cf2-8f32-2710795d1a80%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/explore/analytics_external/play_wide?qid=aD8uEBxha5BvdIBE26P0eX&toggle=vis')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Explore Views/div_Toggle Dropdown'))

WebUI.click(findTestObject('Page_Explore Views/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event with no Moid, time filter set to the past week'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=&format_moid_filter=&time_filter=1%20weeks&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:6%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:7%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%221%22,%22unit%22:%22wk%22%7D%5D,%22id%22:8%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Newwork Content with a specific Moid'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=4ef8fd47-0259-431c-ad1e-eed1c383f388&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%224ef8fd47-0259-431c-ad1e-eed1c383f388%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Newwork Content with a specific Moid'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=35074cbe-8987-45f6-a532-c00727ccaec3&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2235074cbe-8987-45f6-a532-c00727ccaec3%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Newwork Content with a specific Moid'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=fb295da1-0e09-454e-8ab4-d679f3741c86&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22fb295da1-0e09-454e-8ab4-d679f3741c86%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Newwork Content with a specific Moid'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=fb295da1-0e09-454e-8ab4-d679f3741c86&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22fb295da1-0e09-454e-8ab4-d679f3741c86%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Newwork Content with a specific Moid'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=30ff8073-8aa8-4891-b168-c9505486ad00&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2230ff8073-8aa8-4891-b168-c9505486ad00%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Newwork Content with a specific Moid'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=b615263b-4e74-4cf2-8f32-2710795d1a80&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22b615263b-4e74-4cf2-8f32-2710795d1a80%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Newwork Content with a specific Moid'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=&format_moid_filter=&time_filter=7%20days&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%227%22,%22unit%22:%22day%22%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::Overview?time_filter=6%20months&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Object Repository/Page_Overview/a'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Overview/a_Log Out'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Log in/div_Logout Successful.'), 0)

WebUI.verifyTextPresent('Logout Successful.', false)

WebUI.closeBrowser()

