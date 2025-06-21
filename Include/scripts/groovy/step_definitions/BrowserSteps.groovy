package step_definitions
import static com.kms.katalon.core.testobject.ObjectRepository.*
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import cucumber.api.java.en.Given

class BrowserSteps {

	@Given("the user opens the browser")
	def openBrowser() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://google.com')
		WebUI.delay(3)
		WebUI.closeBrowser()
	}
}
