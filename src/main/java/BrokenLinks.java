import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) {
        String my_driver_path="/home/uditnarang/Downloads/chromedriver_linux64/chromedriver";
        System.setProperty("webdriver.chrome.driver", my_driver_path);
        WebDriver driver=new ChromeDriver();

        String baseUrl = "http://www.zlti.com";

        driver.get(baseUrl);
        driver.manage().window().maximize();

        List<WebElement> links=driver.findElements(By.tagName("a"));

        Iterator<WebElement> itr=links.iterator();


        HttpURLConnection huc=null;

        while (itr.hasNext())
        {
            WebElement link=itr.next();

            String url=link.getAttribute("href");

            System.out.println(url);
            try {
                huc=(HttpURLConnection) new URL(url).openConnection();

                huc.setRequestMethod("HEAD");
                huc.connect();

                int response_code=huc.getResponseCode();

                if(response_code>=400)
                {
                    System.out.println("Broken link");
                }

                else {
                    System.out.println("Valid Link");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }


    }
}
