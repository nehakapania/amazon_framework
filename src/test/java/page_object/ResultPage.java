package page_object;

import driver.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultPage extends DriverHelper {
    public static String searchedItem;
    public static String searchedHeaderName;
    public static String selectedBrand;

    @FindBy(css = "#twotabsearchtextbox")
    private WebElement searchBox;

    public void doSearch(String item) {
        searchedItem = item;
        searchBox.sendKeys(item, Keys.ENTER);
        // driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(item,Keys.ENTER);
    }
    @FindBy(css=".bxw-pageheader__title__text")
    private WebElement headerName;
    public  String getProductHeader()
    {
    searchedHeaderName = headerName.getText();
    return searchedHeaderName;
    }

   // @FindBy(css = ".left_nav.browseBox")
   // @FindBy(xpath = "//*[@id=\"a-page\"]/div[4]/div/div[2]/div/div[1]/div[1]/ul[2]")
   // @FindBy(css =".a-fixed-left-grid-inner" )
    @FindBy(tagName = "li")
        private List<WebElement> brandFilters;
    public void selectAProductByBrand(String customerSelectedBrand)
    {
        for(WebElement brandFilter:brandFilters)
        {
            if(brandFilter.getText().equalsIgnoreCase(customerSelectedBrand))
            {
                selectedBrand=customerSelectedBrand;
               // clickOnHiddenProduct(brandFilter).click();
                brandFilter.click();
                break;
            }
        }
    }
    @FindBy(css=".left_nav.browseBox")
    private List<WebElement> productBrandFilters;
    public void selectAProductBrandBYRandomGenerator()
    {
        productBrandFilters.size();

    }
    @FindBy(tagName = "li")
    List<WebElement> listOfProducts;
    public void selectAProductRandomly()
    {
        for (WebElement listOfProduct:listOfProducts)
        {
            listOfProducts.size();
            System.out.println(listOfProducts);
            String linksOfProducts=listOfProduct.getText();
            System.out.println(linksOfProducts);
        }
    }
}


