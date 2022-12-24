package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends Utility {

    private static final Logger log = LogManager.getLogger(SearchPage.class.getName());

 public SearchPage()   {
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement anyMake;

    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement anyModel;

    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement anyLocation;

    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement price;

    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement findMyNextCar;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'We did find these cars that almost match your crit')]")
    WebElement results;

    public void selectMake(String make){
        selectByVisibleTextFromDropDown(anyMake,make);
        log.info("Selecting make from drop down :" + anyMake);
    }

    public void selectModel(String model){
        selectByValueFromDropDown(anyModel,model);
        log.info("Selecting model from drop down :" + anyModel);
    }

    public void selectLocation(String location){
        selectByVisibleTextFromDropDown(anyLocation,location);
        log.info("Selecting location from drop down :" + anyLocation);
    }
    public void selectPrice(String p){
        selectByVisibleTextFromDropDown(price,p);
        log.info("Selecting price from drop down :" + price);
    }
    public void clickOnFindMyNextCar(){
        clickOnElement(findMyNextCar);
        log.info("clicking on used :" + findMyNextCar);
    }

    public String verifyTheResult(String result){
        log.info("verifying the result :" + results);
        return results.getText();
    }

}


