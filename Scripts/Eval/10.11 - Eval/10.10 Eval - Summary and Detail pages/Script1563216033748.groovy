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
WebUI.openBrowser('https://stats.eval.kontiki.com/login/email')

'Filling out login info (username)'
WebUI.setText(findTestObject('Object Repository/Page_Log in/input_email (2)'), 'alahley@kollective.com')

'Filling out login info (password)'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in/input_password (2)'), '5wulVsUVXnXznlrpFL+mjg==')

'Clicks the Stay Logged In button'
WebUI.click(findTestObject('Object Repository/Page_Log in/input_remember (2)'))

'Clicks the Submit button to login'
WebUI.click(findTestObject('Object Repository/Page_Log in/input_login-submit (2)'))

'Waits for all angular elements on the page to load in 60 seconds or less\n'
WebUI.waitForAngularLoad(60)

WebUI.waitForPageLoad(0)

'Network Summary'
WebUI.navigateToUrl('https://stats.eval.kontiki.com/dashboards/analytics_external::network_summary?time_filter=6%20months&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:1%7D%5D%7D')

'Waits for all angular elements on the page to load in 60 seconds or less\n'
WebUI.waitForAngularLoad(60)

WebUI.waitForPageLoad(0)

'Network Content'
WebUI.navigateToUrl('https://stats.eval.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=f1baef84-b596-4931-bf4d-412956c0e805&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22f1baef84-b596-4931-bf4d-412956c0e805%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

'Waits for all angular elements on the page to load in 60 seconds or less\n'
WebUI.waitForAngularLoad(60)

WebUI.waitForPageLoad(0)

'Network Locality'
WebUI.navigateToUrl('https://stats.eval.kontiki.com/dashboards/analytics_external::network_locality?Last%20Delivery%20Time=6%20months&Last%20Report%20Time=&Locality=&External%20IP=&filter_config=%7B%22Last%20Delivery%20Time%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:8%7D%5D,%22Last%20Report%20Time%22:%5B%7B%22type%22:%22anytime%22,%22values%22:%5B%7B%7D,%7B%7D%5D,%22id%22:9%7D%5D,%22Locality%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:10%7D%5D,%22External%20IP%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:11%7D%5D%7D')

'Waits for all angular elements on the page to load in 60 seconds or less\n'
WebUI.waitForAngularLoad(60)

WebUI.waitForPageLoad(0)

'Live Event Summary'
WebUI.navigateToUrl('https://stats.eval.kontiki.com/dashboards/analytics_external::live_event_summary?time_filter=6%20months&title_filter=&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:4%7D%5D,%22title_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:5%7D%5D%7D')

'Waits for all angular elements on the page to load in 60 seconds or less\n'
WebUI.waitForAngularLoad(60)

WebUI.waitForPageLoad(0)

'Live Event'
WebUI.navigateToUrl('https://stats.eval.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=3725f032-f9cf-4df4-96ed-674be4ab0938&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%223725f032-f9cf-4df4-96ed-674be4ab0938%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

'90 second Threshold: Waits for all angular elements on the landing page to load in 10 seconds or less\n'
WebUI.waitForAngularLoad(90)

WebUI.waitForPageLoad(0)

'Live (in progress) Event (filtered on last 2 weeks)'
WebUI.navigateToUrl('https://stats.eval.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=&format_moid_filter=&time_filter=2%20weeks&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:6%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:7%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%222%22,%22unit%22:%22wk%22%7D%5D,%22id%22:8%7D%5D%7D')

'Waits for all angular elements on the page to load in 60 seconds or less\n'
WebUI.waitForAngularLoad(60)

WebUI.waitForPageLoad(0)

'VoD Summary'
WebUI.navigateToUrl('https://stats.eval.kontiki.com/dashboards/analytics_external::vod_summary?time_filter=6%20months&event_filter=&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:4%7D%5D,%22event_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:5%7D%5D%7D')

'Waits for all angular elements on the page to load in 60 seconds or less\n'
WebUI.waitForAngularLoad(60)

WebUI.waitForPageLoad(0)

'Ensure that "No Results" does not appear anywhere on the page.  This can happen on certain widgets but should NEVER happen in the table data.'
WebUI.verifyTextNotPresent('No Results', false)

'Navigate to a VoD Content page to ensure "No Results" does not appear in the table data'
WebUI.navigateToUrl('https://stats.eval.kontiki.com/dashboards/analytics_external::vod_performance?content_moid_filter=18110261-0fdc-40c1-8996-5c30d7f4c2a6&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2218110261-0fdc-40c1-8996-5c30d7f4c2a6%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:1%7D%5D%7D')

'Waits for all angular elements on the page to load in 60 seconds or less\n'
WebUI.waitForAngularLoad(60)

WebUI.waitForPageLoad(0)

'Ensure that "No Results" does not appear anywhere on the page.  This can happen on certain widgets but should NEVER happen in the table data.'
WebUI.verifyTextNotPresent('No Results', false)

'Video on Demand'
WebUI.navigateToUrl('https://stats.eval.kontiki.com/dashboards/analytics_external::vod_performance?content_moid_filter=c3605b39-9d22-4413-8718-98abacc81044&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22c3605b39-9d22-4413-8718-98abacc81044%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:1%7D%5D%7D')

'Waits for all angular elements on the page to load in 60 seconds or less\n'
WebUI.waitForAngularLoad(90)

WebUI.waitForPageLoad(0)

'SCCM'
WebUI.navigateToUrl('https://stats.eval.kontiki.com/dashboards/sccm_users::sccm_summary?time_filter=6%20months&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

'Waits for all angular elements on the page to load in 60 seconds or less\n'
WebUI.waitForAngularLoad(60)

WebUI.waitForPageLoad(0)

WebUI.navigateToUrl('https://stats.eval.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=&format_moid_filter=&time_filter=2%20weeks&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%222%22,%22unit%22:%22wk%22%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.waitForAngularLoad(0)

WebUI.verifyElementNotVisible(findTestObject('Page_Live Event/div_No Results'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Overview/a'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_SCCM Summary/a_Log Out'), FailureHandling.CONTINUE_ON_FAILURE)

'10 second Threshold: Waits for all angular elements on the landing page to load in 10 seconds or less\n'
WebUI.waitForAngularLoad(20)

WebUI.waitForPageLoad(0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Log in/div_Logout Successful.'), 0)

WebUI.verifyTextPresent('Logout Successful.', false)

WebUI.closeBrowser()

