import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
    public static void main(String[] args) {

        String my_driver_path="/home/uditnarang/Downloads/chromedriver_linux64/chromedriver";
        System.setProperty("webdriver.chrome.driver", my_driver_path);
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/test/guru99home/");

        driver.manage().window().maximize();
        driver.switchTo().frame("a077aa5e");

        driver.findElement(By.xpath("html/body/a/img")).click();
    }
}
