import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Crawler {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://truyenqqpro.com/truyen-tranh/lien-quan-mobile-anh-sang-bong-toi-9338-chap-5.html");
		driver.findElements(By.className("lazy")).forEach(e -> System.out.println(e.getAttribute("src")));
	}
}
