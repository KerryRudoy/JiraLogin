import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jira.hillel.it/login.jsp");
        driver.findElement(By.id("login-form-username")).click();
        driver.findElement(By.id("login-form-username")).sendKeys("Karina_Soltanovskaya");
        driver.findElement(By.name("os_password")).click();
        driver.findElement(By.name("os_password")).sendKeys("Karina_Soltanovskaya");
        driver.findElement(By.cssSelector("#login-form-submit")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("create_link")).click();
        driver.findElement(By.xpath("//input[@id='project-field']")).click();
        driver.findElement()
        driver.findElement(By.xpath("//input[@id='issuetype-field']")).click();
        driver.findElement(By.cssSelector("#summary")).click();
        driver.findElement(By.xpath("//body[@id='tinymce']//p")).click();
        driver.findElement(By.id("create-issue-submit")).click();
        Thread.sleep(3000);

        driver.quit();



    }
}
