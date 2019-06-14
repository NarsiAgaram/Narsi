package com.rsc.tech.test.step_definations;

import com.rsc.tech.test.driver.DriverManager;
import com.rsc.tech.test.pages.HomePage;
import com.rsc.tech.test.pages.ResultsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SearchSteps extends DriverManager {

    HomePage homepage = new HomePage();
    ResultsPage resultsPage=new ResultsPage();

    @Given("^I navigate to homepage$")
    public void i_navigate_to_homepage() {
        assertThat(homepage.isUserOnHomePage(),is(endsWith("online.com/web/")));
    }

    @When("^I search for a item \"([^\"]*)\"$")
    public void i_search_for_a_item(String item) {
        homepage.SearchProduct(item);
    }

    @Then("^I should be able to see results$")
    public void i_should_be_able_to_see_results() {
        assertThat(resultsPage.getListofAllProducts(),everyItem(containsString(HomePage.searchedItem)));
    }
}
