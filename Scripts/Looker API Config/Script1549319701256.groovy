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
WebUI.openBrowser('https://stats-vc14.corp.kontiki.com/login/email')

'Filling out login info (username)'
WebUI.setText(findTestObject('Object Repository/Page_Log in/input_email (2)'), 'alahley@kollective.com')

'Filling out login info (password)'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in/input_password (2)'), '5wulVsUVXnXznlrpFL+mjg==')

'Clicks the Stay Logged In button'
WebUI.click(findTestObject('Object Repository/Page_Log in/input_remember (2)'))

'Clicks the Submit button to login'
WebUI.click(findTestObject('Object Repository/Page_Log in/input_login-submit (2)'))

WebUI.navigateToUrl('https://stats-vc14.corp.kontiki.com/admin/users?sorts=last_name%20asc&name=api%20user')

WebUI.click(findTestObject('Page_User Attributes/td_Edit'))

td_client_secret = WebUI.getText(findTestObject('Object Repository/Page_User Attributes/td_client_secret'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_User Attributes/input_New Value_form-control n'), 'GsDg7c4rZc5S8yKjDpNQrby8\t')

not_run: WebUI.closeBrowser()

WebUI.navigateToUrl('https://stats-vc14.corp.kontiki.com/admin/user_attributes')

WebUI.click(findTestObject('Page_User Attributes/button_Edit'))

WebUI.click(findTestObject('Page_User Attributes/a_Group Values'))

WebUI.click(findTestObject('Page_User Attributes/button_Edit Value'))

WebUI.setText(findTestObject('Page_User Attributes/input_New Value_form-control n'), '')

WebUI.setText(findTestObject('Page_User Attributes/input_New Value_form-control n'), td_client_secret)

WebUI.click(findTestObject('Page_User Attributes/button_Save'))

WebUI.navigateToUrl('https://stats-vc14.corp.kontiki.com/admin/users/65/edit')

td_client_secret = WebUI.getText(findTestObject('Object Repository/Page_User Attributes/td_client_secret'))

WebUI.navigateToUrl('https://stats-vc14.corp.kontiki.com/admin/user_attributes')

WebUI.click(findTestObject('Page_User Attributes/button_Edit'))

WebUI.click(findTestObject('Page_User Attributes/a_Group Values'))

WebUI.click(findTestObject('Page_User Attributes/button_Edit Value'))

WebUI.setText(findTestObject('Page_User Attributes/input_New Value_form-control n'), '')

WebUI.setText(findTestObject('Page_User Attributes/input_New Value_form-control n'), td_client_secret)

WebUI.click(findTestObject('Page_User Attributes/button_Save'))

