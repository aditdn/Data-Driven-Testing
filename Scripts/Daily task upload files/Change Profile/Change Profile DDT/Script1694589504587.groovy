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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.click(findTestObject('Object Repository/Website A/Homepage/Btn_Masuk (1)'))

WebUI.setText(findTestObject('Object Repository/Website A/Masuk page/Field_Email (1)'), GlobalVariable.EmailLogin)

WebUI.setText(findTestObject('Object Repository/Website A/Masuk page/Field_Kata Sandi (1)'), GlobalVariable.PasswordLogin)

WebUI.click(findTestObject('Object Repository/Website A/Masuk page/Btn_Login (1)'))

WebUI.click(findTestObject('Object Repository/Website A/Homepage/Nav_profile'))

WebUI.click(findTestObject('Object Repository/Website A/Homepage/Btn_My Account (1)'))

WebUI.click(findTestObject('Object Repository/Website A/Page_Coding.ID - Dashboard/Btn_Profil'))

WebUI.click(findTestObject('Object Repository/Website A/Page_Coding.ID - Dashboard/Nav_Edit Profile'))

WebUI.uploadFile(findTestObject('Website A/Edit profile page/img_Invoice_avatar-icon'), findTestData('New Test Data').getValue(
        3, 1))

WebUI.click(findTestObject('Object Repository/Website A/Page_Coding.ID - Dashboard/Btn_Save Changes'))

WebUI.verifyElementText(findTestObject('Object Repository/Website A/Page_Coding.ID - Dashboard/Text_Berhasil'), 'Berhasil')

WebUI.click(findTestObject('Object Repository/Website A/Page_Coding.ID - Dashboard/Btn_OK'))

WebUI.closeBrowser()

