import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class DownloadFile {
    public static void main(String[] args) {
        String my_driver_path="/home/uditnarang/Downloads/chromedriver_linux64/chromedriver";
        System.setProperty("webdriver.chrome.driver", my_driver_path);
        WebDriver driver=new ChromeDriver();

        String baseUrl = "https://demo.guru99.com/test/yahoo.html";

        driver.get(baseUrl);
        driver.manage().window().maximize();

        File folder;
    }
}
