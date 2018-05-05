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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.co.uk/')

WebUI.setText(findTestObject('Page_Amazon.co.uk Low Prices in Ele/input_field-keywords'), 'Java in 21 days')

WebUI.click(findTestObject('Page_Amazon.co.uk Low Prices in Ele/div_java in 21 days in Books'))

WebUI.click(findTestObject('Page_Amazon.co.uk java in 21 days B/h2_Java in 21 Days Sams Teach'))

WebUI.click(findTestObject('Page_Java in 21 Days Sams Teach You/input_submit.add-to-cart'))

WebUI.click(findTestObject('Page_Amazon.co.uk Shopping Basket/span_32.99'))

WebUI.verifyElementPresent(findTestObject('Page_Amazon.co.uk Shopping Basket/span_32.99'), 0)

WebUI.closeBrowser()

