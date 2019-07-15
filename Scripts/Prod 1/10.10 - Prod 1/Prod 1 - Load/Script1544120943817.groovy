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
WebUI.openBrowser('https://stats.kontiki.com/login/email')

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
WebUI.navigateToUrl('https://stats.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=90bbccdd-b669-4de0-8ddd-f0ce7521640f&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2290bbccdd-b669-4de0-8ddd-f0ce7521640f%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/div_Toggle Dropdown'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'ACTUAL LIVE EVENT Live In Progress Event\n'
WebUI.navigateToUrl('https://stats.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=1655562e-ef24-43b6-8d54-bce55c4b9fba&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%221655562e-ef24-43b6-8d54-bce55c4b9fba%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.waitForAngularLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/div_Toggle Dropdown'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=e5adccc3-b8ea-420b-8a97-ac1178a1cd18&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22e5adccc3-b8ea-420b-8a97-ac1178a1cd18%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForPageLoad(0)

WebUI.waitForAngularLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/div_Toggle Dropdown'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event'
WebUI.navigateToUrl('https://stats.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=8970ff06-347e-4bd8-b584-1287c470ad4a&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%228970ff06-347e-4bd8-b584-1287c470ad4a%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/div_Toggle Dropdown'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event with no Moid, time filter in the past 5 minutes'
WebUI.navigateToUrl('https://stats.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=&format_moid_filter=&time_filter=2%20weeks&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%222%22,%22unit%22:%22wk%22%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/div_Toggle Dropdown'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'ACTUAL LIVE EVENT Live In Progress Event\n'
WebUI.navigateToUrl('https://stats.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=491ea61d-3d7a-4b72-a39e-62a3e497174a&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22491ea61d-3d7a-4b72-a39e-62a3e497174a%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/div_Toggle Dropdown'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Agent Details'
WebUI.navigateToUrl('https://stats.kontiki.com/dashboards/analytics_external::agent?Short%20Node%20ID=rbAk4MBwhUrSjonT&Delivery%20Time=&Delivery%20Type=&filter_config=%7B%22Short%20Node%20ID%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22rbAk4MBwhUrSjonT%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22Delivery%20Time%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22Delivery%20Type%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event with a Format Moid applied\n'
WebUI.navigateToUrl('https://stats.kontiki.com/dashboards/analytics_external::live_event?format_moid_filter=000006eb-9a7c-4679-ba0e-0e9c6cd99220&content_moid_filter=9379da06-b35a-44f8-ae88-9ce99872bc49&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%229379da06-b35a-44f8-ae88-9ce99872bc49%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22000006eb-9a7c-4679-ba0e-0e9c6cd99220%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Agent Details\n'
WebUI.navigateToUrl('https://stats.kontiki.com/dashboards/analytics_external::agent?Short%20Node%20ID=uwtnb9du04DLS%2B3P&Delivery%20Time=&Delivery%20Type=&filter_config=%7B%22Short%20Node%20ID%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22uwtnb9du04DLS%2B3P%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22Delivery%20Time%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22Delivery%20Type%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event with no Moid, time filter set to the past 15 minutes'
WebUI.navigateToUrl('https://stats.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=&format_moid_filter=&time_filter=15%20minutes&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%2215%22,%22unit%22:%22min%22%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'ACTUAL LIVE EVENT Live In Progress Event\n'
WebUI.navigateToUrl('https://stats.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=91ef1c6c-2210-4ece-8070-7bceecb399f0&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2291ef1c6c-2210-4ece-8070-7bceecb399f0%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Agent Details'
WebUI.navigateToUrl('https://stats.kontiki.com/dashboards/analytics_external::agent?Short%20Node%20ID=1MivixMLeS8LpeTu&Delivery%20Time=&Delivery%20Type=&filter_config=%7B%22Short%20Node%20ID%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%221MivixMLeS8LpeTu%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22Delivery%20Time%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22Delivery%20Type%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Agent Summary - 6 month filter\n'
WebUI.navigateToUrl('https://stats.kontiki.com/dashboards/analytics_external::agent_summary?Last%20Report%20Time=6%20months&Last%20Delivery%20Time=&Internal%20IP=&CIDR%20Prefix%20Length=&External%20IP=&Locality=&Policy%20Profile=&Agent%20Version=&filter_config=%7B%22Last%20Report%20Time%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:16%7D%5D,%22Last%20Delivery%20Time%22:%5B%7B%22type%22:%22anytime%22,%22values%22:%5B%7B%7D,%7B%7D%5D,%22id%22:17%7D%5D,%22Internal%20IP%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:18%7D%5D,%22CIDR%20Prefix%20Length%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:19%7D%5D,%22External%20IP%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:20%7D%5D,%22Locality%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:21%7D%5D,%22Policy%20Profile%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:22%7D%5D,%22Agent%20Version%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:23%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Agent Summary - 2 month filter'
WebUI.navigateToUrl('https://stats.kontiki.com/dashboards/analytics_external::agent_summary?Last%20Report%20Time=2%20months&Last%20Delivery%20Time=&Internal%20IP=&CIDR%20Prefix%20Length=&External%20IP=&Locality=&Policy%20Profile=&Agent%20Version=&filter_config=%7B%22Last%20Report%20Time%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%222%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:8%7D%5D,%22Last%20Delivery%20Time%22:%5B%7B%22type%22:%22anytime%22,%22values%22:%5B%7B%7D,%7B%7D%5D,%22id%22:9%7D%5D,%22Internal%20IP%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:10%7D%5D,%22CIDR%20Prefix%20Length%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:11%7D%5D,%22External%20IP%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:12%7D%5D,%22Locality%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:13%7D%5D,%22Policy%20Profile%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:14%7D%5D,%22Agent%20Version%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:15%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Agent Details with a Short Node ID applied'
WebUI.navigateToUrl('https://stats.kontiki.com/dashboards/analytics_external::agent?Short%20Node%20ID=uwtnb9du04DLS%2B3P&Delivery%20Time=&Delivery%20Type=&filter_config=%7B%22Short%20Node%20ID%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22uwtnb9du04DLS%2B3P%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22Delivery%20Time%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22Delivery%20Type%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live Event filtered on "In the past 15 minutes"'
WebUI.navigateToUrl('https://stats.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=&format_moid_filter=&time_filter=15%20minutes&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%2215%22,%22unit%22:%22min%22%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live Event with a Content, AND Format Moid applied.'
WebUI.navigateToUrl('https://stats.kontiki.com/dashboards/analytics_external::live_event?format_moid_filter=566dc687-9093-418d-ae38-1884a28270b8&content_moid_filter=491ea61d-3d7a-4b72-a39e-62a3e497174a&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22491ea61d-3d7a-4b72-a39e-62a3e497174a%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22566dc687-9093-418d-ae38-1884a28270b8%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'SCCM Summary Dashboard filtered on past 6 months'
WebUI.navigateToUrl('https://stats.kontiki.com/dashboards/sccm_users::sccm_summary?time_filter=6%20months&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live Event/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Live Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Agent Details with a Short Node ID applied\n'
WebUI.navigateToUrl('https://stats.kontiki.com/dashboards/analytics_external::agent?Short%20Node%20ID=5H6AQySk3LLQ7Ixo&Delivery%20Time=&Delivery%20Type=&filter_config=%7B%22Short%20Node%20ID%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%225H6AQySk3LLQ7Ixo%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22Delivery%20Time%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22Delivery%20Type%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Explore Views/div_Toggle Dropdown'))

WebUI.click(findTestObject('Page_Explore Views/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Live In Progress Event with a Moid, time filter set to the past 6 months'
WebUI.navigateToUrl('https://stats.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=1860488a-28a2-4e75-9532-bcb033da7196')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Live (In Progress) Event/div_Toggle Dropdown'))

WebUI.click(findTestObject('Page_Live (In Progress) Event/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Network Summary'
WebUI.navigateToUrl('https://stats.kontiki.com/dashboards/analytics_external::network_summary?time_filter=6%20months&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Network Content with a specific Moid'
WebUI.navigateToUrl('https://stats.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=67e99f15-4746-37aa-82a2-42270c9d4ef9&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2267e99f15-4746-37aa-82a2-42270c9d4ef9%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Network Locality Details with a Locality applied'
WebUI.navigateToUrl('https://stats.kontiki.com/dashboards/analytics_external::network_locality?Locality=AMS-AMS-VPN-SITE&Last%20Delivery%20Time=6%20months&Last%20Report%20Time=&External%20IP=&filter_config=%7B%22Last%20Delivery%20Time%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22Last%20Report%20Time%22:%5B%7B%22type%22:%22anytime%22,%22values%22:%5B%7B%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22Locality%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22AMS-AMS-VPN-SITE%22%7D,%7B%7D%5D,%22id%22:2%7D%5D,%22External%20IP%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:3%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Network Content with a specific Moid'
WebUI.navigateToUrl('https://stats.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=2db3f2b8-b25d-48f2-90a4-85cb4ca2f1bf&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%222db3f2b8-b25d-48f2-90a4-85cb4ca2f1bf%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Network Locality Details with a Locality applied'
WebUI.navigateToUrl('https://stats.kontiki.com/dashboards/analytics_external::network_locality?Locality=AOA-NG-Agbara-Factory&Last%20Delivery%20Time=6%20months&Last%20Report%20Time=&External%20IP=&filter_config=%7B%22Last%20Delivery%20Time%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22Last%20Report%20Time%22:%5B%7B%22type%22:%22anytime%22,%22values%22:%5B%7B%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22Locality%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22AOA-NG-Agbara-Factory%22%7D,%7B%7D%5D,%22id%22:2%7D%5D,%22External%20IP%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:3%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Network Content with a specific Moid'
WebUI.navigateToUrl('https://stats.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=b7847cbb-5a10-43e8-87c8-cf948bbbbd1c&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22b7847cbb-5a10-43e8-87c8-cf948bbbbd1c%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/div_Toggle Dropdown'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Network Summary with a specific Moid'
WebUI.navigateToUrl('https://stats.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=9a635112-7c2e-4933-a185-ce855683c58f&format_moid_filter=&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%229a635112-7c2e-4933-a185-ce855683c58f%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Network Content/div_Toggle Dropdown'))

WebUI.click(findTestObject('Page_Network Content/a_Clear Cache  Refresh'))

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

'Overview page\n'
WebUI.navigateToUrl('https://stats.kontiki.com/dashboards/analytics_external::Overview?time_filter=6%20months&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:1%7D%5D%7D')

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Object Repository/Page_Overview/a'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Overview/a_Log Out'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForAngularLoad(0)

WebUI.waitForPageLoad(0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Log in/div_Logout Successful.'), 0)

WebUI.verifyTextPresent('Logout Successful.', false)

WebUI.closeBrowser()

