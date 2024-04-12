import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium01 {
    public static void test01() throws Exception {
        
        WebDriver driver = new ChromeDriver();

        driver.get("https://selenium.dev");
        Thread.sleep(2000);
        System.out.println("The page opened: https://selenium.dev");

        driver.quit();
   }
}
