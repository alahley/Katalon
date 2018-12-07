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
WebUI.openBrowser('https://stats.eu2.kontiki.com/login/email')

'Filling out login ino'
WebUI.setText(findTestObject('Page_Log in/input_email'), 'alahley@kollective.com')

'Filling out login ino'
WebUI.setEncryptedText(findTestObject('Page_Log in/input_password'), '5wulVsUVXnXznlrpFL+mjg==')

'Clicks the Stay Logged In button'
WebUI.click(findTestObject('Page_Log in/input_remember'))

'Clicks the Submit button to login'
WebUI.click(findTestObject('Page_Log in/input_login-submit'))

'Waits for the landing page to load'
WebUI.waitForAngularLoad(10)

'Network Summary\n'
WebUI.navigateToUrl('https://stats.eu2.kontiki.com/dashboards/analytics_external::network_summary?time_filter=6%20months&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(40)

'Network Content (no moid)\n'
WebUI.navigateToUrl('https://stats.eu2.kontiki.com/dashboards/analytics_external::network_content?moid_filter=None&time_filter=&filter_config=%7B%22moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22None%22%7D,%7B%7D%5D,%22id%22:4%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:5%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(20)

'Network Content (with moid)'
WebUI.navigateToUrl('https://stats.eu2.kontiki.com/dashboards/analytics_external::network_content?moid_filter=3d269089231e4280b89d076ee9a826eb&time_filter=&filter_config=%7B%22moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%223d269089231e4280b89d076ee9a826eb%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:1%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(20)

'Live Event Summary\n'
WebUI.navigateToUrl('https://stats.eu2.kontiki.com/dashboards/analytics_external::live_event_summary?time_filter=6%20months&event_filter=&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:4%7D%5D,%22event_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:5%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(20)

'Live Event (no moid)'
WebUI.navigateToUrl('https://stats.eu2.kontiki.com/dashboards/analytics_external::live_event?moid_filter=None&time_filter=&filter_config=%7B%22moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22None%22%7D,%7B%7D%5D,%22id%22:4%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:5%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(20)

'Live Event (with moid)'
WebUI.navigateToUrl('https://stats.eu2.kontiki.com/dashboards/analytics_external::live_event?moid_filter=06bd219622814f1eba1f807fea96ce28&time_filter=&filter_config=%7B%22moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2206bd219622814f1eba1f807fea96ce28%22%7D,%7B%7D%5D,%22id%22:4%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:5%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(20)

'Live (In Progress) Event (no moid)'
WebUI.navigateToUrl('https://stats.eu2.kontiki.com/dashboards/analytics_external::live_event_in_progress?moid_filter=None&time_filter=&filter_config=%7B%22moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22None%22%7D,%7B%7D%5D,%22id%22:4%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:5%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(20)

'Live (In Progress) Event (with moid)'
WebUI.navigateToUrl('https://stats.eu2.kontiki.com/dashboards/analytics_external::live_event_in_progress?moid_filter=06bd219622814f1eba1f807fea96ce28&time_filter=&filter_config=%7B%22moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2206bd219622814f1eba1f807fea96ce28%22%7D,%7B%7D%5D,%22id%22:4%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:5%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(20)

'Video on Demand Summary'
WebUI.navigateToUrl('https://stats.eu2.kontiki.com/dashboards/analytics_external::vod_summary?time_filter=6%20months&event_filter=&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:4%7D%5D,%22event_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:5%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(40)

'Video on Demand (no moid)'
WebUI.navigateToUrl('https://stats.eu2.kontiki.com/dashboards/analytics_external::vod_performance?moid_filter=None&time_filter=&filter_config=%7B%22moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22None%22%7D,%7B%7D%5D,%22id%22:4%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:5%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(40)

'Video on Demand (with moid)'
WebUI.navigateToUrl('https://stats.eu2.kontiki.com/dashboards/analytics_external::vod_performance?moid_filter=3d269089231e4280b89d076ee9a826eb&time_filter=&filter_config=%7B%22moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%223d269089231e4280b89d076ee9a826eb%22%7D,%7B%7D%5D,%22id%22:4%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:5%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(30)

