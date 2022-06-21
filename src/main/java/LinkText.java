import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
    public static void main(String[] args) throws InterruptedException {
        String my_driver_path="/home/uditnarang/Downloads/chromedriver_linux64/chromedriver";
        System.setProperty("webdriver.chrome.driver", my_driver_path);
        WebDriver driver=new ChromeDriver();

        String baseUrl = "https://demo.guru99.com/test/accessing-link.html";

        driver.get(baseUrl);
        driver.manage().window().maximize();

        driver.findElement(By.linkText("click here")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("here")).click();
    }
}
