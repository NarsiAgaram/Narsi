package com.rsc.tech.test.pages;

import com.rsc.tech.test.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ResultsPage extends DriverManager {

    public static String selectedProduct = "";
    public static String selectedFilter;

    @FindBy(css = "div[data-qa='description']")
    private List<WebElement> selectProduct;

    @FindBy(css = "div.itemContainer_1YK1wDwq>span")
    private List<WebElement> allFilters;

    public List<String> getListofAllProducts() {
        List<String> list = new ArrayList<>();
        for (WebElement product : selectProduct) {
            list.add(product.getText().toLowerCase());
        }
        return list;
    }

    public void selectAnyProductFromList() {
        Random random = new Random();
        int n = random.nextInt(selectProduct.size());
        selectedProduct = selectProduct.get(n).getText();
        selectProduct.get(n).click();
    }

    public void selectFilter(String filterChoice) {
        selectedFilter = filterChoice;
        for (WebElement filter : allFilters) {
            if (filter.getText().startsWith(filterChoice)) {
                filter.click();
                break;
            }
        }
    }
}
