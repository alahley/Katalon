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

'Waits for all angular elements on the landing page and throws an exception after 90 seconds'
WebUI.waitForAngularLoad(90)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Overview/a'), 0)

'Waits for all angular elements on the landing page and throws an exception after 90 seconds'
WebUI.waitForAngularLoad(90)

WebUI.waitForPageLoad(0)

'LIVE EVENT SUMMARY DASHBOARD'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::live_event_summary?time_filter=6%20months&title_filter=&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:4%7D%5D,%22title_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:5%7D%5D%7D')

'Waits for all angular elements on the landing page and throws an exception after 90 seconds'
WebUI.waitForAngularLoad(90)

WebUI.waitForPageLoad(0)

'LIVE EVENT DETAIL | ~1k agents\nMoid: 99884aee-9238-4acc-a4e8-0edad712b2f4'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=99884aee-9238-4acc-a4e8-0edad712b2f4&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2299884aee-9238-4acc-a4e8-0edad712b2f4%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:1%7D%5D%7D')

'Waits for all angular elements on the landing page and throws an exception after 90 seconds'
WebUI.waitForAngularLoad(150)

WebUI.waitForPageLoad(0)

'LIVE (In Progress) EVENT | ~2.5k Agents, filtered by the past 1 Month'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=&time_filter=1%20months&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:4%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%221%22,%22unit%22:%22mo%22%7D%5D,%22id%22:5%7D%5D%7D')

'Waits for all angular elements on the landing page and throws an exception after 90 seconds'
WebUI.waitForAngularLoad(150)

WebUI.waitForPageLoad(0)

'VIDEO ON DEMAND SUMMARY'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::vod_summary?time_filter=6%20months&event_filter=&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:4%7D%5D,%22event_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:5%7D%5D%7D')

'Waits for all angular elements on the landing page and throws an exception after 90 seconds'
WebUI.waitForAngularLoad(90)

WebUI.waitForPageLoad(0)

'VIDEO ON DEMAND DETAIL | ~70 agents\nMoid: ab0c7c44-3776-4f62-94d1-d9c39f34aa61'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::vod_performance?content_moid_filter=ab0c7c44-3776-4f62-94d1-d9c39f34aa61&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22ab0c7c44-3776-4f62-94d1-d9c39f34aa61%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:1%7D%5D%7D')

'Waits for all angular elements on the landing page and throws an exception after 90 seconds'
WebUI.waitForAngularLoad(90)

WebUI.waitForPageLoad(0)

'NETWORK SUMMARY'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::network_summary?time_filter=6%20months&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

'Waits for all angular elements on the landing page and throws an exception after 90 seconds'
WebUI.waitForAngularLoad(90)

WebUI.waitForPageLoad(0)

'NETWORK CONTENT | ~750 agents\nMoid: 99884aee-9238-4acc-a4e8-0edad712b2f4'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=99884aee-9238-4acc-a4e8-0edad712b2f4&time_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2299884aee-9238-4acc-a4e8-0edad712b2f4%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:1%7D%5D%7D')

'Waits for all angular elements on the landing page and throws an exception after 90 seconds'
WebUI.waitForAngularLoad(90)

WebUI.waitForPageLoad(0)

'NETWORK LOCALITY | ~1k agents\nNo locality + 6 Month filter'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::network_locality?Locality=&Last%20Delivery%20Time=6%20months&Last%20Report%20Time=&External%20IP=&filter_config=%7B%22Last%20Delivery%20Time%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22Last%20Report%20Time%22:%5B%7B%22type%22:%22anytime%22,%22values%22:%5B%7B%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22Locality%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:2%7D%5D,%22External%20IP%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:3%7D%5D%7D')

'Waits for all angular elements on the landing page and throws an exception after 90 seconds'
WebUI.waitForAngularLoad(90)

WebUI.waitForPageLoad(0)

'AGENT SUMMARY | ~22k agents'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::agent_summary?Last%20Report%20Time=6%20months&Last%20Delivery%20Time=&Internal%20IP=&CIDR%20Prefix%20Length=&External%20IP=&Locality=&Policy%20Profile=&Agent%20Version=&filter_config=%7B%22Last%20Report%20Time%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:16%7D%5D,%22Last%20Delivery%20Time%22:%5B%7B%22type%22:%22anytime%22,%22values%22:%5B%7B%7D,%7B%7D%5D,%22id%22:17%7D%5D,%22Internal%20IP%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:18%7D%5D,%22CIDR%20Prefix%20Length%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:19%7D%5D,%22External%20IP%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:20%7D%5D,%22Locality%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:21%7D%5D,%22Policy%20Profile%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:22%7D%5D,%22Agent%20Version%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:23%7D%5D%7D')

