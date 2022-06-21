import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollWindow {
    public static void main(String[] args) throws InterruptedException {


        String my_driver_path="/home/uditnarang/Downloads/chromedriver_linux64/chromedriver";
        System.setProperty("webdriver.chrome.driver", my_driver_path);
        WebDriver driver=new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("http://demo.guru99.com/test/guru99home/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        WebElement email=driver.findElement(By.id("philadelphia-field-email"));
//        js.executeScript("window.scrollBy(0,2000)");
//        js.executeScript("arguments[0].scrollIntoView()", email);


        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(3000);
        driver.close();
    }
}
