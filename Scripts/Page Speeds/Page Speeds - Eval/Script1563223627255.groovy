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

'Waits for all angular elements on the landing page and throws an exception after 90 seconds'
WebUI.waitForAngularLoad(90)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Overview/a'), 0)

'OVERVIEW DASHBOARD'
WebUI.navigateToUrl('https://stats.eval.kontiki.com/dashboards/analytics_external::Overview?time_filter=6%20months&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

'Waits for all angular elements on the landing page and throws an exception after 90 seconds'
WebUI.waitForAngularLoad(90)

WebUI.waitForPageLoad(0)

'LIVE EVENT SUMMARY DASHBOARD'
WebUI.navigateToUrl('https://stats.eval.kontiki.com/dashboards/analytics_external::live_event_summary?time_filter=6%20months&title_filter=&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:4%7D%5D,%22title_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:5%7D%5D%7D')

'Waits for all angular elements on the landing page and throws an exception after 90 seconds'
WebUI.waitForAngularLoad(90)

WebUI.waitForPageLoad(0)

'LIVE EVENT DETAIL | ~8k agents\nMoid: 6ace66d6-24dd-5bc3-c9be-5e67bb1ce944'
WebUI.navigateToUrl('https://stats.eval.kontiki.com/dashboards/analytics_external::live_event?content_moid_filter=6ace66d6-24dd-5bc3-c9be-5e67bb1ce944&start_time_filter=6%20quarters&end_time_filter=&play_duration_sec_filter=%3E30&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%226ace66d6-24dd-5bc3-c9be-5e67bb1ce944%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22start_time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22qu%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22end_time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:2%7D%5D,%22play_duration_sec_filter%22:%5B%7B%22type%22:%22%3E%22,%22values%22:%5B%7B%22constant%22:%2230%22%7D,%7B%7D%5D,%22id%22:3%7D%5D%7D')

'Waits for all angular elements on the landing page and throws an exception after 90 seconds'
WebUI.waitForAngularLoad(150)

WebUI.waitForPageLoad(0)

'LIVE (In Progress) EVENT | ~10k Agents, filtered by the past 1 Month'
WebUI.navigateToUrl('https://stats.eval.kontiki.com/dashboards/analytics_external::live_event_in_progress?content_moid_filter=&start_time_filter=6%20hours&end_time_filter=&play_duration_sec_filter=%3E30&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:8%7D%5D,%22start_time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22hr%22%7D,%7B%7D%5D,%22id%22:9%7D%5D,%22end_time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:10%7D%5D,%22play_duration_sec_filter%22:%5B%7B%22type%22:%22%3E%22,%22values%22:%5B%7B%22constant%22:%2230%22%7D,%7B%7D%5D,%22id%22:11%7D%5D%7D')

'Waits for all angular elements on the landing page and throws an exception after 90 seconds'
WebUI.waitForAngularLoad(150)

WebUI.waitForPageLoad(0)

'VIDEO ON DEMAND SUMMARY'
WebUI.navigateToUrl('https://stats.eval.kontiki.com/dashboards/analytics_external::vod_summary?time_filter=6%20months&event_filter=&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:4%7D%5D,%22event_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:5%7D%5D%7D')

'Waits for all angular elements on the landing page and throws an exception after 90 seconds'
WebUI.waitForAngularLoad(90)

WebUI.waitForPageLoad(0)

'VIDEO ON DEMAND DETAIL | ~100 agents\nMoid: 502f3d8b-0185-4809-a7bd-a0b1da9da4c3'
WebUI.navigateToUrl('https://stats.eval.kontiki.com/dashboards/analytics_external::vod_performance?content_moid_filter=502f3d8b-0185-4809-a7bd-a0b1da9da4c3&time_filter=6%20months&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22502f3d8b-0185-4809-a7bd-a0b1da9da4c3%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:1%7D%5D%7D')

'Waits for all angular elements on the landing page and throws an exception after 90 seconds'
WebUI.waitForAngularLoad(90)

WebUI.waitForPageLoad(0)

'NETWORK SUMMARY'
WebUI.navigateToUrl('https://stats.eval.kontiki.com/dashboards/analytics_external::network_summary?time_filter=6%20months&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

'Waits for all angular elements on the landing page and throws an exception after 90 seconds'
WebUI.waitForAngularLoad(90)

WebUI.waitForPageLoad(0)

'NETWORK CONTENT | ~300 agents\nMoid: 4adc1161-e017-424d-9497-4031d462c30f'
WebUI.navigateToUrl('https://stats.eval.kontiki.com/dashboards/analytics_external::network_content?content_moid_filter=4adc1161-e017-424d-9497-4031d462c30f&time_filter=6%20months&locality_filter=&external_ip_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%224adc1161-e017-424d-9497-4031d462c30f%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22locality_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:2%7D%5D,%22external_ip_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:3%7D%5D%7D')

'Waits for all angular elements on the landing page and throws an exception after 90 seconds'
WebUI.waitForAngularLoad(90)

WebUI.waitForPageLoad(0)

'NETWORK LOCALITY | ~1,00 agents'
WebUI.navigateToUrl('https://stats.eval.kontiki.com/dashboards/analytics_external::network_locality?Locality=None&Last%20Delivery%20Time=6%20months&Last%20Report%20Time=&External%20IP=&filter_config=%7B%22Last%20Delivery%20Time%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22Last%20Report%20Time%22:%5B%7B%22type%22:%22anytime%22,%22values%22:%5B%7B%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22Locality%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22None%22%7D,%7B%7D%5D,%22id%22:2%7D%5D,%22External%20IP%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:3%7D%5D%7D')

'Waits for all angular elements on the landing page and throws an exception after 90 seconds'
WebUI.waitForAngularLoad(90)

WebUI.waitForPageLoad(0)

'AGENT SUMMARY | ~400 agents'
WebUI.navigateToUrl('https://stats.eval.kontiki.com/dashboards/analytics_external::agent_summary?Last%20Report%20Time=6%20months&Last%20Delivery%20Time=&Internal%20IP=&CIDR%20Prefix%20Length=&External%20IP=&Locality=&Policy%20Profile=&Agent%20Version=&filter_config=%7B%22Last%20Report%20Time%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:16%7D%5D,%22Last%20Delivery%20Time%22:%5B%7B%22type%22:%22anytime%22,%22values%22:%5B%7B%7D,%7B%7D%5D,%22id%22:17%7D%5D,%22Internal%20IP%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:18%7D%5D,%22CIDR%20Prefix%20Length%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:19%7D%5D,%22External%20IP%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:20%7D%5D,%22Locality%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:21%7D%5D,%22Policy%20Profile%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:22%7D%5D,%22Agent%20Version%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:23%7D%5D%7D')

'Waits for all angular elements on the landing page and throws an exception after 90 seconds'
WebUI.waitForAngularLoad(90)

WebUI.waitForPageLoad(0)

'AGENT DETAILS\nAgent ID: 9A038BWapvZejoti'
WebUI.navigateToUrl('https://stats.eval.kontiki.com/dashboards/analytics_external::agent?Agent%20ID=mTQGwU197PN43qMk&Delivery%20Time=6%20months&Delivery%20Type=&filter_config=%7B%22Agent%20ID%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22mTQGwU197PN43qMk%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22Delivery%20Time%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22Delivery%20Type%22:%5B%7B%22type%22:%22any%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

'Waits for all angular elements on the landing page and throws an exception after 90 seconds'
WebUI.waitForAngularLoad(90)

WebUI.waitForPageLoad(0)

'EVENT ANALYZER | ~8k agents\nMoid: 6ace66d6-24dd-5bc3-c9be-5e67bb1ce944'
WebUI.navigateToUrl('https://stats.eval.kontiki.com/dashboards/analytics_external::event_analyzer?content_moid_filter=6ace66d6-24dd-5bc3-c9be-5e67bb1ce944&format_moid_filter=&start_time_filter=6%20quarters&end_time_filter=&internal_ip_filter=&external_ip_filter=&subnet_mask_filter=&locality_filter=&filter_config=%7B%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%226ace66d6-24dd-5bc3-c9be-5e67bb1ce944%22%7D,%7B%7D%5D,%22id%22:16%7D%5D,%22format_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:17%7D%5D,%22start_time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22qu%22%7D,%7B%7D%5D,%22id%22:18%7D%5D,%22end_time_filter%22:%5B%7B%22type%22:%22advanced%22,%22values%22:%5B%7B%22constant%22:null%7D,%7B%7D%5D,%22id%22:19%7D%5D,%22internal_ip_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:20%7D%5D,%22external_ip_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:21%7D%5D,%22subnet_mask_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:22%7D%5D,%22locality_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:23%7D%5D%7D')

'Waits for all angular elements on the landing page and throws an exception after 90 seconds'
WebUI.waitForAngularLoad(150)

WebUI.waitForPageLoad(0)

'GEO EXPLORER | ~8k agents\nMoid: 6ace66d6-24dd-5bc3-c9be-5e67bb1ce944'
WebUI.navigateToUrl('https://stats.eval.kontiki.com/dashboards/analytics_external::geo_explorer?content_moid_filter=6ace66d6-24dd-5bc3-c9be-5e67bb1ce944&Browser=&Buffer%20Count=&Buffer%20Time%20(ms)=&os_ver=&OS=&Format%20Moid%20Filter=&Peering%20Percent=&time_filter=6%20quarters&filter_config=%7B%22Browser%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:0%7D%5D,%22Buffer%20Count%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:1%7D%5D,%22Buffer%20Time%20(ms)%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:2%7D%5D,%22content_moid_filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%226ace66d6-24dd-5bc3-c9be-5e67bb1ce944%22%7D,%7B%7D%5D,%22id%22:3%7D%5D,%22os_ver%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:4%7D%5D,%22OS%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:5%7D%5D,%22Format%20Moid%20Filter%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:6%7D%5D,%22Peering%20Percent%22:%5B%7B%22type%22:%22%3D%22,%22values%22:%5B%7B%22constant%22:%22%22%7D,%7B%7D%5D,%22id%22:7%7D%5D,%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22qu%22%7D,%7B%7D%5D,%22id%22:8%7D%5D%7D')

'Waits for all angular elements on the landing page and throws an exception after 90 seconds'
WebUI.waitForAngularLoad(150)

WebUI.waitForPageLoad(0)

'ConfigMgr SUMMARY | ~500 agents, filtered in the past 6 Months'
WebUI.navigateToUrl('https://stats.eval.kontiki.com/dashboards/sccm_users::sccm_summary?time_filter=6%20months&filter_config=%7B%22time_filter%22:%5B%7B%22type%22:%22past%22,%22values%22:%5B%7B%22constant%22:%226%22,%22unit%22:%22mo%22%7D,%7B%7D%5D,%22id%22:2%7D%5D%7D')

'Waits for all angular elements on the landing page and throws an exception after 90 seconds'
WebUI.waitForAngularLoad(90)

WebUI.waitForPageLoad(0)

'EXPLORE HISTORY | Table data of all queries that just completed\nFilters: Created in the last ten minutes; Runtime is not Null; Source is not a Saved Look; Status is not Running; Email is alahley@kollective.com'
WebUI.navigateToUrl('https://stats.eval.kontiki.com/explore/i__looker/history?toggle=fil&qid=AQGFfYEP0DLvFPY1bjj3nq')

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

