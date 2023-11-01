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

Mobile.startApplication('D:\\Kuliah\\MBKM\\Altera\\Stupen\\Mini Proyek\\app-debug.apk', true)

Mobile.tap(findTestObject('Object Repository/Add_Item/icon_add'), 0)

Mobile.tap(findTestObject('Object Repository/Add_Item/nameField'), 0)

Mobile.setText(findTestObject('Object Repository/Add_Item/nameField'), 'Indomie goreng', 0)

Mobile.tap(findTestObject('Object Repository/Add_Item/quantityItem'), 0)

Mobile.clearText(findTestObject('Object Repository/Add_Item/quantityItem'), 0)

Mobile.setText(findTestObject('Object Repository/Add_Item/quantityItem'), '', 0)

Mobile.tap(findTestObject('Object Repository/Add_Item/choose_kategory'), 0)

Mobile.tap(findTestObject('Object Repository/Add_Item/spicesCategory'), 0)

Mobile.tap(findTestObject('Object Repository/Add_Item/add_item_button'), 0)

Mobile.getText(findTestObject('Object Repository/Add_Item/withoutQuantity'), 0)
