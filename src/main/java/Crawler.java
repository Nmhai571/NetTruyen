import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Crawler {
	
	private static String URL = "http://truyenqqpro.com/truyen-tranh/ke-phan-dien-thuan-tuy-12859";
	private static String NAME_COMIC = URL.substring(URL.indexOf("truyen-tranh") + 13, URL.length());
	static Scanner scan = new Scanner(System.in);
	
	public static List<Chap> getAllChap(String url, ChromeOptions options) {
		List<Chap> chaps = new ArrayList<Chap>();
		WebDriver driver = new ChromeDriver(options);
		driver.get(url);
		List<WebElement> elements = driver.findElements(By.cssSelector("a[target=\"_self\"]"));
		for (WebElement e : elements) {
			String urlChap = e.getAttribute("href");
			Chap chap = new Chap(urlChap);
			chaps.add(chap);
		}
		driver.close();
		return chaps;
	}
	
	public static void fileWriteThumbnail(ChromeOptions options) {
		WebDriver driver = new ChromeDriver(options);
		driver.get(URL);
		WebElement element = driver.findElement(By.cssSelector("img[itemprop=\"image\"]"));
		String thumbnail = element.getAttribute("src");
		File theDir = new File("ComicProject\\" + NAME_COMIC);
		if (!theDir.exists()){
		    theDir.mkdirs();
		}
		try {
			FileWriter fw = new FileWriter("ComicProject\\" + NAME_COMIC + "\\" + "thumbnail" + ".txt", true);
			BufferedWriter buffer = new BufferedWriter(fw);
			buffer.write(thumbnail);
			buffer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void getAllImage(String url, String numChap, ChromeOptions options) {
		WebDriver driver = new ChromeDriver(options);
		driver.get(url);
		List<WebElement> elements = driver.findElements(By.className("lazy"));
		for (WebElement e : elements) {
			String urlImage = e.getAttribute("src");
			fileWriteUrl(urlImage, numChap);
		}
		driver.close();
	}
	
	public static void fileWriteUrl(String url, String numChap) {
		File theDir = new File("ComicProject\\" + NAME_COMIC);
		if (!theDir.exists()){
		    theDir.mkdirs();
		}
		try {
			FileWriter fw = new FileWriter("ComicProject\\" + NAME_COMIC + "\\" + NAME_COMIC + "_Chap" + numChap + ".txt", true);
			BufferedWriter buffer = new BufferedWriter(fw);
			buffer.write(url);
			buffer.newLine();
			buffer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		fileWriteThumbnail(options);
		List<Chap> chaps = getAllChap(URL, options);
		for (Chap chap : chaps) {
			getAllImage(chap.getUrl(), chap.getNum_chap(), options);
		}
	}
}
