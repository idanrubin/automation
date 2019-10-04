import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class myClass {
	
	
  @Test
  public void test1() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","D:\\java\\seleniumDriver\\Chrome\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://google.com");
	  Thread.sleep(3000);
	  driver.quit();
  }
  
  @Test()
  public void test2() {
	  System.setProperty("webdriver.chrome.driver","D:\\java\\seleniumDriver\\Chrome\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://google.com");
	  long id = Thread.currentThread().getId();
	  System.out.println("test2 id: " + id);
	  driver.quit();
  }
  
  @Test()
  public void test3() {
	  System.setProperty("webdriver.chrome.driver","D:\\java\\seleniumDriver\\Chrome\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://google.com");
	  long id = Thread.currentThread().getId();
	  System.out.println("test3 id: " + id);
	  driver.quit();
  }
}
