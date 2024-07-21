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

Mobile.tap(findTestObject('Object Repository/RegistrationComplete/android.widget.TextView - Register'), 0)

Mobile.sendKeys(findTestObject('Object Repository/RegistrationComplete/android.widget.EditText - Enter your account number'), 
    '0000062077')

Mobile.sendKeys(findTestObject('Object Repository/RegistrationComplete/android.widget.EditText - Enter your phone number'), 
    '08146374057')

Mobile.tap(findTestObject('Object Repository/RegistrationComplete/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/RegistrationComplete/android.widget.TextView - Proceed'), 0)

Mobile.sendKeys(findTestObject('Object Repository/RegistrationComplete/android.widget.EditText'), '111111')

Mobile.tap(findTestObject('Object Repository/RegistrationComplete/android.widget.TextView - Proceed (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/RegistrationComplete/android.widget.EditText - Enter your username'), 
    'TesterAuto')

Mobile.sendKeys(findTestObject('Object Repository/RegistrationComplete/android.widget.EditText - Enter your password'), 
    'Password1$')

Mobile.sendKeys(findTestObject('Object Repository/RegistrationComplete/android.widget.EditText - Confirm your password'), 
    'Password1$')

Mobile.tap(findTestObject('Object Repository/RegistrationComplete/android.widget.TextView - Proceed (2)'), 0)

Mobile.tap(findTestObject('Object Repository/RegistrationComplete/android.view.ViewGroup (4)'), 0)

Mobile.tap(findTestObject('Object Repository/RegistrationComplete/android.view.ViewGroup (3)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/RegistrationComplete/android.widget.EditText - Enter your answer to security question'), 
    'Test')

Mobile.tap(findTestObject('Object Repository/RegistrationComplete/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/RegistrationComplete/android.widget.TextView - In what city were you born'), 
    0)

Mobile.sendKeys(findTestObject('Object Repository/RegistrationComplete/android.widget.EditText - Enter your answer to security question (1)'), 
    'Test')

Mobile.tap(findTestObject('Object Repository/RegistrationComplete/android.widget.EditText - Select your security question'), 
    0)

Mobile.tap(findTestObject('Object Repository/RegistrationComplete/android.widget.TextView - What is the name of your favourite pet'), 
    0)

Mobile.sendKeys(findTestObject('Object Repository/RegistrationComplete/android.widget.EditText - Enter your answer to security question (2)'), 
    'Test')

Mobile.tap(findTestObject('Object Repository/RegistrationComplete/android.widget.TextView - Proceed (3)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/RegistrationComplete/android.widget.EditText (1)'), '1350')

Mobile.tap(findTestObject('Object Repository/RegistrationComplete/android.widget.TextView - Proceed (4)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/RegistrationComplete/android.widget.EditText (2)'), '1350')

Mobile.tap(findTestObject('Object Repository/RegistrationComplete/android.widget.TextView - Proceed (4)'), 0)

Mobile.tap(findTestObject('Object Repository/RegistrationComplete/android.widget.TextView - Login to Dashboard'), 0)

Mobile.sendKeys(findTestObject('Object Repository/RegistrationComplete/android.widget.EditText - Enter your username'), 
    'TesterAuto')

Mobile.sendKeys(findTestObject('Object Repository/RegistrationComplete/android.widget.EditText - Enter your password'), 
    'Password1$')

Mobile.tap(findTestObject('Object Repository/RegistrationComplete/android.widget.TextView - Login'), 0)

Mobile.tap(findTestObject('Object Repository/RegistrationComplete/android.widget.TextView - Get Started'), 0)

Mobile.tap(findTestObject('Object Repository/RegistrationComplete/android.widget.TextView - Profile'), 0)

Mobile.tap(findTestObject('Object Repository/RegistrationComplete/android.widget.TextView - Delete Profile'), 0)

Mobile.tap(findTestObject('Object Repository/RegistrationComplete/android.widget.TextView - Yes, Delete'), 0)

Mobile.sendKeys(findTestObject('Object Repository/RegistrationComplete/android.widget.EditText - Enter your reason'), 'This is a test')

Mobile.tap(findTestObject('Object Repository/RegistrationComplete/android.widget.TextView - Proceed (5)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/RegistrationComplete/android.widget.EditText (3)'), '1350')

Mobile.tap(findTestObject('Object Repository/RegistrationComplete/android.widget.TextView - Proceed (6)'), 0)

Mobile.takeScreenshot('/var/folders/fd/syp1x8911zq7lrpm8hj8btjh0000gz/T/screenshot6869564251412927363.png')

Mobile.tap(findTestObject('Object Repository/RegistrationComplete/android.widget.TextView - Close'), 0)

Mobile.closeApplication()

