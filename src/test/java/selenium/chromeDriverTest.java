package selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeDriverTest {
    public static WebDriver driver;

    @Before
    public void setup(){
        driver = new ChromeDriver();
    }
    @Test
    public void exampleselenium()throws InterruptedException{
        driver.manage().window().fullscreen();
        Thread.sleep( 1000);
        driver.get("https://www.google.co.uk/");
        Thread.sleep( 1000);
    }



    @After
    public void teardown(){
        driver.quit();
    }
}
