package beadando;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Search extends AbstractStepDefs{

    @Given("fill {string} search with {string}")
    public void fillWithText(String path, String parameter) {
        homePage.fillFieldxpath(path, parameter);
    }

    @When("click on search button")
    public void search(){ homePage.clicksearch();}

    @Then("{string} message is show")
    public void alertshow(String arg0){
        Assert.assertEquals(arg0, homePage.alertequals());
    }
}
