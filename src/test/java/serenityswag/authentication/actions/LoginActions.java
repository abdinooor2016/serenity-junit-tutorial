package serenityswag.authentication.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import serenityswag.authentication.User;

public class LoginActions extends UIInteractionSteps {


    @Step("Log in as {0}")
    public void as(User user) {
        open("https://www.saucedemo.com/");

        //Serenity classes
        $("[data-test='username']").sendKeys(user.getUsername());
        $("[data-test='password']").sendKeys(user.getPassword());
        $("[data-test='login-button']").click();

    }


}
