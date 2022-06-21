import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openxmlformats.schemas.drawingml.x2006.main.ThemeDocument;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

public class HandlingMultipleWindows {
    public static void main(String[] args) throws InterruptedException {
        String my_driver_path="/home/uditnarang/Downloads/chromedriver_linux64/chromedriver";
        System.setProperty("webdriver.chrome.driver", my_driver_path);
        WebDriver driver=new ChromeDriver();

        driver.get("http://demo.guru99.com/popup.php");
        driver.manage().window().maximize();

        WebElement click_here=driver.findElement(By.xpath("//a[text()='Click Here']"));

        String MainWindow= driver.getWindowHandle();
        click_here.click();

        Thread.sleep(5000);

        Set<String> windows=driver.getWindowHandles();

        Iterator<String> iterator=windows.iterator();

        while (iterator.hasNext())
        {
            String childWindow=iterator.next();
            if(!MainWindow.equalsIgnoreCase(childWindow))
            {
                driver.switchTo().window(childWindow);
                driver.findElement(By.name("emailid")).sendKeys("udit19120@iiitd.ac.in");
                driver.findElement(By.name("btnLogin")).click();
                driver.close();
            }

        }

        driver.switchTo().window(MainWindow);
        driver.close();

    }
}
