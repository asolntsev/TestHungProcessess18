import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;


public class Hanging5Test {

    static {
//            Configuration.browser = "firefox";
        Configuration.browser = "chrome";
    }

    @BeforeEach
    void setUp() {
        Selenide.open("https://google.com");
    }


    @AfterEach
    void cleanUp() {
        Selenide.closeWebDriver();
    }

    @org.junit.jupiter.api.Test
    public void t1() {
        $(By.name("q")).shouldBe(visible).val("todo").pressEnter();
    }
    @Test
    public void t2() {
        $(By.name("q")).shouldBe(visible).val("todo").pressEnter();
    }
    @Test
    public void t3() {
        $(By.name("q")).shouldBe(visible).val("todo").pressEnter();
    }
    @Test
    public void t4() {
        $(By.name("q")).shouldBe(visible).val("todo").pressEnter();
    }
    @Test
    public void t5() {
        $(By.name("q")).shouldBe(visible).val("todo").pressEnter();
    }
    @Test
    public void t6() {
        $(By.name("q")).shouldBe(visible).val("todo").pressEnter();
    }
    @Test
    public void t7() {
        $(By.name("q")).shouldBe(visible).val("todo").pressEnter();
    }
    @Test
    public void t8() {
        $(By.name("q")).shouldBe(visible).val("todo").pressEnter();
    }
    @Test
    public void t9() {
        $(By.name("q")).shouldBe(visible).val("todo").pressEnter();
    }
    @Test
    public void t10() {
        $(By.name("q")).shouldBe(visible).val("todo").pressEnter();
    }

}
