package StepDefinition;

import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

import java.util.List;

import static StepDefinition.LoginPageSteps.*;
import static StepDefinition.MainPageSteps.*;
import static StepDefinition.TaskNewPageSteps.*;
import static StepDefinition.TaskStatusPageSteps.*;
import static com.codeborne.selenide.Selenide.open;


public class TestCucumberSteps {

    // LoginPage
    @Когда("^вводим логин, пароль и нажимаем кнопку Войти")
    public void testLogin(List<String> testdata) {
        String name = testdata.get(0);
        String pass = testdata.get(1);
        open("https://edujira.ifellow.ru/");
        loginVal(name);
        passwordVal(pass);
        clickButtonLogIn();
    }

    @Тогда("^успешная авторизация")
    public void assertLogin(List<String> testdata) {
        String authorize = testdata.get(0);
        authorizeAssertion(authorize);
    }

    //MainPage
    @Когда("^проверяем общее количество задач")
    public void testNumberOfTasks() {
        clickToBrowse();
        clickToMainProj();
        clickToAllTasks();
    }

    @Тогда("^в консоль выводится общий счетчик задач")
    public void assertNumberOfTasks() {
        findTotalNumberOfTasks();
    }

    @Когда("^ищем задачу TestSelenium и проверяем статус, версию")
    public void testFindTaskTestSelenium() {
        findTaskTestSelenium();
        checkingStatus();
        checkingVersion();
    }

    @Тогда("^статус и версия имеют верные значения")
    public void assertTaskTestSelenium(List<String> testdata) {
        String status = testdata.get(0);
        String version = testdata.get(1);
        mainPageAssertion(status, version);
    }

    //TaskNewPage
    @Когда("^создаем новую задачу и заполняем все ее поля")
    public void testTaskNew(List<String> testdata) {
        String type = testdata.get(0);
        String theme = testdata.get(1);
        String info = testdata.get(2);
        String priority = testdata.get(3);
        String tag = testdata.get(4);
        String info2 = testdata.get(5);
        clickToCreateNewTask();
        setIssueType(type);
        setErrorTheme(theme);
        setErrInfo(info);
        setFixInVersions();
        setPriority(priority);
        setHashTag(tag);
        setMoreInfo(info2);
        setVersionsAffected();
        clickToAssignMe();
        clickSubmit();
    }

    @Тогда("^успешное создание задачи")
    public void assertTaskNew() {
        taskNewPageAssertion();
    }

    //TaskStatusPage
    @Когда("^меняем статус задачи")
    public void testTaskStatus(List<String> testdata) {
        String task = testdata.get(0);
        String status = testdata.get(1);
        clickToFindTask(task);
        clickToCheckStatus(status);
        clickToSetReady();
    }

    @Тогда("^успешное изменение статуса задачи")
    public void assertTaskStatus(List<String> testdata) {
        String checkStatus = testdata.get(0);
        checkFinalStatus1(checkStatus);
        checkFinalStatus2(checkStatus);
    }
}
