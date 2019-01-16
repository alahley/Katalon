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

'Filling out login ino'
WebUI.setText(findTestObject('Page_Log in/input_email'), 'alahley@kollective.com')

'Filling out login ino'
WebUI.setEncryptedText(findTestObject('Page_Log in/input_password'), '5wulVsUVXnXznlrpFL+mjg==')

'Clicks the Stay Logged In button'
WebUI.click(findTestObject('Page_Log in/input_remember'))

'Clicks the Submit button to login'
WebUI.click(findTestObject('Page_Log in/input_login-submit'))

'Waits for the landing page to load'
WebUI.waitForAngularLoad(45)

WebUI.waitForPageLoad(0)

'Network Summary\n'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::network_summary?time_filter=6%20months&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:1%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(45)

WebUI.waitForPageLoad(0)

'Network Content (No Moids; Time Filter=is in the past 7 days)\n'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=&format_moid_filter=&time_filter=7%20days&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:6%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:7%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%227%22,%22unit%22:%22day%22%7D%5D,%22id%22:8%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(45)

WebUI.waitForPageLoad(0)

'Network Content (with moid)'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=43d8a1bc-2c4b-4615-9b2a-ea5e095145c3&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2243d8a1bc-2c4b-4615-9b2a-ea5e095145c3%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(45)

WebUI.waitForPageLoad(0)

'Network locality\n'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::network_locality?Last%20Delivery%20Time=6%20months&Last%20Report%20Time=&Locality=&External%20IP=&filter_config=%7B%22Last%20Delivery%20Time%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:8%7D%5D,%22Last%20Report%20Time%22:%5B%7B%22type%22:%22anytime%22,%22values%22:%5B%7B%7D,%7B%7D%5D,%22id%22:9%7D%5D,%22Locality%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:10%7D%5D,%22External%20IP%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:11%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(45)

WebUI.waitForPageLoad(0)

'Live Event Summary\n'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::live_event_summary?time_filter=6%20months&title_filter=&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:4%7D%5D,%22title_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:5%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(45)

WebUI.waitForPageLoad(0)

'Live Event (No Moids; Time Filter=is in the past 7 days)'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=&format_moid_filter=&time_filter=7%20days&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:9%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:10%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%227%22,%22unit%22:%22day%22%7D%5D,%22id%22:11%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(45)

WebUI.waitForPageLoad(0)

'Live Event (with moid)'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=8db4f5ae-a030-43dd-9bdc-f7c1780c88ad&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%228db4f5ae-a030-43dd-9bdc-f7c1780c88ad%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(45)

WebUI.waitForPageLoad(0)

'Live (In Progress) Event (No Moids; Time Filter=is in the past 7 days)'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=&format_moid_filter=&time_filter=7%20days&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%227%22,%22unit%22:%22day%22%7D%5D,%22id%22:2%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(45)

WebUI.waitForPageLoad(0)

'Live (In Progress) Event (with moid)'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=dd84eebc-298b-4b89-81d4-9e875bb8a8e7&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22dd84eebc-298b-4b89-81d4-9e875bb8a8e7%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(45)

WebUI.waitForPageLoad(0)

'Video on Demand Summary'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::vod_summary?time_filter=6%20months&event_filter=&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:4%7D%5D,%22event_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:5%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(45)

WebUI.waitForPageLoad(0)

'Video on Demand (No Moids; Time Filter=is in the past 7 days)'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::vod_performance?content_moid_filter=&time_filter=7%20days&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%227%22,%22unit%22:%22day%22%7D%5D,%22id%22:1%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(45)

WebUI.waitForPageLoad(0)

'Video on Demand (with moid)'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::vod_performance?content_moid_filter=cfddf926-b4d7-4204-8972-dc08f09ee21b&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22cfddf926-b4d7-4204-8972-dc08f09ee21b%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:1%7D%5D%7D')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(45)

WebUI.waitForPageLoad(0)

'SCCM'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/sccm_users::sccm_summary')

'Waits for the landing page to load'
WebUI.waitForAngularLoad(45)

WebUI.waitForPageLoad(0)

'Event Analyzer (with moid)'
not_run: WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/sccm_users::sccm_summary')

'Waits for the landing page to load'
not_run: WebUI.waitForAngularLoad(45)

not_run: WebUI.waitForPageLoad(0)

