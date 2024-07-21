import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('/Users/bashiralatisheolamilekan/Downloads/VertoTest/Thrive_Test.apk', true)

Mobile.tap(findTestObject('Object Repository/Flows/android.widget.TextView - Login (2)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Flows/android.widget.EditText - Enter your username (1)'), 'TestAccount')

Mobile.sendKeys(findTestObject('Object Repository/Flows/android.widget.EditText - Enter your password (1)'), 'Password1$')

Mobile.tap(findTestObject('Object Repository/Flows/android.widget.TextView - Login (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Flows/android.widget.TextView - Get Started (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Flows/android.widget.TextView - Send Money (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Flows/android.widget.TextView - Thrive MFB Account (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Flows/android.widget.EditText - Enter account number (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Flows/android.widget.EditText - Enter account number (2)'), '0000004338')

Mobile.tap(findTestObject('Object Repository/Flows/android.widget.EditText - 0.00 (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Flows/android.widget.EditText - 0.00 (2)'), '10.00')

Mobile.tap(findTestObject('Object Repository/Flows/android.widget.TextView - Account Number'), 0)

Mobile.tap(findTestObject('Object Repository/Flows/android.widget.TextView - Proceed (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Flows/android.widget.EditText'), '8378')

Mobile.tap(findTestObject('Object Repository/Flows/android.widget.TextView - Proceed (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Flows/android.widget.TextView - Open Receipt'), 0)

Mobile.takeScreenshot('/var/folders/fd/syp1x8911zq7lrpm8hj8btjh0000gz/T/screenshot8774109791698635654.png')

Mobile.closeApplication()

