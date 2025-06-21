package step_definitions
import static com.kms.katalon.core.testobject.ObjectRepository.*
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import cucumber.api.java.en.Given
import cucumber.api.java.en.When
import cucumber.api.java.en.Then


class RegisSteps {
	String generatedUsername = ""

	@Given("User berada di halaman register DemoQA")
	def openLoginPage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://demoqa.com/register')
		WebUI.maximizeWindow()
		WebUI.waitForElementVisible(findTestObject('Page_Register/I_firstname'), 10)
	}

	@When("User mengisi username {string} , password {string} , firstname {string} dan lastname {string}")
	def inputCredentials(String username, String password, String firstname, String lastname) {

		int randomNum = (int)(Math.random() * 900) + 100
		generatedUsername = username + randomNum

		WebUI.setText(findTestObject('Page_Register/I_firstname'), firstname)
		WebUI.setText(findTestObject('Page_Register/I_lastname'), lastname)
		WebUI.setText(findTestObject('Page_Register/I_username'), generatedUsername)
		WebUI.setText(findTestObject('Page_Register/I_password'), password)
	}

	@When("User menekan tombol register")
	def clickLogin() {
		WebUI.click(findTestObject('Page_Register/B_register'))
	}

	@When("User melakukan ceklist captcha")
	def checkCaptcha() {
		WebUI.executeJavaScript("window.scrollBy(0, 400)", null)
		WebUI.comment("Menunggu user untuk ceklist CAPTCHA manual...")
		WebUI.delay(15)
	}

	@Then("Muncul notifikasi pendaftaran berhasil")
	def verifyRegisterSuccessAlert() {
		if (WebUI.waitForAlert(10)) {
			def alertText = WebUI.getAlertText()
			println("Isi alert: " + alertText)
			WebUI.verifyMatch(alertText, 'User Register Successfully.', false)
			WebUI.acceptAlert()
		} else {
			WebUI.verifyMatch("Tidak muncul alert", "User Register Successfully.", false)
		}
		WebUI.closeBrowser()
	}
}
