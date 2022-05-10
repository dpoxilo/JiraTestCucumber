package StepDefinition;

import PageObject.MainPage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class MainPageSteps extends MainPage {
    public static void clickToBrowse() {
        browseLink.shouldBe(visible, Duration.ofSeconds(60)).click();
    }

    public static void clickToMainProj() {
        mainProj.shouldBe(visible, Duration.ofSeconds(60)).click();
    }

    public static void clickToAllTasks() {
        allTasks.shouldBe(visible, Duration.ofSeconds(60)).click();
    }

    //Assert
    public static void findTotalNumberOfTasks() {
        findText.shouldHave(text("1"));
        System.out.println("Общее количество заведенных задач в проекте:" + " " + findText.getText());
    }

    public static void findTaskTestSelenium() {
        enterTextElement.shouldBe(visible, Duration.ofSeconds(60)).click();
        enterTextElement.setValue("TestSelenium").pressEnter();
    }

    public static void checkingStatus() {
        checkStatus.shouldBe(visible, Duration.ofSeconds(60));
        System.out.println("Задача TestSelenium имеет статус:" + " " + checkStatus.getText());
    }

    public static void checkingVersion() {
        versionCheck.shouldBe(visible, Duration.ofSeconds(60));
        System.out.println("Задача TestSelenium имеет привязку в затронутой версии:" + " " + versionCheck.getText());
    }

    //Assert
    public static void mainPageAssertion(String status, String version) {
        findText.shouldBe(visible, Duration.ofSeconds(60));
        checkStatus.shouldHave(text(status));
        versionCheck.shouldHave(text(version));
    }
}
