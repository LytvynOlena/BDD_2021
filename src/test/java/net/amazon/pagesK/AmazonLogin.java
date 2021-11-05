package net.amazon.pagesK;

import net.amazon.Util.Driver;
import net.amazon.step_definitionsK.Login_AmazonK;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLogin {

    public AmazonLogin() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className= "nav-action-inner")
    public WebElement signIn_button;


    @FindBy(id="ap_email")
    public WebElement emailInput;



}
