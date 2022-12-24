package au.com.cucumber.steps;

import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.SearchPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuySteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on \"([^\"]*)\" tab$")
    public void iMouseHoverOnTab(String cars) {
        new HomePage().hoverOverBuySell();
    }

    @And("^I click \"([^\"]*)\" link$")
    public void iClickLink(String arg0)  {
        new HomePage().clickOnSearchCars();
    }

    @Then("^I naviage to \"([^\"]*)\" page$")
    public void iNaviageToPage(String arg0)  {

    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String k) {
       new SearchPage().selectMake(k);
    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String d)  {
        new SearchPage().selectModel(d);
    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String l)  {
        new SearchPage().selectLocation(l);
    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String p)  {
       new SearchPage().selectPrice(p);
    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new SearchPage().clickOnFindMyNextCar();
    }

    @Then("^I should see the make \"([^\"]*)\" in result$")
    public void iShouldSeeTheMakeInResult(String result)  {
        new SearchPage().verifyTheResult(result);
         }

    @When("^I mouse hover on \"([^\"]*)\" tab to find used car$")
    public void iMouseHoverOnTabToFindUsedCar(String Ucar)  {
       new HomePage().hoverOverBuySell();
    }

    @And("^I click button which is below search cars\"([^\"]*)\"$")
    public void iClickButtonWhichIsBelowSearchCars(String arg0)  {
        new HomePage().clickOnUsed();
    }

    @Then("^I navigate to \"([^\"]*)\" page where used cars can be found$")
    public void iNavigateToPageWhereUsedCarsCanBeFound(String arg0)  {
            }

    @And("^I select make \"([^\"]*)\" from the drop down menu$")
    public void iSelectMakeFromTheDropDownMenu(String uk)  {
        new SearchPage().selectMake(uk);
    }

    @And("^I select model\"([^\"]*)\" from the drop down menu$")
    public void iSelectModelFromTheDropDownMenu(String um)  {
       new SearchPage().selectModel(um);
    }

    @And("^I select locatoin \"([^\"]*)\" from the drop down menu$")
    public void iSelectLocatoinFromTheDropDownMenu(String ul) {
        new SearchPage().selectLocation(ul);
    }

    @And("^I select price \"([^\"]*)\" from the drop down menu$")
    public void iSelectPriceFromTheDropDownMenu(String up)  {
     new SearchPage().selectPrice(up);
    }

    @And("^I click on Find My Next Car tab to find used car$")
    public void iClickOnFindMyNextCarTabToFindUsedCar() {
        new SearchPage().clickOnFindMyNextCar();
    }

    @Then("^I should see the make \"([^\"]*)\" in results as per my preference$")
    public void iShouldSeeTheMakeInResultsAsPerMyPreference(String result)  {
    new SearchPage().verifyTheResult(result);
    }
}
