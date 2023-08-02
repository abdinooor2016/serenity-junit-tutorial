package serenityswag.authentication.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import serenityswag.authentication.User;

public class LoginActions extends UIInteractionSteps {


    @Step("Log in as {0}")
    public void as(User user) {
        openUrl("https://www.saucedemo.com/");

        //Serenity classes
//        $("#user-name").sendKeys(user.getUsername());
//        $("#password").sendKeys(user.getPassword());
//        $("#login-button").click();

        $(LoginForm.USER_NAME).sendKeys(user.getUsername());
        $(LoginForm.PASSWORD).sendKeys(user.getPassword());
        $(LoginForm.LOGIN_BUTTON).click();



    }

}
