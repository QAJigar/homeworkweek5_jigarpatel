import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_3_Com_HerokuApp {
    /**
     * Project-3 - ProjectName : com-herokuapp
     * BaseUrl = http://the-internet.herokuapp.com/login
     * 1. Setup Chrome browser.
     * 2. Open URL.
     * 3. Print the title of the page.
     * 4. Print the current url.
     * 5. Print the page source.
     * 6. Enter the email to email field.
     * 7. Enter the password to password field.
     * 8. Click on Login Button.
     * 9. Print the current url.
     * 10. Refresh the page.
     * 11. Close the browser.
     */
    public static void main(String[] args) {
        //Setup base URL
        String baseUrl = "http://the-internet.herokuapp.com/login";
        //Setup Chrome browser
        WebDriver driver = new ChromeDriver();
        //Open URL
        driver.navigate().to(baseUrl);
        //maximize the open window
        driver.manage().window().maximize();
        //Print the title of the page
        System.out.println("Title of the page: " + driver.getTitle());
        //Print the current url
        System.out.println("Current Url: " + driver.getTitle());
        //Print the page source
        System.out.println("Page Source: " + driver.getPageSource());
        //Enter the email to email field
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        //Enter the password to password field
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        //Click on Login Button
        driver.findElement(By.className("fa-sign-in")).click();
        //Click on Logout Button
        driver.findElement(By.className("icon-signout")).click();
        //Close the window
        driver.close();
    }
}
