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
        System.out.println("form role-->" + form.getAriaRole());
        WebElement button = wd.findElement(By.tagName("button"));
        System.out.println("button name-->" + button.getAttribute("name"));
        WebElement input = wd.findElement(By.tagName("input"));
        System.out.println("input name-->" + input.getAttribute("name"));

        List<WebElement> listInput = wd.findElements(By.tagName("input"));
       for(WebElement i : listInput){
           System.out.println("input name-->" + i.getAttribute("name"));
       }
        List<WebElement> listButton = wd.findElements(By.tagName("button"));
        for(WebElement b : listButton){
            System.out.println("button name-->" + b.getAttribute("name"));
        }

        //by name
        WebElement inputEmail = wd.findElement(By.name("email"));
        System.out.println("placeholder email-->" + inputEmail.getAttribute("placeholder"));
        WebElement inputPassword = wd.findElement(By.name("password"));
        System.out.println("placeholder password-->" + inputPassword.getAttribute("placeholder"));
        WebElement buttonLog = wd.findElement(By.name("login"));
        System.out.println("buttonLog name-->" + buttonLog.getAttribute("name"));
        WebElement buttonReg = wd.findElement(By.name("registration"));
        System.out.println("buttonReg name-->" + buttonReg.getAttribute("name"));

        //by className
        WebElement classNameForm = wd.findElement(By.className("login_login__3EHKB"));
        System.out.println("classNameForm-->" + classNameForm.getAttribute("class"));
        WebElement classNameHeaderAll = wd.findElement(By.className("container"));
        System.out.println("classNameHeaderAll-->" + classNameHeaderAll.getAttribute("class"));
        WebElement classNameHeader = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        System.out.println("classNameHeader-->" + classNameHeader.getAttribute("class"));

        //by id
        WebElement id = wd.findElement(By.id("root"));
        System.out.println("id class name-->" + id.getAttribute("class"));

        //by text
        // WebElement text = wd.findElement(By.linkText("PHONEBOOK"));
//by cssSelector
        WebElement home = wd.findElement(By.cssSelector("a[href='/home']"));
        System.out.println("home -->" + home.getAttribute("href"));
        WebElement about = wd.findElement(By.cssSelector("a[href='/about']"));
        System.out.println("about -->" + about.getAttribute("href"));
        WebElement loginHeder = wd.findElement(By.cssSelector("a[href='/login']"));
        System.out.println("loginHeder -->" + loginHeder.getAttribute("href"));
        WebElement phonebookCss = wd.findElement(By.cssSelector("h1"));
        System.out.println("phonebookCss -->" + phonebookCss.getAccessibleName());


    }

    @AfterClass
    public void postCondition() {
        wd.close();
    }
}
