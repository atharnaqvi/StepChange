package findLinkTest;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class IndividualVoluntaryArrangement {
	WebDriver driver;
	String baseURL;
	

	@BeforeEach
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "https://www.stepchange.org/how-we-help/individual-voluntary-arrangement.aspx";
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void test() {
		driver.get(baseURL);
		
		List<WebElement> linksList = clickableLinks(driver);
		for(WebElement link : linksList) {
			String href = link.getAttribute("href");
			try {
				System.out.println("URL " + href + " returned " + linkStatus(new URL(href)));
			}
			catch(Exception e) {
				System.out.println(e.getMessage() + " **********Failed********* " );
			}
		}
		
		
	}
	
	public static List<WebElement> clickableLinks(WebDriver driver) {
		List<WebElement> linksToClick = new ArrayList<WebElement>();
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		elements.addAll(driver.findElements(By.tagName("img")));
		
		for (WebElement e : elements) {
			if(e.getAttribute("href") != null){
				linksToClick.add(e);
			}
		}
		
		return linksToClick;
	}
	
	public static String linkStatus(URL url) {
		try {
			HttpURLConnection http = (HttpURLConnection) url.openConnection();
			http.connect();
			String responseMessage = http.getResponseMessage();
			http.disconnect();
			return responseMessage;
		}
		catch (Exception e) {
			return e.getMessage();
		}
	}
	
	@AfterEach
	public void tearDown() throws Exception {
		driver.quit();
	}

	

}
