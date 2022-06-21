import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Testing {
    WebDriver driver=null;

    @Test
    public void test1()
    {
        System.out.println("This is test 1: "+ Thread.currentThread().getId());
        String my_driver_path="/home/uditnarang/Downloads/chromedriver_linux64/chromedriver";
        System.setProperty("webdriver.chrome.driver", my_driver_path);
        driver=new ChromeDriver();

        driver.get("https://google.com");
        driver.quit();
    }


    @Test
    public void test2()
    {
        System.out.println("This is test 2: "+ Thread.currentThread().getId());

        String my_driver_path="/home/uditnarang/Downloads/chromedriver_linux64/chromedriver";
        System.setProperty("webdriver.chrome.driver", my_driver_path);
        driver=new ChromeDriver();

        driver.get("https://cricbuzz.com");
        driver.quit();
    }

    @Test
    public void test3()
    {
        System.out.println("This is test 3: "+ Thread.currentThread().getId());

        String my_driver_path="/home/uditnarang/Downloads/chromedriver_linux64/chromedriver";
        System.setProperty("webdriver.chrome.driver", my_driver_path);
        driver=new ChromeDriver();

        driver.get("https://instagram.com");
        driver.quit();
    }
}
