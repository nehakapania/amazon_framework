package step_def;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_object.ResultPage;

public class FilterSteps
{
    private ResultPage resultPage=new ResultPage();

    @When("^I select a filter \"([^\"]*)\"$")
    public void i_select_a_filter(String customerSelectedBrand)
    {
      resultPage.selectAProductByBrand(customerSelectedBrand);
        //resultPage.selectAProductBrandBYRandomGenerator();


    }

    @Then("^I should see respective brand products$")
    public void i_should_see_respective_brand_products() {

    }

}
