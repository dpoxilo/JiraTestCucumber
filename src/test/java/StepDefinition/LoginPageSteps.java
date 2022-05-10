package StepDefinition;

import PageObject.LoginPage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;

public class LoginPageSteps extends LoginPage {
    public static void loginVal(String name) {
        loginJira.shouldBe(visible, Duration.ofSeconds(60)).click();
        loginJira.setValue(name);
    }

    public static void passwordVal(String pass) {
        passwordJira.shouldBe(visible, Duration.ofSeconds(60)).click();
        passwordJira.setValue(pass);
    }

    public static void clickButtonLogIn() {
        buttonLogIn.shouldBe(visible, Duration.ofSeconds(60)).click();
    }

    //Assert
    public static void authorizeAssertion(String authorize) {
        authorizeAssert.shouldBe(visible);
        authorizeAssert.shouldHave(attribute("alt", authorize));
    }
}
