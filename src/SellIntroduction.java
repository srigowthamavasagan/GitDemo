import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class SellIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "/Users/User/Documents/chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "/Users/User/Documents/msedgedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
	 driver.get("https://maven.apache.org/surefire/maven-surefire-plugin/examples/testng.html");
		
	}

}
