package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    public static SelenideElement browseLink = $x("//*[@id='browse_link']");
    public static SelenideElement mainProj = $x("//*[@id='admin_main_proj_link_lnk']");
    public static SelenideElement allTasks = $x("//a[text()='Посмотреть все задачи и фильтры']");
    public static SelenideElement findText = $x("//span[starts-with(text(), '1')]");
    public static SelenideElement enterTextElement = $x("//*[@id='searcher-query']");
    public static SelenideElement checkStatus = $x("//*[@id='status-val']/span");
    public static SelenideElement versionCheck = $x("//*[@id='versions-field']/span");
}
