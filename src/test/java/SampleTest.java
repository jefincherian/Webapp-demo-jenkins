import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class SampleTest {

    @Test
    public void sampleTest() throws InterruptedException {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(option);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://www.qburst.com");
        WebElement services = driver.findElement(By.linkText("Services"));
        wait.until(ExpectedConditions.elementToBeClickable(services));
        services.click();
        WebElement dataScience = driver.findElement(By.linkText("Data Science"));
        wait.until(ExpectedConditions.elementToBeClickable(dataScience));
        dataScience.click();
        driver.quit();
    }
}
