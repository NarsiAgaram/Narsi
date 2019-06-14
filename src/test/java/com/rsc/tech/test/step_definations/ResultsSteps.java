package com.rsc.tech.test.step_definations;

import com.rsc.tech.test.pages.HomePage;
import com.rsc.tech.test.pages.ResultsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.everyItem;

public class ResultsSteps {

    ResultsPage resultspage = new ResultsPage();

    @When("^I will select a product$")
    public void i_will_select_a_product() {
        resultspage.selectAnyProductFromList();
    }

    @And("^I set filer to \"([^\"]*)\"$")
    public void iSetFilerTo(String filter) {
        resultspage.selectFilter(filter);
    }

    @Then("^I should be able to see results are filtered$")
    public void iShouldBeAbleToSeeResultsAreFiltered() {
        assertThat(resultspage.getListofAllProducts(), everyItem(containsString(ResultsPage.selectedFilter)));
    }
}
