import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandlingAlert {
    public static void main(String[] args) throws InterruptedException {

        String my_driver_path="/home/uditnarang/Downloads/chromedriver_linux64/chromedriver";
        System.setProperty("webdriver.chrome.driver", my_driver_path);
        WebDriver driver=new ChromeDriver();

        driver.get("http://demo.guru99.com/test/delete_customer.php");

        driver.manage().window().maximize();
//        driver.manage().window().fullscreen();

        WebElement customer_id=driver.findElement(By.name("cusid"));
        WebElement submit_btn=driver.findElement(By.name("submit"));


        customer_id.sendKeys("1234");
        submit_btn.click();

        Thread.sleep(5000);

        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());

        Thread.sleep(5000);
        alert.accept();


//        Alert alert_ok=driver.switchTo().alert();
//        System.out.println(alert_ok.getText());
//
//        Thread.sleep(2000);
//        alert_ok.accept();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        if(wait.until(ExpectedConditions.alertIsPresent())==null){
            System.out.println("alert was not present");
        }
        else
        {
            Alert alert1 = driver.switchTo().alert();
            alert.accept();
            System.out.println("alert was present and accepted");
        }

    }
}
