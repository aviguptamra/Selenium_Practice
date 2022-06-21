import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Log4jPractice {
    WebDriver driver;
    Logger log = Logger.getLogger(Log4jPractice.class);

    @BeforeMethod
    public void setup(){
        log.info("****************************** Starting test cases execution  *****************************************");

        System.setProperty("webdriver.chrome.driver", "/home/uditnarang/Downloads/chromedriver_linux64/chromedriver");
        driver = new ChromeDriver();
        log.info("launching chrome broswer");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.freecrm.com/");
        log.info("entering application URL");
        log.warn("Hey this just a warning message");
        log.fatal("hey this is just fatal error message");
        log.debug("this is debug message");
    }


    @Test(priority=1)
    public void freeCrmTitleTest(){
        log.info("****************************** starting test case *****************************************");
        log.info("****************************** freeCrmTitleTest *****************************************");
        String title = driver.getTitle();
        System.out.println(title);
        log.info("login page title is--->"+title);
        Assert.assertEquals(title,"Free CRM software for customer relationship management, sales, marketing campaigns and support.");

        log.info("****************************** ending test case *****************************************");
        log.info("****************************** freeCrmTitleTest *****************************************");

    }




    @AfterMethod
    public void tearDown(){
        driver.quit();
        log.info("****************************** Browser is closed *****************************************");


    }

}


//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