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
WebUI.setText(findTestObject('Object Repository/Page_Log in/input_email (2)'), 'alahley@kollective.com')

'Filling out login info (password)'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in/input_password (2)'), '5wulVsUVXnXznlrpFL+mjg==')

'Clicks the Stay Logged In button'
WebUI.click(findTestObject('Object Repository/Page_Log in/input_remember (2)'))

'Clicks the Submit button to login'
WebUI.click(findTestObject('Object Repository/Page_Log in/input_login-submit (2)'))

'Overview / Landing Page: 10 second Threshold: Waits for all angular elements on the landing page to load in 10 seconds or less\n'
WebUI.waitForAngularLoad(30)

WebUI.waitForPageLoad(0)

'Network Summary'
WebUI.navigateToUrl('https://stats.us2.kontiki.com/dashboards/analytics_external::network_summary?time_filter=6%20months&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

'Waits for all angular elements on the page to load and throws an expection after 60 seconds'
WebUI.waitForAngularLoad(60)

WebUI.waitForPageLoad(0)

'Network Content'
WebUI.navigateToUrl('https://stats.us2.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=de99dcf5-37bd-4ebe-b0b6-55efda151ab1&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22de99dcf5-37bd-4ebe-b0b6-55efda151ab1%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

'Waits for all angular elements on the page to load and throws an expection after 60 seconds'
WebUI.waitForAngularLoad(60)

WebUI.waitForPageLoad(0)

'Network Locality'
WebUI.navigateToUrl('https://stats.us2.kontiki.com/dashboards/analytics_external::network_locality?Locality=AL3%20%20Aloha%203&Last%20Delivery%20Time=6%20months&Last%20Report%20Time=&External%20IP=&filter_config=%7B%22Last%20Delivery%20Time%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22Last%20Report%20Time%22:%5B%7B%22type%22:%22anytime%22,%22values%22:%5B%7B%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22Locality%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22AL3%20%20Aloha%203%22%7D,%7B%7D%5D,%22id%22:2%7D%5D,%22External%20IP%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:3%7D%5D%7D')

'Waits for all angular elements on the page to load and throws an expection after 60 seconds'
WebUI.waitForAngularLoad(60)

WebUI.waitForPageLoad(0)

'Live Event Summary'
WebUI.navigateToUrl('https://stats.us2.kontiki.com/dashboards/analytics_external::live_event_summary?time_filter=6%20months&title_filter=&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:4%7D%5D,%22title_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:5%7D%5D%7D')

'Waits for all angular elements on the page to load and throws an expection after 60 seconds'
WebUI.waitForAngularLoad(60)

WebUI.waitForPageLoad(0)

'Live Event'
WebUI.navigateToUrl('https://stats.us2.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=00f15f0d-1a05-4ef9-afee-c09f11d900cb&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2200f15f0d-1a05-4ef9-afee-c09f11d900cb%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:1%7D%5D%7D')

'Waits for all angular elements on the page to load and throws an expection after 60 seconds'
WebUI.waitForAngularLoad(60)

WebUI.waitForPageLoad(0)

'Live (in progress) Event (filtered on last 2 weeks)'
WebUI.navigateToUrl('https://stats.us2.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=&time_filter=2%20weeks&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:4%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%222%22,%22unit%22:%22wk%22%7D%5D,%22id%22:5%7D%5D%7D')

'Waits for all angular elements on the page to load and throws an expection after 60 seconds'
WebUI.waitForAngularLoad(60)

WebUI.waitForPageLoad(0)

'VoD Summary'
WebUI.navigateToUrl('https://stats.us2.kontiki.com/dashboards/analytics_external::vod_summary?time_filter=6%20months&event_filter=&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:4%7D%5D,%22event_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:5%7D%5D%7D')

'Waits for all angular elements on the page to load and throws an expection after 60 seconds'
WebUI.waitForAngularLoad(60)

WebUI.waitForPageLoad(0)

'Video on Demand'
WebUI.navigateToUrl('https://stats.us2.kontiki.com/dashboards/analytics_external::vod_performance?content_moid_filter=f5c828c8-558a-405a-9c5f-911122c88d37&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22f5c828c8-558a-405a-9c5f-911122c88d37%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:1%7D%5D%7D')

'Waits for all angular elements on the page to load and throws an expection after 60 seconds'
WebUI.waitForAngularLoad(60)

WebUI.waitForPageLoad(0)

'SCCM'
WebUI.navigateToUrl('https://stats.us2.kontiki.com/dashboards/sccm_users::sccm_summary?time_filter=6%20months&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

'Waits for all angular elements on the page to load and throws an expection after 60 seconds'
WebUI.waitForAngularLoad(60)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Object Repository/Page_Overview/a'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Overview/a_Log Out'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Log in/div_Logout Successful.'), 0)

WebUI.verifyTextPresent('Logout Successful.', false)

WebUI.closeBrowser()

