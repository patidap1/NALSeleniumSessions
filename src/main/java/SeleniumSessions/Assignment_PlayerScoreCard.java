package SeleniumSessions;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_PlayerScoreCard {

	static WebDriver driver;

	static String player = "Ben Curran";

	public static void getScoreCard(String playerName) {

		if (playerName == null || (playerName.isBlank())) {

			System.out.println("Player name can not be null or Blank");

			return;

		}

		try {

			WebElement player = driver.findElement(By.xpath("//a[@title='" + playerName + "']"));

			List<WebElement> scoreCardElements = driver

					.findElements(By.xpath("//a[@title='" + playerName + "']/ancestor::tr[@class]//td"));

			if (scoreCardElements.isEmpty()) {

				System.out.println("No score card for Player");

			} else {

				for (WebElement e : scoreCardElements) {

					System.out.println(e.getText());

				}

			}

		} catch (NoSuchElementException e) {

			System.out.println("====================Player does not exist============");

		}

	}

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get(

				"https://www.espncricinfo.com/series/afghanistan-in-zimbabwe-2024-25-1457916/zimbabwe-vs-afghanistan-3rd-odi-1457925/full-scorecard");

		driver.manage().window().maximize();

// Manually scroll down

		Thread.sleep(5000);

		getScoreCard(player);

		driver.quit();

	}

}
