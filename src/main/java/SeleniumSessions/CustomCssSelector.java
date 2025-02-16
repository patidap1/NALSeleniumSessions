package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCssSelector {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login/legacy?hubs_signup-url=www.hubspot.com%2Fproducts%2Fcrm&hubs_signup-cta=nav-utility-login&hubs_content=www.hubspot.com%2Fproducts%2Fcrm&hubs_content-cta=nav-utility-login&uuid=anon06c1954ca367377418c2cb2fec87");

		//CSS - Cascaded style sheet - defines look and feel
		//cssSelector: is a locator

		//id
		// #id
		// tag#id
		// #input-email
		// input#input-email

		By.cssSelector("input#input-email");

		//class
		// .classname
		// tag.classname
		// input.form-control
		// .c1.c2.c3...cn  for multple classes
		// tag.c1.c2.c3..cn
		// input.form-control.login-email

		By.cssSelector("input.form-control");
		By.cssSelector("input.form-control.input-lg");

		//#id.class
		// .class#id
		// tag#id.class
		// tag.class#id
		// input#username.login-email
		// input.login-email#username

		By.cssSelector("input.form-control.private-form__control.login-email#username");

		// for other attributes
		// tag[attr='value']
		// input[value='login'] --css
		// xpath //input[@value='login']   == xpath

		// tag[attr1='value'][attr2='value']    - no need to use and operator in css
 		// input[value='login'][type='submit'] - css
		// //input[@value='login' and @type='submit']  -xpath

		// input[id][placeholder][type]  -- without value
		// a[href] - -- all links
		// a[href][id][class]

		// Contains
		By.cssSelector("tag[attr *= 'value']");

		//start with
		By.cssSelector("tag[attr ^= 'value']");  //carrat sign

		//endswith:
		By.cssSelector("tag[attr $= 'value'");

		//no support for text() in css

		// cypress does not support xpath -- needs plugin to use

		//parent to child
		// parentTag childTag --> direct + indirect child elements
		By.cssSelector("form#hs-login div"); // --24 elements


		// parentTag > childTag  --> direct child elements
		By.cssSelector("form#hs-login > div"); // -- 8 elements

		// orange hrm trial page - retreive countries
		By.cssSelector("#Form_getForm_Country option");  // --233

		// child to parent -- backward movement not possible in CSS
		// webtable handling is difficult in css

		//Sibling in CSS - only for following
		By.cssSelector("label[for='input-email']  + input#input-email");  // return immediate following sibling

		By.cssSelector("option[value='Afghanistan']  option");  // 1 - returns immediate following sibling
		By.cssSelector("option[value='Afghanistan'] ~ option"); // 231 - returns all following siblings

		//index in CSS

		By.cssSelector("select#Form_getForm_Country > option:nth-of-type(2)"); // 2nd of index
		By.cssSelector("select#Form_getForm_Country > option:nth-child(5)"); // nth-child
		By.cssSelector("select#Form_getForm_Country > option:nth-child(odd)"); // odd elements
		By.cssSelector("select#Form_getForm_Country > option:nth-child(even)"); // even elements

		By.cssSelector("select#Form_getForm_Country > option:nth-of-type(n)"); // all elements
		By.cssSelector("select#Form_getForm_Country > option:first-child"); // first child
		By.cssSelector("select#Form_getForm_Country > option:last-child"); //last child
		By.cssSelector("select#Form_getForm_Country > option:last-child(1)"); // 1nd last child (same as above)
		By.cssSelector("select#Form_getForm_Country > option:last-child(2)"); // 2nd last child
		By.cssSelector("select#Form_getForm_Country > option:last-child(5)"); // 5nd from the last
		By.cssSelector("select#Form_getForm_Country > option:last-child(n)"); // all child elements


		//odd/even in xpath:
		By.xpath("//select[@id='Form_getForm_Country']/option[position() mod 2 =0]"); // -- even
		By.xpath("//select[@id='Form_getForm_Country']/option[position() mod 2 =1]"); // -- odd

		//comma in css
		By impElements = By.xpath("input#username, input#password, input#remember, button#loginBtn");


		System.out.println("===================================");
		List<WebElement> impEleList = driver.findElements(impElements);
		System.out.println(impEleList.size());

		if(impEleList.size() == 4) {
			System.out.println("login form have all important elements");
		} else {
			System.out.println("FAIL");
		}

		//not in css:
		By.cssSelector("input.form-control"); // - 7 elements
		By.cssSelector("input.form-control:not(input[name=search])"); // - 6 elements
		By.cssSelector("form-control:not(input[name=search]):not(#input-telephone)"); // = 5 elements


		//                       xpath          vs             css
		// 1.Syntax              Complex                       easy
		// 2.Performance         good                          good
		// 3.text                yes                           no
		// 4.sibling             yes                           limited(only following)
		// 5.Child to parent     yes                           no
		// 6.Parent to child     yes                           yes
		// 7.backward traverse   yes                           no
		// 8.index               yes                           yes(+1)
		// 9.not                 yes                           yes
		// 10.comma/union        yes                           yes
		// 11.endswith           no                            yes
		// 12.contains()         yes                           yes
		// 13.startswith         yes                           yes
		// 14.space:             yes                           no
		// 15.SVG                yes                           limited
		// 16.SHADOW DOM	     no                            yes
		// 17.Relative locators  yes                           yes



	}



}
