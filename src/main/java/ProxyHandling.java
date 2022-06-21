import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ProxyHandling {
    public static void main(String[] args) throws InterruptedException {

        String my_driver_path="/home/uditnarang/Downloads/chromedriver_linux64/chromedriver";
        System.setProperty("webdriver.chrome.driver", my_driver_path);
        WebDriver driver=new ChromeDriver();


        driver.get("http://demo.guru99.com/test/basic_auth.php");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

        driver.switchTo().alert().sendKeys("guru99");
        driver.switchTo().alert().accept();

        Thread.sleep(3000);

        driver.switchTo().alert().sendKeys("guru99");
        driver.switchTo().alert().accept();

    }
}
