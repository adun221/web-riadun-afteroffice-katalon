package step_definitions
import static com.kms.katalon.core.testobject.ObjectRepository.*
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import cucumber.api.java.en.Given
import cucumber.api.java.en.When
import cucumber.api.java.en.Then


class LoginSteps {

	@Given("User berada di halaman login DemoQA")
	def openLoginPage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://demoqa.com/login')
		WebUI.maximizeWindow()
		WebUI.waitForElementVisible(findTestObject('Page_Login/input_Username'), 10)
	}

	@When("User mengisi username {string} dan password {string}")
	def inputCredentials(String username, String password) {
		WebUI.setText(findTestObject('Page_Login/input_Username'), username)
		WebUI.setText(findTestObject('Page_Login/input_Password'), password)
	}

	@When("User menekan tombol Login")
	def clickLogin() {
		WebUI.click(findTestObject('Page_Login/button_Login'))
	}

	@Then("User diarahkan ke halaman Profile {string}")
	def verifyProfilePage(String usernamenya) {
		WebUI.waitForPageLoad(10)
		WebUI.waitForElementVisible(findTestObject('Page_Profile/v-user'), 10)
		WebUI.verifyElementText(findTestObject('Page_Profile/v-user'), usernamenya)
		WebUI.delay(5)
		WebUI.closeBrowser()
	}
}
