package serenityswag.inventory;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementState;
import org.openqa.selenium.By;

public class ProductDetailsPageObject extends PageObject {

    public String productName() {
        return $(".inventory_details_name").getText();
    }

    public WebElementState productImageWithAltValuesOf(String firstItemName) {
        return $(".inventory_details_container img[alt=" + firstItemName +"]");
    }
}
