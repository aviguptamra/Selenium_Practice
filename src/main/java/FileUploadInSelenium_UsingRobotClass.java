import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FileUploadInSelenium_UsingRobotClass {

    public static void main(String[] args) throws AWTException {

        String my_driver_path="/home/uditnarang/Downloads/chromedriver_linux64/chromedriver";
        System.setProperty("webdriver.chrome.driver", my_driver_path);
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://demo.guru99.com/selenium/upload/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        //open upload window
        driver.findElement(By.name("uploadfile_0")).click();

        //put path to your image in a clipboard
        StringSelection ss = new StringSelection("home/uditnarang/Desktop/obv_data.xlsx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        Robot robot = new Robot();
        robot.delay(250);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(90);
        robot.keyRelease(KeyEvent.VK_ENTER);

        driver.quit();


    }

}