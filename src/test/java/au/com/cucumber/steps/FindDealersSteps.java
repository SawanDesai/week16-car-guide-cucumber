package au.com.cucumber.steps;

import au.com.carsguide.pages.FindDealerPage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.xmlbeans.impl.common.SoftCache;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class FindDealersSteps {
    @When("^I click \"([^\"]*)\"$")
    public void iClick(String url)  {
        new FindDealerPage().verifyCarDealersPage(url);
         }

    @And("^I should see the dealer names \"([^\"]*)\" are display on page$")
    public void iShouldSeeTheDealerNamesAreDisplayOnPage(DataTable dataTable)  {
        List<String> dealerName = dataTable.asList(String.class);
        SoftAssert softAssertions = new SoftAssert();
        for (int i = 1; i <= dealerName.size()- 1; i++){
            softAssertions.assertTrue(new FindDealerPage().isDealerDisplayed(dealerName.get(i)),"'"+dealerName.get(i)+"'dealer not found");
        }
        softAssertions.assertAll();
         }
}
