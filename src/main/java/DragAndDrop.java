import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {

    WebDriver driver;

    @Test
    public void DragnDrop() throws InterruptedException {
        String my_driver_path="/home/uditnarang/Downloads/chromedriver_linux64/chromedriver";
        System.setProperty("webdriver.chrome.driver", my_driver_path);
        driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        //Element which needs to drag.
        WebElement From=driver.findElement(By.xpath("//li[@id='fourth']"));

        JavascriptExecutor js=(JavascriptExecutor) driver;;
        js.executeScript("window.scrollBy(0,100)");
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        Thread.sleep(1000);

        //Element on which need to drop.
        WebElement To=driver.findElement(By.xpath("//ol[@id='amt7']"));

        //Using Action class for drag and drop.
        Actions action=new Actions(driver);

        //Dragged and dropped.
//        action.dragAndDrop(From, To).build().perform();


        action.dragAndDropBy(From, 147, 50).build().perform();

//        driver.quit();
    }
}