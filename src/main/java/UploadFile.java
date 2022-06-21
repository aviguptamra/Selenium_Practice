import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class UploadFile {

    public static void main(String[] args) throws AWTException, InterruptedException {
        String my_driver_path="/home/uditnarang/Downloads/chromedriver_linux64/chromedriver";
        System.setProperty("webdriver.chrome.driver", my_driver_path);
        WebDriver driver=new ChromeDriver();

//        String baseUrl = "http://demo.guru99.com/test/upload/";
        String baseUrl1 = "https://www.monsterindia.com/seeker/registration";

        driver.get(baseUrl1);
        driver.manage().window().maximize();

        JavascriptExecutor executor = (JavascriptExecutor)driver;


        Thread.sleep(5000);
       WebElement upload_file= driver.findElement(By.xpath("//label[@class='upload-file']"));
       upload_file.click();

//       executor.executeScript("arguments[0].click();", upload_file);

//
//        driver.findElement(By.xpath("//div[@class='position-absolute color-bg-default rounded-2 color-fg-default px-2 py-1 left-0 bottom-0 ml-2 mb-2 border]")).click();
//        driver.findElement(By.xpath("//label[contains(text(),'Upload a photo')]")).click();


//        upload_file.sendKeys("/home/uditnarang/Downloads/My_Automation.xlsx");

        StringSelection ss = new StringSelection("/home/uditnarang/Downloads/1918.12.24_text.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);


        Robot robot=new Robot();
        robot.delay(250);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(90);
        robot.keyRelease(KeyEvent.VK_ENTER);

//        driver.findElement(By.id("terms")).click();
//
//        driver.findElement(By.id("submitbutton")).click();
    }

}


