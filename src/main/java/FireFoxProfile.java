import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class FireFoxProfile {


    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/home/uditnarang/Downloads/geckodriver-v0.31.0-linux64/geckodriver");
        FirefoxOptions options = new FirefoxOptions();
        ProfilesIni profile = new ProfilesIni();
        FirefoxProfile myprofile = profile.getProfile("Selenium_Firefox");

        options.setProfile(myprofile);
        WebDriver driver = new FirefoxDriver(options);
        driver.get("https://www.google.com");


    }



}
