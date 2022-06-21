import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "http://www.facebook.com/";

        String my_driver_path="/home/uditnarang/Downloads/chromedriver_linux64/chromedriver";
        System.setProperty("webdriver.chrome.driver", my_driver_path);
        WebDriver driver=new ChromeDriver();


        driver.get(baseUrl);
        driver.manage().window().maximize();


        WebElement txtUsername = driver.findElement(By.id("email"));
        Actions builder = new Actions(driver);
        Action seriesOfActions = builder
                .moveToElement(txtUsername)
                .click()
                .keyDown(txtUsername, Keys.SHIFT)
                .sendKeys(txtUsername, "hello")
                .keyUp(txtUsername, Keys.SHIFT)
                .doubleClick(txtUsername)
                .build();

        seriesOfActions.perform() ;

        Thread.sleep(1000);
        driver.quit();

    }
}
