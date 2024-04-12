import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Selenium02 {


    public static void test_01() throws Exception {

        String textMessage;

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        driver.getTitle();
        System.out.println("The page opened: https://www.selenium.dev/selenium/web/web-form.html");

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        Thread.sleep(2000);

        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        textBox.sendKeys("Selenium");
        Thread.sleep(2000);
        submitButton.click();

        WebElement message = driver.findElement(By.id("message"));
        textMessage=message.getText();
        System.out.println("The message after submit: " + textMessage);
        Thread.sleep(2000);

        driver.quit();
    }
}
