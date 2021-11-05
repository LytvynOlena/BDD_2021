package net.amazon.pagesOlena;

import net.amazon.Util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAmazonPage {

    public LoginAmazonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "nav-link-accountList")
    public WebElement navigateSingIn;

    @FindBy(xpath = "//span[@class='nav-action-inner']")
    public WebElement singInButton;

}
