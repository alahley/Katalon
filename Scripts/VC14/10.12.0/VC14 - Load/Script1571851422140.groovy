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
WebUI.openBrowser('https://vc14-970.corp.kontiki.com/login/email')

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
WebUI.navigateToUrl('https://vc14-970.corp.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=3ffd314b-fd49-fdfd-fd69-fd0a7b1a0000&start_time_filter=6%20months&end_time_filter=&type_filter=Live&play_duration_sec_filter=%3E0&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%223ffd314b-fd49-fdfd-fd69-fd0a7b1a0000%22%7D,%7B%7D%5D,%22id%22:10%7D%5D,%22start_time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:11%7D%5D,%22end_time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:12%7D%5D,%22type_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22Live%22%7D,%7B%7D%5D,%22id%22:13%7D%5D,%22play_duration_sec_filter%22:%5B%7B%22type%22:%22%3E%22,%22values%22:%5B%7B%22constant%22:%220%22%7D,%7B%7D%5D,%22id%22:14%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/div_Toggle Dropdown'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'ACTUAL LIVE EVENT Live In Progress Event\n'
WebUI.navigateToUrl('https://vc14-970.corp.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=71fd0515-5afd-400c-fdfd-3b4d5a0f5100&start_time_filter=6%20months&end_time_filter=&type_filter=Live&play_duration_sec_filter=%3E0&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2271fd0515-5afd-400c-fdfd-3b4d5a0f5100%22%7D,%7B%7D%5D,%22id%22:10%7D%5D,%22start_time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:11%7D%5D,%22end_time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:12%7D%5D,%22type_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22Live%22%7D,%7B%7D%5D,%22id%22:13%7D%5D,%22play_duration_sec_filter%22:%5B%7B%22type%22:%22%3E%22,%22values%22:%5B%7B%22constant%22:%220%22%7D,%7B%7D%5D,%22id%22:14%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.waitForAngularLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/div_Toggle Dropdown'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://vc14-970.corp.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=3ffd314b-fd49-fdfd-fd69-fd0a7b1a0000&start_time_filter=&query_timezone=null&end_time_filter=&type_filter=Live&play_duration_sec_filter=%3E0&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%223ffd314b-fd49-fdfd-fd69-fd0a7b1a0000%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22start_time_filter%22:%5B%7B%22type%22:%22anytime%22,%22values%22:%5B%7B%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22end_time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D,%22type_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22Live%22%7D,%7B%7D%5D,%22id%22:3%7D%5D,%22play_duration_sec_filter%22:%5B%7B%22type%22:%22%3E%22,%22values%22:%5B%7B%22constant%22:%220%22%7D,%7B%7D%5D,%22id%22:4%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.waitForAngularLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/div_Toggle Dropdown'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live Event Summary (6 Quarters)'
WebUI.navigateToUrl('https://vc14-970.corp.kontiki.com/dashboards/analytics_external::live_event_summary?time_filter=6%20quarters&title_filter=&type_filter=Live&play_duration_sec_filter=%3E0&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22qu%22%7D,%7B%7D%5D,%22id%22:8%7D%5D,%22title_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:9%7D%5D,%22type_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22Live%22%7D,%7B%7D%5D,%22id%22:10%7D%5D,%22play_duration_sec_filter%22:%5B%7B%22type%22:%22%3E%22,%22values%22:%5B%7B%22constant%22:%220%22%7D,%7B%7D%5D,%22id%22:11%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/div_Toggle Dropdown'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event with no Moid, time filter in the past 5 quarters\n'
WebUI.navigateToUrl('https://vc14-970.corp.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=&start_time_filter=5%20quarters&end_time_filter=&type_filter=Live&play_duration_sec_filter=%3E0&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:10%7D%5D,%22start_time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%225%22,%22unit%22:%22qu%22%7D,%7B%7D%5D,%22id%22:11%7D%5D,%22end_time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:12%7D%5D,%22type_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22Live%22%7D,%7B%7D%5D,%22id%22:13%7D%5D,%22play_duration_sec_filter%22:%5B%7B%22type%22:%22%3E%22,%22values%22:%5B%7B%22constant%22:%220%22%7D,%7B%7D%5D,%22id%22:14%7D%5D%7D')

not_run: WebUI.waitForAngularLoad(0)

not_run: WebUI.waitForPageLoad(0)

not_run: WebUI.click(findTestObject('Page_Live (In Progress) Event/div_Toggle Dropdown'))

not_run: WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

not_run: WebUI.waitForAngularLoad(0)

not_run: WebUI.waitForPageLoad(0)

'ACTUAL LIVE EVENT Live In Progress Event\n'
WebUI.navigateToUrl('https://vc14-970.corp.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=3725f032-f9cf-4df4-96ed-674be4ab0938&start_time_filter=60%20months&end_time_filter=&type_filter=Live&play_duration_sec_filter=%3E0&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%223725f032-f9cf-4df4-96ed-674be4ab0938%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22start_time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%2260%22,%22unit%22:%22mo%22%7D%5D,%22id%22:1%7D%5D,%22end_time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D,%22type_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22Live%22%7D,%7B%7D%5D,%22id%22:3%7D%5D,%22play_duration_sec_filter%22:%5B%7B%22type%22:%22%3E%22,%22values%22:%5B%7B%22constant%22:%220%22%7D,%7B%7D%5D,%22id%22:4%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

not_run: WebUI.click(findTestObject('Page_Live (In Progress) Event/div_Toggle Dropdown'))

not_run: WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://vc14-970.corp.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=79aea142-3505-4110-83bb-17f2b6eb60a0&start_time_filter=3%20years&end_time_filter=&type_filter=Live&play_duration_sec_filter=%3E0&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2279aea142-3505-4110-83bb-17f2b6eb60a0%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22start_time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%223%22,%22unit%22:%22yr%22%7D%5D,%22id%22:1%7D%5D,%22end_time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D,%22type_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22Live%22%7D,%7B%7D%5D,%22id%22:3%7D%5D,%22play_duration_sec_filter%22:%5B%7B%22type%22:%22%3E%22,%22values%22:%5B%7B%22constant%22:%220%22%7D,%7B%7D%5D,%22id%22:4%7D%5D%7D')

WebUI.waitForAngularLoad(55)

WebUI.waitForPageLoad(55)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(55)

WebUI.waitForPageLoad(55)

'Live In Progress Event'
WebUI.navigateToUrl('https://vc14-970.corp.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=7c88f7a6-0f61-4b34-929d-1c80f6462e14&start_time_filter=9%20quarters&end_time_filter=&type_filter=Live&play_duration_sec_filter=%3E0&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%227c88f7a6-0f61-4b34-929d-1c80f6462e14%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22start_time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%229%22,%22unit%22:%22qu%22%7D%5D,%22id%22:1%7D%5D,%22end_time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D,%22type_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22Live%22%7D,%7B%7D%5D,%22id%22:3%7D%5D,%22play_duration_sec_filter%22:%5B%7B%22type%22:%22%3E%22,%22values%22:%5B%7B%22constant%22:%220%22%7D,%7B%7D%5D,%22id%22:4%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://vc14-970.corp.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=4003ea3f-f992-16f9-b7a6-e387b2bfb025&start_time_filter=9%20quarters&end_time_filter=&type_filter=Live&play_duration_sec_filter=%3E0&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%224003ea3f-f992-16f9-b7a6-e387b2bfb025%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22start_time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%229%22,%22unit%22:%22qu%22%7D%5D,%22id%22:1%7D%5D,%22end_time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D,%22type_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22Live%22%7D,%7B%7D%5D,%22id%22:3%7D%5D,%22play_duration_sec_filter%22:%5B%7B%22type%22:%22%3E%22,%22values%22:%5B%7B%22constant%22:%220%22%7D,%7B%7D%5D,%22id%22:4%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event with no Moid, time filter set to the past 15 minutes'
WebUI.navigateToUrl('https://vc14-970.corp.kontiki.com/dashboards/analytics_external::vod_performance?content_moid_filter=fdfd67fd-4efd-435e-fdfd-fd757f7ffd58&start_time_filter=6%20months&type_filter=VoD&play_duration_sec_filter=%3E0&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22fdfd67fd-4efd-435e-fdfd-fd757f7ffd58%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22start_time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22type_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22VoD%22%7D,%7B%7D%5D,%22id%22:2%7D%5D,%22play_duration_sec_filter%22:%5B%7B%22type%22:%22%3E%22,%22values%22:%5B%7B%22constant%22:%220%22%7D,%7B%7D%5D,%22id%22:3%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'ACTUAL LIVE EVENT Live In Progress Event\n'
WebUI.navigateToUrl('https://vc14-970.corp.kontiki.com/dashboards/analytics_external::vod_performance?content_moid_filter=463d2904-19ad-4833-9193-841020684209&start_time_filter=6%20months&type_filter=VoD&play_duration_sec_filter=%3E0&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22463d2904-19ad-4833-9193-841020684209%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22start_time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22type_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22VoD%22%7D,%7B%7D%5D,%22id%22:2%7D%5D,%22play_duration_sec_filter%22:%5B%7B%22type%22:%22%3E%22,%22values%22:%5B%7B%22constant%22:%220%22%7D,%7B%7D%5D,%22id%22:3%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://vc14-970.corp.kontiki.com/dashboards/analytics_external::vod_performance?content_moid_filter=463d2904-19fd-4833-fdfd-fd1020684209&start_time_filter=6%20months&type_filter=VoD&play_duration_sec_filter=%3E0&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22463d2904-19fd-4833-fdfd-fd1020684209%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22start_time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22type_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22VoD%22%7D,%7B%7D%5D,%22id%22:2%7D%5D,%22play_duration_sec_filter%22:%5B%7B%22type%22:%22%3E%22,%22values%22:%5B%7B%22constant%22:%220%22%7D,%7B%7D%5D,%22id%22:3%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Explore'
WebUI.navigateToUrl('https://vc14-970.corp.kontiki.com/explore/analytics_pro/play_wide?qid=ugW3uN5HNuMkiJrBcSNQng&toggle=fil,vis')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

not_run: WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

not_run: WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

not_run: WebUI.waitForAngularLoad(0)

not_run: WebUI.waitForPageLoad(0)

'Explore'
WebUI.navigateToUrl('https://vc14-970.corp.kontiki.com/explore/analytics_pro/delivery_wide?qid=MwkZ1ltW6Ni4T6FEVXJfuv&toggle=vis')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

not_run: WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

not_run: WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Config Mgr Summary - 6 Quarters\n'
WebUI.navigateToUrl('https://vc14-970.corp.kontiki.com/dashboards/analytics_external::config_mgr?start_time_filter=6%20quarters&filter_config=%7B%22start_time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22qu%22%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Event Analyzer'
WebUI.navigateToUrl('https://vc14-970.corp.kontiki.com/dashboards/analytics_external::event_analyzer?content_moid_filter=3ffd314b-fd49-fdfd-fd69-fd0a7b1a0000&start_time_filter=6%20months&end_time_filter=&format_moid_filter=&internal_ip_filter=&external_ip_filter=&subnet_mask_filter=&locality_filter=&play_duration_sec_filter=%3E0&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%223ffd314b-fd49-fdfd-fd69-fd0a7b1a0000%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22start_time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:2%7D%5D,%22end_time_filter%22:%5B%7B%22type%22:%22anytime%22,%22values%22:%5B%7B%7D,%7B%7D%5D,%22id%22:3%7D%5D,%22internal_ip_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:4%7D%5D,%22external_ip_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:5%7D%5D,%22subnet_mask_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:6%7D%5D,%22locality_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:7%7D%5D,%22play_duration_sec_filter%22:%5B%7B%22type%22:%22%3E%22,%22values%22:%5B%7B%22constant%22:%220%22%7D,%7B%7D%5D,%22id%22:8%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Geo Explorer\n'
WebUI.navigateToUrl('https://vc14-970.corp.kontiki.com/dashboards/analytics_external::geo_explorer?content_moid_filter=fd5452fd-61fd-4210-fdfd-fd491f75fd00&start_time_filter=6%20months&Browser=&Buffer%20Count=&Buffer%20Time%20(ms)=&os_ver=&OS=&Format%20Moid%20Filter=&Peering%20Percent=&play_duration_sec_filter=>0&filter_config=%7B"Browser":%5B%7B"type":"%3D","values":%5B%7B"constant":""%7D,%7B%7D%5D,"id":0%7D%5D,"Buffer%20Count":%5B%7B"type":"%3D","values":%5B%7B"constant":""%7D,%7B%7D%5D,"id":1%7D%5D,"Buffer%20Time%20(ms)":%5B%7B"type":"%3D","values":%5B%7B"constant":""%7D,%7B%7D%5D,"id":2%7D%5D,"content_moid_filter":%5B%7B"type":"%3D","values":%5B%7B"constant":"fd5452fd-61fd-4210-fdfd-fd491f75fd00"%7D,%7B%7D%5D,"id":3%7D%5D,"os_ver":%5B%7B"type":"%3D","values":%5B%7B"constant":""%7D,%7B%7D%5D,"id":4%7D%5D,"OS":%5B%7B"type":"%3D","values":%5B%7B"constant":""%7D,%7B%7D%5D,"id":5%7D%5D,"Format%20Moid%20Filter":%5B%7B"type":"%3D","values":%5B%7B"constant":""%7D,%7B%7D%5D,"id":6%7D%5D,"Peering%20Percent":%5B%7B"type":"%3D","values":%5B%7B"constant":""%7D,%7B%7D%5D,"id":7%7D%5D,"start_time_filter":%5B%7B"type":"past","values":%5B%7B"constant":"6","unit":"mo"%7D,%7B%7D%5D,"id":8%7D%5D,"play_duration_sec_filter":%5B%7B"type":">","values":%5B%7B"constant":"0"%7D,%7B%7D%5D,"id":9%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Explore\n'
WebUI.navigateToUrl('https://vc14-970.corp.kontiki.com/explore/analytics_pro/play_wide?qid=FI9mHnja42AUQxqOC0vN6j')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

not_run: WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

not_run: WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

not_run: WebUI.waitForAngularLoad(0)

not_run: WebUI.waitForPageLoad(0)

'Network Summary\n'
WebUI.navigateToUrl('https://vc14-970.corp.kontiki.com/dashboards/analytics_external::network_summary?time_filter=6%20months&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Explore Views/div_Toggle Dropdown'))

WebUI.click(findTestObject('Page_Explore Views/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Network Content'
WebUI.navigateToUrl('https://vc14-970.corp.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=fdcafd76-3f41-61fd-fd5a-fd41fdfdfd00&start_time_filter=6%20months&locality_filter=&external_ip_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22fdcafd76-3f41-61fd-fd5a-fd41fdfdfd00%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22start_time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22locality_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:2%7D%5D,%22external_ip_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:3%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/div_Toggle Dropdown'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Explore'
WebUI.navigateToUrl('https://vc14-970.corp.kontiki.com/explore/analytics_pro/delivery_wide?qid=dJhsNfKJ7rO6dpiGG7hB6h')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

not_run: WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

not_run: WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

not_run: WebUI.waitForAngularLoad(0)

not_run: WebUI.waitForPageLoad(0)

'Event Analyzer\n'
WebUI.navigateToUrl('https://vc14-970.corp.kontiki.com/dashboards/analytics_external::event_analyzer?content_moid_filter=fdcafd76-3f41-61fd-fd5a-fd41fdfdfd00&start_time_filter=6%20months&end_time_filter=&format_moid_filter=&internal_ip_filter=&external_ip_filter=&subnet_mask_filter=&locality_filter=&play_duration_sec_filter=%3E0&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22fdcafd76-3f41-61fd-fd5a-fd41fdfdfd00%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22start_time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:2%7D%5D,%22end_time_filter%22:%5B%7B%22type%22:%22anytime%22,%22values%22:%5B%7B%7D,%7B%7D%5D,%22id%22:3%7D%5D,%22internal_ip_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:4%7D%5D,%22external_ip_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:5%7D%5D,%22subnet_mask_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:6%7D%5D,%22locality_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:7%7D%5D,%22play_duration_sec_filter%22:%5B%7B%22type%22:%22%3E%22,%22values%22:%5B%7B%22constant%22:%220%22%7D,%7B%7D%5D,%22id%22:8%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Explore\n'
WebUI.navigateToUrl('https://vc14-970.corp.kontiki.com/explore/analytics_pro/agent_deliveries?qid=nHn0Ug0YztlTzafWinKn7Q&toggle=vis')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

not_run: WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

not_run: WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

not_run: WebUI.waitForAngularLoad(0)

not_run: WebUI.waitForPageLoad(0)

'Explore with many filters and dimensions'
WebUI.navigateToUrl('https://vc14-970.corp.kontiki.com/explore/analytics_pro/delivery_wide?toggle=fil&qid=TwS7l3GZKT9SIhSUBTPUXb')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

not_run: WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

not_run: WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

not_run: WebUI.waitForAngularLoad(0)

not_run: WebUI.waitForPageLoad(0)

'Explore with filters on a Moid'
WebUI.navigateToUrl('https://vc14-970.corp.kontiki.com/explore/analytics_pro/delivery_wide?toggle=fil&qid=GveteWkQjEC9VzBSNgDsvK')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

not_run: WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

not_run: WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

not_run: WebUI.waitForAngularLoad(0)

not_run: WebUI.waitForPageLoad(0)

WebUI.navigateToUrl('https://vc14-970.corp.kontiki.com/dashboards/analytics_external::network_locality?locality_filter=None&start_time_filter=6%20months&report_time_filter=&external_ip_filter=&filter_config=%7B%22start_time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22report_time_filter%22:%5B%7B%22type%22:%22anytime%22,%22values%22:%5B%7B%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22locality_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22None%22%7D,%7B%7D%5D,%22id%22:2%7D%5D,%22external_ip_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:3%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/div_Toggle Dropdown'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.navigateToUrl('https://vc14-970.corp.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=&start_time_filter=6%20days&end_time_filter=&type_filter=Live&play_duration_sec_filter=%3E0&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:10%7D%5D,%22start_time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22day%22%7D,%7B%7D%5D,%22id%22:11%7D%5D,%22end_time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:12%7D%5D,%22type_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22Live%22%7D,%7B%7D%5D,%22id%22:13%7D%5D,%22play_duration_sec_filter%22:%5B%7B%22type%22:%22%3E%22,%22values%22:%5B%7B%22constant%22:%220%22%7D,%7B%7D%5D,%22id%22:14%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/div_Toggle Dropdown'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'In Progress Event - in the past 6 weeks'
WebUI.navigateToUrl('https://vc14-970.corp.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=&start_time_filter=6%20weeks&end_time_filter=&type_filter=Live&play_duration_sec_filter=%3E0&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:10%7D%5D,%22start_time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22wk%22%7D,%7B%7D%5D,%22id%22:11%7D%5D,%22end_time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:12%7D%5D,%22type_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22Live%22%7D,%7B%7D%5D,%22id%22:13%7D%5D,%22play_duration_sec_filter%22:%5B%7B%22type%22:%22%3E%22,%22values%22:%5B%7B%22constant%22:%220%22%7D,%7B%7D%5D,%22id%22:14%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Object Repository/Page_Overview/a'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Overview/a_Log Out'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Log in/div_Logout Successful.'), 0)

WebUI.verifyTextPresent('Logout Successful.', false)

WebUI.closeBrowser()

