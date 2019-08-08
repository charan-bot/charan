package commit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class CommitAndPush {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MKJ\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		 driver.get("http://demo.guru99.com/test/guru99home/");
		 driver.manage().window().maximize();
		 driver.quit();
	}

}
