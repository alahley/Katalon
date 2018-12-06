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
WebUI.navigateToUrl('https://stats.wg1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=5debf217-1796-4065-83ec-b5286a0458fc&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%225debf217-1796-4065-83ec-b5286a0458fc%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/div_Toggle Dropdown'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'ACTUAL LIVE EVENT Live In Progress Event\n'
WebUI.navigateToUrl('https://stats.wg1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=45ba98a5-e00c-487f-b67b-985bdd27292c&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2245ba98a5-e00c-487f-b67b-985bdd27292c%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.waitForAngularLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/div_Toggle Dropdown'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.wg1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=8afcad7a-95f5-4abc-86d9-7321ac5c2a13&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%228afcad7a-95f5-4abc-86d9-7321ac5c2a13%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.waitForAngularLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/div_Toggle Dropdown'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.wg1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=7e13cf20-b064-46b8-84aa-e10a8298e41a&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%227e13cf20-b064-46b8-84aa-e10a8298e41a%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/div_Toggle Dropdown'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event with no Moid, time filter in the past 5 minutes'
WebUI.navigateToUrl('https://stats.wg1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=0b09f9ae-d561-4f32-acb9-52d88e028b9b&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%220b09f9ae-d561-4f32-acb9-52d88e028b9b%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/div_Toggle Dropdown'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'ACTUAL LIVE EVENT Live In Progress Event\n'
WebUI.navigateToUrl('https://stats.wg1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=441532d2-28da-4dfc-a0e7-6597c807cfe8&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22441532d2-28da-4dfc-a0e7-6597c807cfe8%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/div_Toggle Dropdown'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.wg1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=441497e9-0b48-4de5-97a8-3a5eabf0ab85&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22441497e9-0b48-4de5-97a8-3a5eabf0ab85%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.wg1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=028ac932-3cd5-4568-9aa9-ab2a7cb6d3ce&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22028ac932-3cd5-4568-9aa9-ab2a7cb6d3ce%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.wg1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=56e7f87d-ed91-46c9-b179-95e985e09e80&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2256e7f87d-ed91-46c9-b179-95e985e09e80%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event with no Moid, time filter set to the past 15 minutes'
WebUI.navigateToUrl('https://stats.wg1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=56e7f87d-ed91-46c9-b179-95e985e09e80&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2256e7f87d-ed91-46c9-b179-95e985e09e80%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'ACTUAL LIVE EVENT Live In Progress Event\n'
WebUI.navigateToUrl('https://stats.wg1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=e7c3c047-1b67-409c-954b-898f918b38b0&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22e7c3c047-1b67-409c-954b-898f918b38b0%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.wg1.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=cfabddc4-3e7d-42fa-9f5f-8d1bdd3b7446&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22cfabddc4-3e7d-42fa-9f5f-8d1bdd3b7446%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.wg1.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=441497e9-0b48-4de5-97a8-3a5eabf0ab85&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22441497e9-0b48-4de5-97a8-3a5eabf0ab85%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.wg1.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=441532d2-28da-4dfc-a0e7-6597c807cfe8&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22441532d2-28da-4dfc-a0e7-6597c807cfe8%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event with no Moid, time filter set to the past 90 minutes'
WebUI.navigateToUrl('https://stats.wg1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=&format_moid_filter=&time_filter=2%20weeks&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:6%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:7%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%222%22,%22unit%22:%22wk%22%7D%5D,%22id%22:8%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Agent Details'
WebUI.navigateToUrl('https://stats.wg1.kontiki.com/dashboards/analytics_external::agent?Short%20Node%20ID=x%2BYFV%2FVQdXBOZXYu&Delivery%20Time=&Delivery%20Type=&filter_config=%7B%22Short%20Node%20ID%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22x%2BYFV%2FVQdXBOZXYu%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22Delivery%20Time%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22Delivery%20Type%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Network Content'
WebUI.navigateToUrl('https://stats.wg1.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=47932446-861a-45ab-8ab1-fe041103e99e&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2247932446-861a-45ab-8ab1-fe041103e99e%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Network Content\n'
WebUI.navigateToUrl('https://stats.wg1.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=e90792ed-e50c-4a4e-b6a6-02cc1271e85f&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22e90792ed-e50c-4a4e-b6a6-02cc1271e85f%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.wg1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=0b09f9ae-d561-4f32-acb9-52d88e028b9b')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Explore Views/div_Toggle Dropdown'))

WebUI.click(findTestObject('Page_Explore Views/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event with no Moid, time filter set to the past week'
WebUI.navigateToUrl('https://stats.wg1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=&format_moid_filter=&time_filter=1%20weeks&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%221%22,%22unit%22:%22wk%22%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/div_Toggle Dropdown'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Newwork Content with a specific Moid'
WebUI.navigateToUrl('https://stats.wg1.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=e90792ed-e50c-4a4e-b6a6-02cc1271e85f&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22e90792ed-e50c-4a4e-b6a6-02cc1271e85f%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Newwork Content with a specific Moid'
WebUI.navigateToUrl('https://stats.wg1.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=6cd9b4af-3436-40ae-b800-c26a1ea8164d&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%226cd9b4af-3436-40ae-b800-c26a1ea8164d%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Newwork Content with a specific Moid'
WebUI.navigateToUrl('https://stats.wg1.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=7b3e653d-ec85-4aea-807f-f8d1c6633438&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%227b3e653d-ec85-4aea-807f-f8d1c6633438%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Network Summary'
WebUI.navigateToUrl('https://stats.wg1.kontiki.com/dashboards/analytics_external::network_summary?time_filter=6%20months&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Newwork Content with a specific Moid'
WebUI.navigateToUrl('https://stats.wg1.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=44a87b37-c012-4eb8-8a20-d3282cbe142f&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2244a87b37-c012-4eb8-8a20-d3282cbe142f%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Newwork Locality with a specific Moid'
WebUI.navigateToUrl('https://stats.wg1.kontiki.com/dashboards/analytics_external::network_locality?Locality=Aberdeen&Last%20Delivery%20Time=6%20months&Last%20Report%20Time=&External%20IP=&filter_config=%7B%22Last%20Delivery%20Time%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22Last%20Report%20Time%22:%5B%7B%22type%22:%22anytime%22,%22values%22:%5B%7B%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22Locality%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22Aberdeen%22%7D,%7B%7D%5D,%22id%22:2%7D%5D,%22External%20IP%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:3%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/div_Toggle Dropdown'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Newwork Summary with a specific Moid'
WebUI.navigateToUrl('https://stats.wg1.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=0bad54cc-c7f4-4cd7-ae29-eb5708f52c3c&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%220bad54cc-c7f4-4cd7-ae29-eb5708f52c3c%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/div_Toggle Dropdown'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.navigateToUrl('https://stats.wg1.kontiki.com/dashboards/analytics_external::Overview?time_filter=6%20months&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Object Repository/Page_Overview/a'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Overview/a_Log Out'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Log in/div_Logout Successful.'), 0)

WebUI.verifyTextPresent('Logout Successful.', false)

WebUI.closeBrowser()

