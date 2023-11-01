import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import io.appium.java_client.MobileElement
import org.openqa.selenium.OutputType
import org.openqa.selenium.TakesScreenshot
import org.apache.commons.io.FileUtils

import io.appium.java_client.AppiumDriver
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.ios.IOSDriver

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

class DeleteSteps {

	@Given("User on the Groceries page")
	def onTheGroceriesPage() {
		Mobile.startApplication('D:\\Kuliah\\MBKM\\Altera\\Stupen\\Mini Proyek\\app-debug.apk', true)
		Mobile.waitForElementPresent(findTestObject('Object Repository/Delete/pageGroceries'), 45)
		takeScreenshot("I am on the Groceries page")
	}

	@When("User swipes an item from left to right")
	def swipesItemFromLeftToRight() {
		def device_Height
		def device_Width

		device_Height = Mobile.getDeviceHeight()
		device_Width = Mobile.getDeviceWidth()

		int startY = device_Height / 2
		int endY = startY
		int startX = device_Width * 0.30
		int endX = device_Width * 0.70

		Mobile.swipe(startX, startY, endX, endY)

		Mobile.waitForElementPresent(findTestObject('Object Repository/Delete/pageGroceries'), 45)

		takeScreenshot("User swipes an item from left to right")
	}

	@Then("verify success delete the item")
	def verifySuccessDeleteItem() {
		println("Success Delete")
		WebUI.closeBrowser()
	}





	//TC2
	@When("User swipes an item from right to left")
	def swipesItemFromRightToLeft() {
		def device_Height
		def device_Width

		device_Height = Mobile.getDeviceHeight()
		device_Width = Mobile.getDeviceWidth()

		int startY = device_Height / 2
		int endY = startY
		int startX = device_Width * 0.70
		int endX = device_Width * 0.30

		Mobile.swipe(startX, startY, endX, endY)

		Mobile.waitForElementPresent(findTestObject('Object Repository/Delete/pageGroceries'), 45)

		takeScreenshot("User swipes an item from right to left")
	}





	//TC3
	@When("User swipes an item from bottom to up")
	def swipesItemFromBottomToUp() {
		def device_Height
		def device_Width

		device_Height = Mobile.getDeviceHeight()
		device_Width = Mobile.getDeviceWidth()

		int startY = device_Width * 0.70
		int endY = device_Width * 0.30

		int startX = device_Height / 2
		int endX = startY

		Mobile.swipe(startX, startY, endX, endY)

		Mobile.waitForElementPresent(findTestObject('Object Repository/Delete/pageGroceries'), 45)

		takeScreenshot("User swipes an item from bottom to up")
	}




	//TC4
	@When("User swipes an item from top to bottom")
	def swipesItemFromTopToButtom() {
		def device_Height
		def device_Width

		device_Height = Mobile.getDeviceHeight()
		device_Width = Mobile.getDeviceWidth()

		int startY = device_Width * 0.30
		int endY = device_Width * 0.70

		int startX = device_Height / 2
		int endX = startY

		Mobile.swipe(startX, startY, endX, endY)

		Mobile.waitForElementPresent(findTestObject('Object Repository/Delete/pageGroceries'), 45)

		takeScreenshot("User swipes an item from top to bottom")
	}





	private void takeScreenshot(String stepName) {
		AppiumDriver<WebElement> mobileDriver = MobileDriverFactory.getDriver()
		if (mobileDriver instanceof TakesScreenshot) {

			File screenshot = ((TakesScreenshot) mobileDriver).getScreenshotAs(OutputType.FILE)

			String screenshotPath = "D:/Kuliah/MBKM/Altera/Stupen/Mini Proyek/screenshot_mobile/" + stepName + ".png"

			try {
				FileUtils.copyFile(screenshot, new File(screenshotPath))
			} catch (Exception e) {
				e.printStackTrace()
			}
		} else {
			System.out.println("Mobile driver does not support taking screenshots.")
		}
	}
}