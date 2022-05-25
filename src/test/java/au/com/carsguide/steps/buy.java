package au.com.carsguide.steps;

import au.com.carsguide.Pages.HomePage;
import au.com.carsguide.Pages.NewAndUsedCarSearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class buy {
    @When("^I mouse hover on 'buy \\+ sell' tab$")
    public void iMouseHoverOnBuySellTab() throws InterruptedException {
        new HomePage().mouseHoverToBuySellTab();
    }

    @When("^I click ‘Search Cars’ link$")
    public void iClickSearchCarsLink() {
        new HomePage().clickOnSearchCarLink();
    }

    @Then("^I navigate to ‘new and used car search’ page$")
    public void iNavigateToNewAndUsedCarSearchPage() {
    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make) {
        new NewAndUsedCarSearchPage().selectCarMakeFromDropDown(make);

    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model) {
        new NewAndUsedCarSearchPage().selectModelFromDropDown(model);
    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location) {
        new NewAndUsedCarSearchPage().selectLocationFromDropDown(location);
    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price) {
        new NewAndUsedCarSearchPage().selectMaxPriceFromDropDown(price);
    }

    @And("^I click on 'Find My Next Car' tab$")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarSearchPage().clickOnFindMyNextCarButton();
    }

    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String make) {
    new NewAndUsedCarSearchPage().verifyTitle(make);
    }

    @When("^I click ‘Used’ link$")
    public void iClickUsedLink() {
        new HomePage().clickOnUsedLink();
    }

    @Then("^I navigate to ‘Used Cars For Sale’ page$")
    public void iNavigateToUsedCarsForSalePage() {
    }
}
