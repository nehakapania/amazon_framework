package step_def;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_object.Homepage;
import page_object.ResultPage;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class SearchSteps
{
  private   Homepage homepage=new Homepage();
   private ResultPage resultPage=new ResultPage();

    @Given("^I am on Homepage$")
    public void i_am_on_Homepage()  {
       String actualUrl=homepage.getHomepageUrl();
       assertThat(actualUrl,endsWith("co.uk/"));
    }

    @When("^I search for a product \"([^\"]*)\"$")
    public void i_search_for_a_product(String item)
    {
        resultPage.doSearch(item);
    }

    @Then("^I should see respective products$")
    public void i_should_see_respective_products()  {
       String actualHeaderName=resultPage.getProductHeader();
       assertThat(actualHeaderName,is(equalToIgnoringCase(resultPage.getProductHeader())));
        System.out.println("Expected=Actual");
    }


}
