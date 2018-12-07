import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  
	@Test
  public void f() {
	WebDriver driver=null;
		System.out.println("start");//
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver_original.exe");
		driver=new ChromeDriver();
	
		driver.get("https://www.youtube.com/");
	
		driver.quit();
		System.out.println("end");
  
	}
}
