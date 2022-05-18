package beadando;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private static final String PAGE_URL = "http://automationpractice.com/index.php";

    ////*[@id="center_column"]/p

    @FindBy(className = "login")
    private WebElement Signinbutton;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    private WebElement Dressclick;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img")
    private WebElement clickimg;

    @FindBy(id = "quantity_wanted")
    private WebElement quantity;

    @FindBy(xpath = "//*[@id=\"group_1\"]")
    private WebElement size;

    @FindBy(xpath = "//*[@id=\"group_1\"]/option[2]")
    private WebElement sizem;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button/span")
    private WebElement addcart;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[3]/span[text()='$205.96']")
    private WebElement price;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")
    private WebElement backshop;

////*[@id="center_column"]/p  <p class="alert alert-warning">
//					Please enter a search keyword        0 results have been found.
    /*@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div[2]/p[text()='Please enter a search keyword']")
    private WebElement alert;*/

    //@FindBy(xpath = "//*[@id=\"newsletter_block_left\"]/h4[text()='Newsletter']")
//    @FindBy(css = "#center_column > h1 > span[text()=' Please enter a search keyword ']")


    @FindBy(xpath = "//*[@id=\"center_column\"]/p[text()=' Please enter a search keyword ']")
    private WebElement alert;

    @FindBy(xpath = "//*[@id=\"searchbox\"]/button")
    private WebElement searchbutton;

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public void openPage() {
        this.driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void DressesClick() {this.Dressclick.click();}

    public void clickImg(){this.clickimg.click();}

    public void quantityW(){this.quantity.click(); this.quantity.clear();}

    public void fillFieldid(String field, String value) {
        getField(By.id(field)).sendKeys(value);
    }

    public void fillFieldxpath(String path, String value) { getField(By.xpath(path)).sendKeys(value);
    }

    public void onClickxpath(String path){getField(By.xpath(path)).click();}

    public void onClickid(String id){getField(By.id(id)).click();}

    public String priceeq(){return this.price.getText();}

    public String alertequals(){return this.alert.getText();}

    public WebElement getField(By locator) {
        return driver.findElement(locator);
    }

    public void backshopp(){this.backshop.click();}

    public void sizeselect(){this.size.click();this.sizem.click();}

    public void addtocart(){this.addcart.click();}

    public void clicksearch(){this.searchbutton.click();}

    public void signin(){this.Signinbutton.click();}
}

