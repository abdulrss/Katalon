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

WebUI.navigateToUrl('https://www.google.co.uk')

WebUI.setText(findTestObject('searchGoogle/Page_Google/input_q'), 'Java in 21 days')

WebUI.click(findTestObject('searchGoogle/Page_Google/div_java in 21 days'))

WebUI.click(findTestObject('searchGoogle/Page_java in 21 days - Google Searc/a_Sams Teach Yourself Java in'))

WebUI.click(findTestObject('searchGoogle/Page_Sams Teach Yourself Java in 21/see buying options'))

WebUI.click(findTestObject('searchGoogle/Page_Sams Teach Yourself Java in 21/input_submit.add-to-cart-ubb'))

WebUI.click(findTestObject('searchGoogle/Page_Amazon.co.uk Shopping Basket/span_15.41'))

WebUI.click(findTestObject('searchGoogle/Page_Amazon.co.uk Shopping Basket/span_15.41'))

WebUI.closeBrowser()

