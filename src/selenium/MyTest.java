package selenium;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest {
@Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayma\\eclipse-workspace\\salem.project1\\src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.googel.com/");
    }

}
