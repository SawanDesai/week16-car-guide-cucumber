package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='buy + sell']")
    WebElement buyandsell;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Search Cars']")
    WebElement searchcars;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Used']")
    WebElement used;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Find a Dealer']")
    WebElement findDealer;

    public void hoverOverBuySell(){
        mouseHoverToElement(buyandsell);
        log.info("Mouse Hover No Click: " + buyandsell);
    }
    public void clickOnSearchCars(){
        mouseHoverToElement(searchcars);
        log.info("clicking on search cars :" + searchcars);
    }

    public void clickOnUsed(){
        clickOnElement(used);
        log.info("clicking on Used :"+ used);
    }
    public void ClickonFindADealer(){
        clickOnElement(findDealer);
        log.info("clicking on find a dealer :" + findDealer);
    }

}
