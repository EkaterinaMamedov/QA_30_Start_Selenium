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

        List<WebElement> list = wd.findElements((By.tagName("a")));
        List<WebElement> list1 = wd.findElements(By.cssSelector("a"));
    }
    @AfterClass
    public void postCondition() {
        wd.close();
    }
}
