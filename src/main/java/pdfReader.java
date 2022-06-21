import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class pdfReader {
    public static void main(String[] args) throws IOException {

        String my_driver_path="/home/uditnarang/Downloads/chromedriver_linux64/chromedriver";
        System.setProperty("webdriver.chrome.driver", my_driver_path);
        WebDriver driver=new ChromeDriver();

        driver.get("file:///home/uditnarang/Downloads/1918.12.24_text.pdf");

        driver.manage().window().maximize();

        String my_url=driver.getCurrentUrl();

        URL url=new URL(my_url);

        InputStream inputStream=url.openStream();
        BufferedInputStream bufferedInputStream=new BufferedInputStream(inputStream);

        PDDocument document=null;

        document= Loader.loadPDF(bufferedInputStream);
        String pdfContent=new PDFTextStripper().getText(document);

        System.out.println(pdfContent);

        Assert.assertTrue(pdfContent.contains("Winter Admissions"));
        Assert.assertTrue(pdfContent.contains("MTech Dual Degree"));
        Assert.assertTrue(pdfContent.contains("Ph.D. Sponsored udit"));
    }
}
