package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.webaudio.WebAudio;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import java.util.List;
public class FindDealerPage extends Utility {
    private static final Logger log = LogManager.getLogger(FindDealerPage.class.getName());
    public FindDealerPage(){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='listing-pagination']//ul[@class='listing-pagination-list']")
    WebElement pagesNumbersLink;

    @CacheLookup
    @FindBy(xpath = "//div[@class='dealerListing--name']//a")
    List<WebElement> dealerNames;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Next']")
    WebElement nextButton;

    public boolean isDealerDisplayed(String dealer) {
        boolean myBreak = true;
        boolean isDisplayed = false;
        while (myBreak) {
            for (WebElement e : dealerNames) {
                if (e.getText().equalsIgnoreCase(dealer)) {
                    System.out.println(e.getText());
                    isDisplayed = true;
                    myBreak = false;
                    break;
                }
            }
            if (myBreak) {
                if (!driver.getCurrentUrl().contains("page363")) {
                    nextButton.click();
                } else {
                    isDisplayed = false;
                    myBreak = false;
                }
                PageFactory.initElements(driver, this);
            }
        }
        driver.navigate().to("https://www.carsguide.com.au/car-dealers");
        return isDisplayed;
    }

    public void verifyCarDealersPage(String url) {
        String actual = driver.getCurrentUrl();
        boolean expected = actual.contains(url);
        Assert.assertTrue(expected);
        log.info("verifying find dealers url: '" + actual + "'");
    }
}