'OVERVIEW DASHBOARD'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::Overview?time_filter=6%20months&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

'Waits for all angular elements on the landing page and throws an exception after 90 seconds'
WebUI.waitForAngularLoad(90)

WebUI.waitForPageLoad(0)

'AGENT DETAILS\nAgent ID: 9A038BWapvZejoti'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::agent?Agent%20ID=1%2FaQHwySXdBdcI%2FD&Delivery%20Time=&Delivery%20Type=&filter_config=%7B%22Agent%20ID%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%221%2FaQHwySXdBdcI%2FD%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22Delivery%20Time%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22Delivery%20Type%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

'Waits for all angular elements on the landing page and throws an exception after 90 seconds'
WebUI.waitForAngularLoad(90)

WebUI.waitForPageLoad(0)

'EVENT ANALYZER | ~1k agents\nMoid: 99884aee-9238-4acc-a4e8-0edad712b2f4'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::event_analyzer?content_moid=99884aee-9238-4acc-a4e8-0edad712b2f4&format_moid=&start_time=&internal_ip=&external_ip=&subnet_mask=&locality=&filter_config=%7B%22content_moid%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2299884aee-9238-4acc-a4e8-0edad712b2f4%22%7D,%7B%7D%5D,%22id%22:14%7D%5D,%22format_moid%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:15%7D%5D,%22start_time%22:%5B%7B%22type%22:%22anytime%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:16%7D%5D,%22internal_ip%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:17%7D%5D,%22external_ip%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:18%7D%5D,%22subnet_mask%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:19%7D%5D,%22locality%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:20%7D%5D%7D')

'Waits for all angular elements on the landing page and throws an exception after 90 seconds'
WebUI.waitForAngularLoad(150)

WebUI.waitForPageLoad(0)

'GEO EXPLORER | ~1k agents\nMoid: aa143c4c-d288-404b-b2d3-a7e4dd870baa'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/analytics_external::geo_explorer?content_moid_filter=02db3516-d793-49cd-ab08-deefa8fc30da&Browser=&Buffer%20Count=&Buffer%20Time%20(ms)=&Context=&OS=&Format%20Moid%20Filter=&Peering%20Percent=&filter_config=%7B%22Browser%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22Buffer%20Count%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22Buffer%20Time%20(ms)%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:2%7D%5D,%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%2202db3516-d793-49cd-ab08-deefa8fc30da%22%7D,%7B%7D%5D,%22id%22:3%7D%5D,%22Context%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:4%7D%5D,%22OS%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:5%7D%5D,%22Format%20Moid%20Filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:6%7D%5D,%22Peering%20Percent%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:7%7D%5D%7D')

'Waits for all angular elements on the landing page and throws an exception after 90 seconds'
WebUI.waitForAngularLoad(150)

WebUI.waitForPageLoad(0)

'SCCM SUMMARY | ~245 agents, filtered in the past 6 Months'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/dashboards/sccm_users::sccm_summary?time_filter=6%20months&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

'Waits for all angular elements on the landing page and throws an exception after 90 seconds'
WebUI.waitForAngularLoad(90)

WebUI.waitForPageLoad(0)

'EXPLORE HISTORY | Table data of all queries that just completed\nFilters: Created in the last ten minutes; Runtime is not Null; Source is not a Saved Look; Status is not Running; Email is alahley@kollective.com'
WebUI.navigateToUrl('https://stats.tc1.kontiki.com/explore/i__looker/history?toggle=fil&qid=akAjouswN2uxUgVsT6Aox1')

'Waits for all angular elements on the landing page and throws an exception after 90 seconds'
WebUI.waitForAngularLoad(90)

WebUI.waitForPageLoad(0)

'Clicks the gear icon'
WebUI.click(findTestObject('Page_Explore History/i_Run_lk-icon-gear'))

'Clear Cache & Refresh'
WebUI.click(findTestObject('Page_Explore History/a_Clear Cache  Refresh'))

'Waits for all angular elements on the landing page and throws an exception after 90 seconds'
WebUI.waitForAngularLoad(90)

WebUI.waitForPageLoad(0)

'Clicks the gear icon'
WebUI.click(findTestObject('Page_Explore History/i_Run_lk-icon-gear'))

WebUI.click(findTestObject('Page_Explore History/a_SSend...'))

'Expands the Advanced Options to make sure that Results In Table radio button is selected.'
WebUI.click(findTestObject('Page_Explore History/div_HTML_schedule-selectable__'))

'Send'
WebUI.click(findTestObject('Page_Explore History/button_Send'))

WebUI.waitForPageLoad(0)

WebUI.closeBrowser()

