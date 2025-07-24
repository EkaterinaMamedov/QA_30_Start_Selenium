import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StartSelenium {

    WebDriver wd;// веб драйвер

    @Test
    public void test() {
        wd = new ChromeDriver();// инициализируем его
       // wd.get("https://telranedu.web.app/");//открытие браузера и запуск страницы открывается сайт но не сохранияется история переходов
        wd.navigate().to("https://telranedu.web.app/");//открытие браузера и запуск страницы запоминается история переходов навигация
        wd.navigate().back();// перейти назад на какуюто страницу
        wd.navigate().forward();//перейти вперед  на какуюто страницу
        wd.navigate().refresh();// обновление страницы
       // wd.close();//закрытие браузера закроет только одну вкладку
        wd.quit();//закрытие браузера закроет все

    }


}
