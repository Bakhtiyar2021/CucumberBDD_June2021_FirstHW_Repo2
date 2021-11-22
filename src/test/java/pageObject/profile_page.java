package pageObject;

import base.SetUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class profile_page extends SetUp {

    public profile_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        SetUp.driver = driver;
    }


    // locators
    @FindBy(how = How.XPATH, using = "//*[@id='profile_form']/legend")
    public org.openqa.selenium.WebElement welcomemessage;

    // Function
    public void setwelcomemessage() {
        String ex = "Welcome to TalentTek";
        String ac = welcomemessage.getText();
        Assert.assertEquals(ex, ac);
    }
}