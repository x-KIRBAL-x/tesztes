package beadando;

import io.cucumber.java.en.Given;

public class CommonStepDefs extends AbstractStepDefs{
    @Given("open home page")
    public void theHomePageIsOpened() {
        homePage.openPage();
    }

    @Given("Click On xpath {string}")
    public void xpathclick(String xpath){homePage.onClickxpath(xpath);}

    @Given("Click on id {string}")
    public void idclick(String id){homePage.onClickid(id);}

}
