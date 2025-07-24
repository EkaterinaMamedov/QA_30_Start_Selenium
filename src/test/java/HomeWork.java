import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork {

    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssSelectors() {
        //by tagName
        WebElement form = wd.findElement(By.tagName("form"));
        WebElement button = wd.findElement(By.tagName("button"));
        WebElement input = wd.findElement(By.tagName("input"));
        WebElement a = wd.findElement(By.tagName("a"));
        WebElement phonebook = wd.findElement(By.tagName("h1"));

        List<WebElement> listA = wd.findElements(By.tagName("a"));
        List<WebElement> listInput = wd.findElements(By.tagName("input"));
        List<WebElement> listButton = wd.findElements(By.tagName("button"));

        //by name
        WebElement inputEmail = wd.findElement(By.name("email"));
        WebElement inputPassword = wd.findElement(By.name("password"));
        WebElement buttonLog = wd.findElement(By.name("login"));
        WebElement buttonReg = wd.findElement(By.name("registration"));
        //by className
        WebElement classNameForm = wd.findElement(By.className("login_login__3EHKB"));
        WebElement classNameHeaderAll = wd.findElement(By.className("container"));
        WebElement classNameHeader = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        //by id
        WebElement id = wd.findElement(By.id("root"));
        //by text
        // WebElement text = wd.findElement(By.linkText("PHONEBOOK"));
//by cssSelector
        WebElement home = wd.findElement(By.cssSelector("a[href='/home']"));
        WebElement about = wd.findElement(By.cssSelector("a[href='/about']"));
        WebElement loginHeder = wd.findElement(By.cssSelector("a[href='/login']"));


    }

    @AfterClass
    public void postCondition() {
        wd.close();
    }
}
