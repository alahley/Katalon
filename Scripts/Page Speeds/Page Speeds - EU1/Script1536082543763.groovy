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
WebUI.openBrowser('https://stats.eu1.kontiki.com/login/email')

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
WebUI.navigateToUrl('https://stats.eu1.kontiki.com/dashboards/analytics_external::network_summary?time_filter=6%20months&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(40)

'Network Content (no moid)\n'
WebUI.navigateToUrl('https://stats.eu1.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=None&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22None%22%7D,%7B%7D%5D,%22id%22:6%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:7%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:8%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(20)

'Network Content (with moid)'
WebUI.navigateToUrl('https://stats.eu1.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=b0c36903-c99f-4dc2-b76b-03519b8e6522&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22b0c36903-c99f-4dc2-b76b-03519b8e6522%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(20)

'Network locality\n'
WebUI.navigateToUrl('https://stats.eu1.kontiki.com/dashboards/analytics_external::network_locality?Last%20Delivery%20Time=6%20months&Last%20Report%20Time=&Locality=&External%20IP=&filter_config=%7B%22Last%20Delivery%20Time%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:8%7D%5D,%22Last%20Report%20Time%22:%5B%7B%22type%22:%22anytime%22,%22values%22:%5B%7B%7D,%7B%7D%5D,%22id%22:9%7D%5D,%22Locality%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:10%7D%5D,%22External%20IP%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:11%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(30)

'Live Event Summary\n'
WebUI.navigateToUrl('https://stats.eu1.kontiki.com/dashboards/analytics_external::live_event_summary?time_filter=6%20months&title_filter=&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:4%7D%5D,%22title_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:5%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(20)

'Live Event (no moid)'
WebUI.navigateToUrl('https://stats.eu1.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=None&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22None%22%7D,%7B%7D%5D,%22id%22:4%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:5%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(20)

'Live Event (with moid)'
WebUI.navigateToUrl('https://stats.eu1.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=ce939e16-a3b5-4515-a5b3-5da041bc7eb7&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22ce939e16-a3b5-4515-a5b3-5da041bc7eb7%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:1%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(20)

'Live (In Progress) Event (no moid)'
WebUI.navigateToUrl('https://stats.eu1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=None&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22None%22%7D,%7B%7D%5D,%22id%22:2%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:3%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(20)

'Live (In Progress) Event (with moid)'
WebUI.navigateToUrl('https://stats.eu1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=33702c22-87c2-48f8-93f0-4801469d073c&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2233702c22-87c2-48f8-93f0-4801469d073c%22%7D,%7B%7D%5D,%22id%22:2%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:3%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(20)

'Video on Demand Summary'
WebUI.navigateToUrl('https://stats.eu1.kontiki.com/dashboards/analytics_external::vod_summary?time_filter=6%20months&event_filter=&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:4%7D%5D,%22event_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:5%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(40)

'Video on Demand (no moid)'
WebUI.navigateToUrl('https://stats.eu1.kontiki.com/dashboards/analytics_external::vod_performance?content_moid_filter=None&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22None%22%7D,%7B%7D%5D,%22id%22:4%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:5%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(40)

'Video on Demand (with moid)'
WebUI.navigateToUrl('https://stats.eu1.kontiki.com/dashboards/analytics_external::vod_performance?content_moid_filter=a862795f-a656-46b1-a079-af4c101436d6&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22a862795f-a656-46b1-a079-af4c101436d6%22%7D,%7B%7D%5D,%22id%22:4%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:5%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(30)

'SCCM'
WebUI.navigateToUrl('https://stats.eu1.kontiki.com/dashboards/sccm_users::sccm_summary?time_filter=6%20months&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(30)

