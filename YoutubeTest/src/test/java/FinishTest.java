
import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;


import org.junit.runner.RunWith;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import ru.antipov.autotest.pages.BasePage;
import ru.antipov.autotest.pages.RegistrationPage;
import ru.antipov.autotest.steps.*;


public class FinishTest extends BaseSteps{


    MainSteps mainSteps = new MainSteps();
    RegistrationSteps registrationSteps  = new RegistrationSteps();
    SearchSteps searchSteps = new SearchSteps();
    MediaSteps mediaSteps = new MediaSteps();



    @Test
    public void testFinish() throws Exception {

        mainSteps.selectMenuItem("Войти");
        registrationSteps.fillField("identifier","antipant@mail.ru");
        mainSteps.selectMenuItem("Далее");
        registrationSteps.fillField("password","asdfqwer");
        mainSteps.selectMenuItem("Далее");
        mainSteps.selectMenuItem("Добавить видео");
        mainSteps.selectMenuItem("Выберите файлы, которые хотите загрузить");
        mediaSteps.fillField("input[type=\"file\"]","мануфактоиря.avi");
        mediaSteps.fillField("textarea[name=\"description\"]","Обучающее видео");
        mediaSteps.fillField("input.video-settings-add-tag","ВавапрогерУра");
        mainSteps.selectMenuItem("Опубликовать");
        mainSteps.selectMenuItem("Главная страница YouTube");
        searchSteps.fillField("Введите запрос","мануфактоиря");
        mainSteps.selectMenuItem("Введите запрос");
        mainSteps.selectMenuItem("мануфактоиря");
        mainSteps.selectMenuItem("button.ytp-play-button.ytp-button");
        searchSteps.checkErrorMessageField("Александр Антипов","Александр Антипов");

    }


}
