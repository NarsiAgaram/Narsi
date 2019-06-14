package com.rsc.tech.test.step_definations;

import com.rsc.tech.test.pages.BasketPage;
import com.rsc.tech.test.pages.ProductPage;
import com.rsc.tech.test.pages.ResultsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

public class BasketSteps {

    ProductPage productPage=new ProductPage();
    BasketPage basketPage=new BasketPage();

    @When("^I will add product to basket$")
    public void i_will_add_product_to_basket() {
        productPage.addToBasket();
    }

    @When("^I will view the basket$")
    public void i_will_view_the_basket() {
        productPage.goToBasket();
    }

    @Then("^I should be able to see the product added to basket$")
    public void i_should_be_able_to_see_the_product_added_to_basket() {
        assertThat(basketPage.getItemsInBasket(), Matchers.contains(ResultsPage.selectedProduct));
    }

    @And("^I remove the product from basket$")
    public void iRemoveTheProductFromBasket() {
        basketPage.removeProduct();
    }

    @Then("^I should see product is removed from basket$")
    public void iShouldSeeProductIsRemovedFromBasket() {
        assertThat(basketPage.getItemsInBasket(), is(not(contains(ResultsPage.selectedProduct))));
    }
}
