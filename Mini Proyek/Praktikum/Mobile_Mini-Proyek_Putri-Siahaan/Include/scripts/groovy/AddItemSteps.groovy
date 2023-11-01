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



class AddItemSteps {

	@Given("User is on the Groceries page")
	def userIsOnTheGroceriesPage() {
		Mobile.startApplication('D:\\Kuliah\\MBKM\\Altera\\Stupen\\Mini Proyek\\app-debug.apk', true)
		Mobile.waitForElementPresent(findTestObject('Object Repository/Delete/pageGroceries'), 50)
		takeScreenshot("User is on the Groceries page")
	}

	@When("User click icon plus to add a groceries")
	def clickPlusIcon() {
		Mobile.tap(findTestObject('Object Repository/Add_Item/icon_add'), 0)
	}

	@And("User input valid name of the item")
	def validNameItem() {
		Mobile.waitForElementPresent(findTestObject('Object Repository/Add_Item/nameField'), 45)
		Mobile.tap(findTestObject('Object Repository/Add_Item/nameField'), 0)
		Mobile.setText(findTestObject('Object Repository/Add_Item/nameField'), 'indomie goreng', 0)
	}

	@And("User input valid the quantity of the item")
	def validquantityItem() {
		Mobile.tap(findTestObject('Object Repository/Add_Item/quantityItem'), 0)
		Mobile.clearText(findTestObject('Object Repository/Add_Item/quantityItem'), 0)
		Mobile.setText(findTestObject('Object Repository/Add_Item/quantityItem'), '5', 0)
	}

	@And("User click category option")
	def categoryOption() {
		Mobile.tap(findTestObject('Object Repository/Add_Item/choose_kategory'), 0)
	}

	@And("User choose a types of food category")
	def chooseCategory() {
		Mobile.tap(findTestObject('Object Repository/Add_Item/spicesCategory'), 0)
		takeScreenshot("User choose a types of food category")
	}

	@And("User click Add Item button")
	def AddItemButton() {
		Mobile.tap(findTestObject('Object Repository/Add_Item/add_item_button'), 0)
		takeScreenshot("User click Add Item button")
	}

	@Then("verify success to add a new item and back to Groceries page to display new item")
	def verifySuccessAddNewItem() {
		Mobile.waitForElementPresent(findTestObject('Object Repository/Delete/pageGroceries'), 45)
		Mobile.getText(findTestObject('Object Repository/Add_Item/GroceriesPages'), 0)
		println("Success to Add New Item")
		takeScreenshot("verify success to add a new item and back to Groceries page to display new item")
	}





	//TC2
	@And("User did not input name of the item")
	def didNotInputNameItem() {
		Mobile.waitForElementPresent(findTestObject('Object Repository/Add_Item/nameField'), 45)
		Mobile.tap(findTestObject('Object Repository/Add_Item/nameField'), 0)
		Mobile.clearText(findTestObject('Object Repository/Add_Item/nameField'), 0)
	}

	@Then("verify failed to add a new item and display error message")
	def verifyFailedAddNewItem() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Add_Item/errorMessageWithInvalidName'), 0)
		Mobile.getText(findTestObject('Object Repository/Add_Item/withoutName'), 0)
		println("Failed to Add new item")
		//		String actual_AlertText = Mobile.getText(findTestObject('Object Repository/Add_Item/errorMessageWithInvalidName'), 10)
		//
		//        String expectedText = "Must be between 1 and 50 characters."
		//
		//        Mobile.verifyMatch(actual_AlertText, expectedText, false)
		takeScreenshot("verify failed to add a new item and display error message")
	}



	//TC3
	@And("User did not input quantity of the item")
	def didNotInputQuantityItem() {
		Mobile.waitForElementPresent(findTestObject('Object Repository/Add_Item/quantityItem'), 45)
		Mobile.tap(findTestObject('Object Repository/Add_Item/quantityItem'), 0)
		Mobile.clearText(findTestObject('Object Repository/Add_Item/quantityItem'), 0)
	}
	
	@Then("verify failed to add a new item and display error message on quantity field")
	def verifyFailedAddNewItemBecuseDidNotInputQuantity() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Add_Item/errorMessageWithInvalidName'), 0)
		Mobile.getText(findTestObject('Object Repository/Add_Item/withoutQuantity'), 0)
		println("Failed to Add new item")
		takeScreenshot("verify failed to add a new item and display error message on quantity field")
	}




	//TC4
	@And("User input invalid name of the item")
	def invalidNameOfItem() {
		Mobile.waitForElementPresent(findTestObject('Object Repository/Add_Item/nameField'), 45)
		Mobile.tap(findTestObject('Object Repository/Add_Item/nameField'), 0)
		Mobile.setText(findTestObject('Object Repository/Add_Item/nameField'), 's', 0)
	}


	//TC5
	@And("User input invalid quantity of the item")
	def invalidQuantityOfItem() {
		Mobile.waitForElementPresent(findTestObject('Object Repository/Add_Item/quantityItem'), 45)
		Mobile.tap(findTestObject('Object Repository/Add_Item/quantityItem'), 0)
		Mobile.clearText(findTestObject('Object Repository/Add_Item/quantityItem'), 0)
		Mobile.setText(findTestObject('Object Repository/Add_Item/quantityItem'), '2.5', 0)
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