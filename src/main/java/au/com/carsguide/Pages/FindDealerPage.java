package au.com.carsguide.Pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class FindDealerPage extends Utility {
    private static final Logger log = LogManager.getLogger(FindDealerPage.class.getName());
    public FindDealerPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='dealer-heading row']")
    WebElement getMessage;

    @CacheLookup
    @FindBy (xpath = "//div[@class='dealerListings--name']")
    List<WebElement> dealers;

    public void VerifyNavigateToCarDealerPage(String message){
        String actualText=getTextFromElement(getMessage);
        String expectedText=(message);
        Assert.assertTrue(actualText.contains(expectedText));
        log.info("Verifying car make in search result "+ message +getMessage.getText());
    }

    public void verifyDealerNames(String list){
        for(WebElement dealerName:dealers){
            if(list==dealerName.getText()){
                Assert.assertTrue(true);
                log.info("Verifying dealers name from the lost "+ list);
            }else Assert.assertTrue(false);
        }
    }
}
