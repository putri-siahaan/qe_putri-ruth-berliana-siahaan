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
import io.appium.java_client.MobileElement as MobileElement

Mobile.startApplication('D:\\Kuliah\\MBKM\\Altera\\Stupen\\Mini Proyek\\app-debug.apk', true)

Mobile.waitForElementPresent(findTestObject('Object Repository/Delete/pageGroceries'), 45)

def device_Height
		def device_Width

		device_Height = Mobile.getDeviceHeight()
		device_Width = Mobile.getDeviceWidth()

		int startY = device_Width * 0.30
		int endY = device_Width * 0.70

		int startX = device_Height / 2
		int endX = startY

Mobile.swipe(startX, startY, endX, endY)


Mobile.waitForElementPresent(findTestObject('Object Repository/Delete/pageGroceries'), 10)

//Mobile.verifyElementVisible(findTestObject('Object Repository/Delete/validateSuccessRemove'), 0)

//actual_AlertText = Mobile.getText(findTestObject('Object Repository/Delete/validateSuccessRemove'), 10)
//
//Mobile.verifyMatch(actual_AlertText, "Item removed",false)



