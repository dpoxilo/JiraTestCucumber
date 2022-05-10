package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    public static SelenideElement loginJira = $x("//*[@id='login-form-username']");
    public static SelenideElement passwordJira = $x("//*[@id='login-form-password']");
    public static SelenideElement buttonLogIn = $x("//*[@id='login']");
    public static SelenideElement authorizeAssert = $x("//img[contains(@alt,'dpohilo')]");
}
