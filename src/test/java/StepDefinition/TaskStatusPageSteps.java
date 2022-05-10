package StepDefinition;

import PageObject.TaskStatusPage;
import com.codeborne.selenide.Condition;
import org.junit.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class TaskStatusPageSteps extends TaskStatusPage {
    public static void clickToFindTask(String task) {
        findTask.shouldBe(visible, Duration.ofSeconds(60)).click();
        findTask.setValue(task).pressEnter();
    }

    public static void clickToCheckStatus(String status) {
        statusCheck.shouldBe(visible, Duration.ofSeconds(60)).click();
        statusCheck.shouldHave(Condition.text(status));
    }

    public static void clickToSetReady() {
        setReady.shouldBe(visible, Duration.ofSeconds(60)).click();
        $x("//span[text()='Выполнено']").click();
    }

    //Assert
    public static void checkFinalStatus1(String checkStatus) {
        while (!taskStatusCheck.getText().equals(checkStatus)) {
            taskStatusCheck.getText();
        }
        Assert.assertEquals("Статус задачи не верный", checkStatus, taskStatusCheck.getText());
    }

    public static void checkFinalStatus2(String checkStatus) {
        taskStatusCheck.shouldHave(Condition.text(checkStatus));
    }
}
