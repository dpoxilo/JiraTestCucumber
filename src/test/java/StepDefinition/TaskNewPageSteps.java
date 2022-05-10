package StepDefinition;

import PageObject.TaskNewPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class TaskNewPageSteps extends TaskNewPage {
    public static void clickToCreateNewTask() {
        createNewTask.shouldBe(visible, Duration.ofSeconds(60)).click();
    }

    public static void setIssueType(String type) {
        issueType.sendKeys(type);
        issueType.pressEnter();
    }

    public static void setErrorTheme(String theme) {
        errorTheme.shouldBe(visible, Duration.ofSeconds(60)).click();
        errorTheme.setValue(theme);
    }

    public static void setErrInfo(String info) {
        Selenide.switchTo().defaultContent();
        SelenideElement iframe = errorInfo;
        Selenide.switchTo().frame(iframe);
        $x("//body[@id='tinymce']/p").sendKeys(info);
        Selenide.switchTo().defaultContent();
    }

    public static void setFixInVersions() {
        fixInVersions.doubleClick();
    }

    public static void setPriority(String priority) {
        prior.shouldBe(visible, Duration.ofSeconds(60)).click();
        prior.sendKeys(priority);
        prior.pressEnter();
    }

    public static void setHashTag(String tag) {
        hashTag.sendKeys(tag);
        hashTag.pressEnter();
    }

    public static void setMoreInfo(String info2) {
        Selenide.switchTo().defaultContent();
        SelenideElement iframe = moreInfo;
        Selenide.switchTo().frame(iframe);
        $x("//body[@id='tinymce']/p").sendKeys(info2);
        Selenide.switchTo().defaultContent();
    }

    public static void setVersionsAffected() {
        versionsAffected.shouldBe(visible, Duration.ofSeconds(60)).doubleClick();
    }

    public static void clickToAssignMe() {
        assignMe.shouldBe(visible, Duration.ofSeconds(60)).click();
    }

    public static void clickSubmit() {
        submit.shouldBe(visible, Duration.ofSeconds(60)).click();
    }

    //Assert
    public static void taskNewPageAssertion() {
        newTaskAssert.shouldHave(Condition.visible);
    }
}

