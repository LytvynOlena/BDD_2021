package net.amazon.pagesK;

import net.amazon.Util.Driver;
import net.amazon.step_definitionsK.Login_AmazonK;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonMain {

    public AmazonMain() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    //css = "a[id='nav-link-accountList']"
    //partialLinkText = "https://www.amazon.com"---->> DOES NOT WORK!!!
    //id = "nav-link-accountList"
    @FindBy(id = "nav-link-accountList")
    public WebElement hello_SignIn;

    @FindBy(xpath = "//span[@class='nav-action-inner']")
    public WebElement signIn_button;


    @FindBy(id = "ap_email")
    public WebElement emailInput;





}
