import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Project_3_Com_HerokuApp_Multi_Browser {
    /**
     * /**
     * * Project-3 - ProjectName : com-herokuapp
     * * BaseUrl = http://the-internet.herokuapp.com/login
     * * 1. Setup Multi browser.
     * * 2. Open URL.
     * * 3. Print the title of the page.
     * * 4. Print the current url.
     * * 5. Print the page source.
     * * 6. Enter the email to email field.
     * * 7. Enter the password to password field.
     * * 8. Click on Login Button.
     * * 9. Print the current url.
     * * 10. Refresh the page.
     * * 11. Close the browser.
     */

//Setup baseUrl
    static String baseUrl = "http://the-internet.herokuapp.com/login";
    //create browser object
    static String browser = "Firefox";
    //setup web driver object
    static WebDriver driver;

    public static void main(String[] args) {
        //Use of nested if for multi browser
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong Browser Name");
        }
        //Get the URL
        driver.get(baseUrl);
        //Maximize the window
        driver.manage().window().maximize();
        //Print of Title, CurrentUrl and PageSource
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        //Enter the email to email field
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        //Enter password
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        //Click on Login Button
        driver.findElement(By.className("fa-sign-in")).click();
        //Click on Logout Button
        driver.findElement(By.className("icon-signout")).click();
        driver.close();

    }
}
