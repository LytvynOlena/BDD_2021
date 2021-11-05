package net.amazon.step_definitionsOlena;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.amazon.Util.BrowserUtil;
import net.amazon.Util.BrowserUtils;
import net.amazon.Util.ConfigurationReader;
import net.amazon.Util.Driver;
import net.amazon.pagesOlena.LoginAmazonPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginAmazon {

    LoginAmazonPage amazonPage = new LoginAmazonPage();

    @Given("navigate amazon main page")
    public void navigate_amazon_main_page() {
        String url = ConfigurationReader.getProperty("amazonURL");
        Driver.getDriver().get(url);
    }

    @When("navigate sing in button")
    public void navigate_sing_in_button()  {
        BrowserUtils.hover(amazonPage.navigateSingIn);
        BrowserUtils.waitForVisibility(amazonPage.singInButton, 5);
        amazonPage.singInButton.click();
    }


    @When("user enters username")
    public void user_enters_username() {

    }

    @When("user enters password")
    public void user_enters_password() {

    }

    @Then("user should see dashboard")
    public void user_should_see_dashboard() {

    }
}
