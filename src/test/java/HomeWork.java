import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
    public void byTagName() {
        //by tagName
        WebElement form = wd.findElement(By.tagName("form"));
        System.out.println("form role-->" + form.getAriaRole());
        WebElement button = wd.findElement(By.tagName("button"));
        System.out.println("button name-->" + button.getAttribute("name"));
        WebElement input = wd.findElement(By.tagName("input"));
        System.out.println("input name-->" + input.getAttribute("name"));

        List<WebElement> listInput = wd.findElements(By.tagName("input"));
        for (WebElement i : listInput) {
            System.out.println("input name-->" + i.getAttribute("name"));
        }
        List<WebElement> listButton = wd.findElements(By.tagName("button"));
        for (WebElement b : listButton) {
            System.out.println("button name-->" + b.getAttribute("name"));
        }
    }

    @Test
    public void byName() {
        WebElement inputEmail = wd.findElement(By.name("email"));
        System.out.println("placeholder email-->" + inputEmail.getAttribute("placeholder"));
        WebElement inputPassword = wd.findElement(By.name("password"));
        System.out.println("placeholder password-->" + inputPassword.getAttribute("placeholder"));
        WebElement buttonLog = wd.findElement(By.name("login"));
        System.out.println("buttonLog name-->" + buttonLog.getAttribute("name"));
        WebElement buttonReg = wd.findElement(By.name("registration"));
        System.out.println("buttonReg name-->" + buttonReg.getAttribute("name"));
    }

    @Test
    public void byClassName() {
        WebElement classNameForm = wd.findElement(By.className("login_login__3EHKB"));
        System.out.println("classNameForm-->" + classNameForm.getAttribute("class"));
        WebElement classNameHeaderAll = wd.findElement(By.className("container"));
        System.out.println("classNameHeaderAll-->" + classNameHeaderAll.getAttribute("class"));
        WebElement classNameHeader = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        System.out.println("classNameHeader-->" + classNameHeader.getAttribute("class"));
    }

    @Test
    public void byId() {
        WebElement id = wd.findElement(By.id("root"));
        System.out.println("id class name-->" + id.getAttribute("class"));

    }

    @Test
    public void byCssSelectors() {

        WebElement id1 = wd.findElement(By.cssSelector("#root"));
        WebElement id2 = wd.findElement(By.xpath("//*[@id='root']"));
        System.out.println("id -->" + id1.getAttribute("id"));
        Assert.assertEquals(id2.getAttribute("id"), "root");

        WebElement formCss = wd.findElement(By.cssSelector("form"));
        System.out.println("form role-->" + formCss.getAriaRole());
        Assert.assertEquals(formCss.getAriaRole(), "generic");

        WebElement buttonCssLog = wd.findElement(By.cssSelector("[name='login']"));
        System.out.println("button name login-->" + buttonCssLog.getAttribute("name"));
        Assert.assertEquals(buttonCssLog.getAttribute("name"), "login");
        WebElement buttonCssReg = wd.findElement(By.cssSelector("[name='registration']"));
        System.out.println("button name registration-->" + buttonCssReg.getAttribute("name"));
        Assert.assertEquals(buttonCssReg.getAttribute("name"), "registration");

        WebElement inputCssEmail = wd.findElement(By.cssSelector("[placeholder='Email']"));
        System.out.println("input name email-->" + inputCssEmail.getAttribute("name"));
        Assert.assertEquals(inputCssEmail.getAttribute("placeholder"), "Email");
        WebElement inputCssPass = wd.findElement(By.cssSelector("[placeholder='Password']"));
        System.out.println("input name password-->" + inputCssPass.getAttribute("name"));
        Assert.assertEquals(inputCssPass.getAttribute("placeholder"), "Password");

        WebElement home = wd.findElement(By.cssSelector("[href='/home']"));
        System.out.println("home -->" + home.getAttribute("href"));
        Assert.assertEquals(home.getText(), "HOME");

        WebElement about = wd.findElement(By.cssSelector("[href='/about']"));
        System.out.println("about -->" + about.getAttribute("href"));
        Assert.assertEquals(about.getText(), "ABOUT");

        WebElement loginHeder = wd.findElement(By.cssSelector("[href='/login']"));
        System.out.println("loginHeder -->" + loginHeder.getAttribute("href"));
        Assert.assertEquals(loginHeder.getText(), "LOGIN");

        WebElement phonebookCss = wd.findElement(By.cssSelector("h1"));
        System.out.println("phonebookCss -->" + phonebookCss.getAccessibleName());
        Assert.assertEquals(phonebookCss.getText(), "PHONEBOOK");

    }

    @Test
    public void byXpath() {

        WebElement formXPath = wd.findElement(By.xpath("//form"));
        System.out.println("form XPath role-->" + formXPath.getAriaRole());
        Assert.assertEquals(formXPath.getAriaRole(), "generic");

        WebElement buttonXPathLog = wd.findElement(By.xpath("//*[@name='login']"));
        System.out.println("button XPath name login-->" + buttonXPathLog.getAttribute("name"));
        Assert.assertEquals(buttonXPathLog.getAttribute("name"), "login");
        WebElement buttonXPathReg = wd.findElement(By.xpath("//*[@name='registration']"));
        System.out.println("button XPath name registration-->" + buttonXPathReg.getAttribute("name"));
        Assert.assertEquals(buttonXPathReg.getAttribute("name"), "registration");

        WebElement inputXPathEmail = wd.findElement(By.xpath("//*[@placeholder='Email']"));
        System.out.println("input XPath name email-->" + inputXPathEmail.getAttribute("name"));
        Assert.assertEquals(inputXPathEmail.getAttribute("placeholder"), "Email");
        WebElement inputXPathPass = wd.findElement(By.xpath("//*[@placeholder='Password']"));
        System.out.println("input XPath name password-->" + inputXPathPass.getAttribute("name"));
        Assert.assertEquals(inputXPathPass.getAttribute("placeholder"), "Password");

        WebElement phonebookXPath = wd.findElement(By.xpath("//h1[text()='PHONEBOOK']"));
        System.out.println("phonebookXPath -->" + phonebookXPath.getAccessibleName());
        Assert.assertEquals(phonebookXPath.getText(), "PHONEBOOK");


    }

    @AfterClass
    public void postCondition() {
        wd.close();
    }
}
