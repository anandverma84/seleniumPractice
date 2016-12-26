package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locator {
    
    public static void main(String[] args){
        /*WebDriver driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.get("http://www.jabong.com/");*/
        
        System.setProperty("webdriver.chrome.driver", "D:\\Automation-realize\\20-08-2015\\GridConfig\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://www.jabong.com/");
        
        driver.close();
    }
}
