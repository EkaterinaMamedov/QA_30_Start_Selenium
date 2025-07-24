import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTests {

    @BeforeClass//эта аннотация запустит метод один раз перед всеми тестами
    public void preCondition() {
        //open browser
        //open site

    }

    @Test
    public void loginSuccess() {
        //open form (find element + click)
        //fill email (find element + click + clear + type)
        //fill password (find element + click + clear + type)
        //submit form (find element + click)
    }

    @Test
    public void loginWrongEmail() {
        //open form (find element + click)
        //fill email (find element + click + clear + type)
        //fill password (find element + click + clear + type)
        //submit form (find element + click)
    }

    @Test
    public void loginWrongPassword() {
        //open form (find element + click)
        //fill email (find element + click + clear + type)
        //fill password (find element + click + clear + type)
        //submit form (find element + click)
    }

    @Test
    public void loginUnregister() {
        //open form (find element + click)
        //fill email (find element + click + clear + type)
        //fill password (find element + click + clear + type)
        //submit form (find element + click)
    }

    @AfterClass //эта аннотация запустит метод один раз после всеми тестами
    public void postCondition() {
        //close browser
    }
}
