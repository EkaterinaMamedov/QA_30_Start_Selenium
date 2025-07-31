import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWorkChesk {

    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssSelectors() {
        //by tagName
        WebElement div = wd.findElement(By.tagName("div"));
        WebElement div1 = wd.findElement((By.cssSelector("div")));
        WebElement div2 = wd.findElement((By.xpath("//div")));

        WebElement h1 = wd.findElement(By.tagName("h1"));
        WebElement h1_1 = wd.findElement((By.cssSelector("h1")));
        WebElement h1_22 = wd.findElement((By.xpath("//h1")));


        List<WebElement> list = wd.findElements((By.tagName("a")));
        List<WebElement> list1 = wd.findElements(By.cssSelector("a"));
        List<WebElement> list2 = wd.findElements(By.xpath("//a"));

        //by class
        WebElement el = wd.findElement(By.className("container"));
        WebElement el1 = wd.findElement(By.cssSelector(".container"));
        WebElement el2 = wd.findElement(By.xpath("//*[@class = 'container']"));


        WebElement el3 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement el4 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement el5 = wd.findElement(By.xpath("//*[@class = 'navbar-component_nav__1X_4m']"));

        //by id
        WebElement el6 = wd.findElement(By.id("root"));
        WebElement el7 = wd.findElement(By.cssSelector("#root"));
        WebElement el8 = wd.findElement(By.xpath("//*[@id='root']"));

        //by attribute
        WebElement el9 = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement el10 = wd.findElement(By.xpath("//*[@href='/home']"));
        WebElement el20 = wd.findElement(By.xpath("//a[3]"));
        WebElement el21 = wd.findElement(By.xpath("//a[last()]"));


        WebElement el11 = wd.findElement(By.cssSelector("[placeholder='Password']"));
        WebElement el12 = wd.findElement(By.xpath("//*[@placeholder='Password']"));

        WebElement el13 = wd.findElement(By.cssSelector("[placeholder^='Pas']"));
        WebElement el14 = wd.findElement(By.xpath("//*[starts-with(@placeholder,'Pas')]"));

        WebElement el15 = wd.findElement(By.cssSelector("[placeholder$='ord']"));
        WebElement el16 = wd.findElement(By.xpath("//*[contains(@placeholder,'ord')]"));

        WebElement el17 = wd.findElement(By.cssSelector("[placeholder*='ss']"));
        WebElement el18 = wd.findElement(By.xpath("//*[contains(@placeholder,'ss')]"));
    }


    @Test
    public void CW() {
        //parent
        WebElement el = wd.findElement(By.xpath("//h1/parent::*"));//родители
        WebElement el1 = wd.findElement(By.xpath("//h1/parent::div"));
        WebElement el2 = wd.findElement(By.xpath("//h1/.."));

        //ancestor
        WebElement el3 = wd.findElement(By.xpath("//h1/ancestor::*"));//предки
        WebElement el4 = wd.findElement(By.xpath("//h1/ancestor::div"));
        WebElement el5 = wd.findElement(By.xpath("//h1/ancestor::div[2]"));

        //ancestor-or-self
        WebElement el6 = wd.findElement(By.xpath("//h1/ancestor-or-self::"));
        List<WebElement> list = wd.findElements(By.xpath("//h1/ancestor-or-self::*"));

        //following-sibling
        List<WebElement> list1 = wd.findElements(By.xpath("//h1/following-sibling::*"));
        WebElement el7 = wd.findElement(By.xpath("//h1/following-sibling::a[3]"));
        WebElement el8 = wd.findElement(By.xpath("//h1/following-sibling::a[last()]"));

        //preceding-sibling
        WebElement el9 = wd.findElement(By.xpath("//a[@href='/login']/preceding-sibling()::*"));
        WebElement el10 = wd.findElement(By.xpath("//a[@href='/login']/preceding-sibling()::a[2]"));


    }

    @Test
    public void cw2() {//иннер техт элемента
        WebElement loginButton = wd.findElement(By.cssSelector("[name='login']"));
        String text = loginButton.getText();
        System.out.println(text);
        WebElement form = wd.findElement(By.xpath("//form"));
        String textForm = form.getText();
        System.out.println("********");
        System.out.println(textForm);
        WebElement html = wd.findElement(By.tagName("html"));
        String htmlText = html.getText();
        System.out.println("********");
        System.out.println(htmlText);
        WebElement br = wd.findElement(By.tagName("br"));
        String brText = br.getText();
        System.out.println("********");
        System.out.println(brText + " br");





    }


    @AfterClass
    public void postCondition() {
        wd.close();
    }
}
