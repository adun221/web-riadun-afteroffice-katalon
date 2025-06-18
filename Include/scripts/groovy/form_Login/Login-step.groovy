package steps

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import cucumber.api.java.en.Given
import cucumber.api.java.en.When
import cucumber.api.java.en.And
import cucumber.api.java.en.Then

class LoginSteps {

	@Given('saya membuka browser dan menuju "(.*)"')
	def openBrowser(String url) {
		WebUI.openBrowser(url)
		WebUI.maximizeWindow()
	}

	@When('saya mengisi username "(.*)" dan password "(.*)"')
	def fillCredentials(String user, String pass) {
		WebUI.click(findTestObject('Object Repository/Login/Input-Username'))
		WebUI.setText(findTestObject('Object Repository/Login/Input-Username'), user)

		WebUI.click(findTestObject('Object Repository/Login/Input-Password'))
		WebUI.setText(findTestObject('Object Repository/Login/Input-Password'), pass)
	}

	@And('saya menekan tombol login')
	def clickLogin() {
		WebUI.click(findTestObject('Object Repository/Login/Button-Login'))
	}

	@Then('saya melihat username "(.*)" tampil di halaman profil')
	def verifyUsername(String expectedUser) {
		WebUI.verifyElementText(findTestObject('Object Repository/Login/V-Username'), expectedUser)
		WebUI.closeBrowser()
	}
}
