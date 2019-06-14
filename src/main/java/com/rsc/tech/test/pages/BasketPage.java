package com.rsc.tech.test.pages;

import com.rsc.tech.test.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class BasketPage extends DriverManager {

    @FindBy(css = ".descriptionTd>div>a")
    private List<WebElement> prodcutNames;

    @FindBy(linkText = "Remove")
    private WebElement removeLink;

    @FindBy(css = ".updateAllContainer>div>a>span")
    private WebElement update;

    @FindBy(css = "#confirmDeleteContinue>span")
    private WebElement confirm;

    public List<String> getItemsInBasket(){
        List<String> products=new ArrayList<>();

        for (WebElement item:prodcutNames){
            products.add(item.getText());
        }
        return products;
    }

    public void removeProduct(){
        waitForElementToBeClickAble(removeLink).click();
        Actions actions=new Actions(driver);
        actions.moveToElement(update).build().perform();
        confirm.click();
        sleep(3000);
    }
}
