import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class loginTest {
    @Test
    public void testLogin(){
        open("https://bonigarcia.dev/selenium-webdriver-java/");
        $(By.xpath("/html/body/main/div/div[5]/div[1]/div/div/a")).click();
        $("title").shouldHave(attribute("text", "Hands-On Selenium WebDriver with Java"));
        $(By.id("username")).sendKeys("alex");
        $(By.id("password")).sendKeys("alextest");
        $(By.xpath("//button")).click();
        $(By.id("invalid")).shouldHave(exactText("Invalid credentials"));
    }
}
