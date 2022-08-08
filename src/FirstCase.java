import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCase {
	
	WebDriver driver;
	
	public void launchBrowser()
	{
		System.setProperty("Webdriver.chrome.driver","D:\\CDAC Delhi\\selenium-java-3.141.59 (1)\\chromedriver_win32\\chromedriver.exe");
	
		driver = new ChromeDriver();
		
		driver.get("https://www.cdac.in/index.aspx");
	}
	
	public void search()
	{
		driver.findElement(By.id("w-input-search")).sendKeys("Delhi");
		
		driver.findElement(By.xpath("//*[@d=\"w-button-search\"]")).click();
		
		driver.findElement(By.linkText("Products & Services")).click();
		
		driver.findElement(By.linkText("Param Shavak")).click();
	}
	
	public void navi()
	{
		driver.navigate().to("https://www.gamil.ocm");
		
		System.out.println("The title is " + driver.getTitle());
	}
	
	public void openGmail() throws InterruptedException
	{
		driver.findElement(By.name("identifier")).sendKeys("dhirajgupta@gmail.com");
		
		Thread.sleep(3000);
		
		driver.close();
	}
	
	
	public void quit()
	{
		driver.quit();
	}

	public static void main(String args[]) throws InterruptedException
	{
		FirstCase ob = new FirstCase();
		
		ob.launchBrowser();
		
		ob.search();
		
		ob.openGmail();
	}
}
