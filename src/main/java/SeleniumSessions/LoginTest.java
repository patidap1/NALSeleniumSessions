package SeleniumSessions;

public class LoginTest {

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.initDriver("chrome");
		brUtil.launchUrl("https://www.google.com");
		String title = brUtil.getPageTitle();
		if(title.equals("Google")) {
			System.out.println("title --- Pass");
		}
		else {
			System.out.println("title --- fail");
		}

		String url = brUtil.getPageURL();
		if (url.contains("google")) {
			System.out.println("login url is correct");
		}
		brUtil.closeBrowser();
	}

}
