package beadando;

import io.cucumber.java.en.Given;

public class CreateAccount extends AbstractStepDefs{

    @Given("Click SignIn")
    public void clickSing(){homePage.signin();}

    @Given("fill {string} field with {string}")
    public void fillWithText(String field, String parameter) {
        homePage.fillFieldid(field, parameter);
    }
}