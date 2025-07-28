import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Index {
    WebDriver wd;

    @BeforeClass
    public void setUpp() {
        wd = new ChromeDriver();
        wd.get("file:///Users/ekaterinamamedova/Downloads/21.index.html");
    }

    @Test
    public void tableTest() {

        //Canada
        WebElement canada = wd.findElement(By.cssSelector("tr:nth-child(3)>td:last-child"));
        Assert.assertEquals(canada.getText(), "Canada");
    }


    @Test
    public void cssLocators() {
        //1 by tagName
        WebElement el = wd.findElement(By.tagName("button"));
        WebElement el1 = wd.findElement(By.xpath("//button"));
        WebElement el2 = wd.findElement(By.xpath("//input"));
// //*[@id='root']  слеши заменяют путь звездочка заменяет элемент потом класс и остальная формула


        WebElement input = wd.findElement(By.tagName("input"));
        List<WebElement> list = wd.findElements(By.tagName("input"));
        // by class //точка прказывает поиск по классу
        // //*[@id='root']  слеши заменяют путь звездочка заменяет элемент потом класс и остальная формула
        WebElement div3 = wd.findElement(By.xpath("//*[@class = 'container']"));

        WebElement div = wd.findElement(By.className("container"));
        WebElement div1 = wd.findElement(By.cssSelector(".container"));//точка прказывает поиск по классу
        List<WebElement> list1 = wd.findElements(By.className("nav-item"));
        List<WebElement> list2 = wd.findElements(By.className(".nav-item"));
        List<WebElement> list3 = wd.findElements(By.xpath("//*[@class = 'nav-item']"));


        //by id //решетка прказывает поиск по id
        WebElement nav = wd.findElement(By.id("nav"));
        WebElement nav2 = wd.findElement(By.cssSelector("#nav"));
        WebElement nav3 = wd.findElement(By.xpath("//*[@class = 'nav']"));

        //by attribute
        WebElement inputEmail = wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        WebElement inputEmail4 = wd.findElement(By.xpath("//*[placeholder='Type your name']"));

        WebElement a3 = wd.findElement(By.cssSelector("[href='#item3']"));
        //start
        WebElement inputEmail1 = wd.findElement(By.cssSelector("[placeholder^='Type'"));// ^позволяет искать сокращенное название в начале
        //end
        WebElement inputEmail2 = wd.findElement(By.cssSelector("[placeholder%='Type'"));//$позволяет искать сокращенное название в конце
        //contains
        WebElement inputEmail3 = wd.findElement(By.cssSelector("[placeholder*='your'"));//*позволяет искать сокращенное название в середине
        //
        //by name
        WebElement inputS = wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        WebElement inputS1 = wd.findElement(By.name("surname"));
        //By.linkText / By.partialLinkText
        WebElement a = wd.findElement(By.linkText("Item 3"));
        WebElement a2 = wd.findElement(By.partialLinkText("m 2"));

    }

    @AfterClass
    public void postCondition() {
        wd.close();
    }
}
