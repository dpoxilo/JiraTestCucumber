package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TaskStatusPage {
    public static SelenideElement findTask = $x("//*[@id='quickSearchInput']");
    public static SelenideElement statusCheck = $x("//span[text()='Сделать']");
    public static SelenideElement setReady = $x("//span[text()='Бизнес-процесс']");
    public static SelenideElement taskStatusCheck = $x("//span[@id='status-val']");
}
