package commit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commit2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MKJ\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor) driver;
        driver.get("http://demo.guru99.com/test/guru99home/");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.navigate().refresh();
        driver.manage().window().maximize();
      
        WebElement Element= driver.findElement(By.tagName("Email"));
        js.executeScript("arguments[0].scrollintoView();",Element);
        driver.switchTo().frame("a077aa5e");
        driver.findElement(By.xpath("/html/body/a/img")).click();
        driver.quit();

	}

}
