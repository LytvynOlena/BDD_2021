package net.amazon.step_definitionsK;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.amazon.Util.BrowserUtils;
import net.amazon.Util.ConfigurationReader;
import net.amazon.Util.Driver;
import net.amazon.pagesK.AmazonLogin;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login_AmazonK {

    AmazonLogin amazonLogin = new AmazonLogin();

@Test
    @Given("user is on main page")
    public void user_is_on_main_page() {
        String url = ConfigurationReader.getProperty("amazonURL");
        Driver.getDriver().get(url);
    }
@Test
    @When("user navigates to sign in button in upper right corner")
    public void userNavigatesToSignInButtonInUpperRightCorner(){

    BrowserUtils.waitForVisibility(amazonLogin.signIn_button,3);

        amazonLogin.signIn_button.click();
    }

    @When("user enters username")
    public void user_enters_username() {
     // String username =
    }
    @When("user enters password")
    public void user_enters_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should see dashboard")
    public void user_should_see_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
