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



class BackSteps {

	@And("User clik back button to return to groceries page")
	def clickBackButton() {
		Mobile.tap(findTestObject('Object Repository/BackToGroceries/backButton'), 0)
	}

	@Then("verify success to navigate to the shopping page")
	def verifySuccessClickBackButton() {
		Mobile.getText(findTestObject('Object Repository/BackToGroceries/groceriesPage'), 0)
		takeScreenshot("verify success to navigate to the shopping page")
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