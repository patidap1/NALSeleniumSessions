package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCricInfo {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/australia-vs-india-2024-25-1426547/australia-vs-india-3rd-test-1426557/full-scorecard");

		// List<String> playersScoreCard = getScoreCard("Steven Smith");
		// System.out.println(playersScoreCard);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		getScoreCard("Steven Smith");
		driver.quit();
	}

	public static List<String> getScoreCard(String PlayerName) {
		List<WebElement> scoreCard = driver.findElements(By.xpath(
				"//a[@title='" + PlayerName + "']/ancestor::td/following-sibling::td[contains(@class, 'ds-w-0')]"));

		List<String> scoreCardValues = new ArrayList<>();
		for (WebElement e : scoreCard) {
			String text = e.getText();
			if(text.length()>0) {
			scoreCardValues.add(text);
			}
			System.out.println(scoreCardValues);
		}
		return scoreCardValues;
	}

}
