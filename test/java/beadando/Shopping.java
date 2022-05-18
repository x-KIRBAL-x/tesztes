package beadando;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Shopping extends AbstractStepDefs{

    @Given("click on dress")
    public void clickdress(){homePage.DressesClick();}

    @And("image click")
    public void imgclick(){homePage.clickImg();}

    @And("piece_reset")
    public void piecereset(){homePage.quantityW();}

    @And("filledpiece {string}")
    public void filledquantity(String arg0){ homePage.fillFieldid("quantity_wanted", arg0); }

    @And("sizeselect")
    public void sizesel(){homePage.sizeselect();}

    @When("add to cart")
    public void addcartclick(){homePage.addtocart();}

    @Then("price equals {string}")
    public void eq(String arg0){
        Assert.assertEquals(arg0, homePage.priceeq());
    }

    @And("back")
    public void shopback(){homePage.backshopp();}


}
