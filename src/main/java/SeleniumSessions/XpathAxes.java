package SeleniumSessions;

public class XpathAxes {

	public static void main(String[] args) {
		// parent to child:

		//1. direct child: / -- only direct child elements
		//2. indirect child: // -- direct+indirect child elements

		//form//input[@id] --2 elements
		//form//input[@id and @placeholder]

		//orangehrm - country dropdown
		//select[@id='Form_getForm_Country']/option  --direct - 233
		//select[@id='Form_getForm_Country']//option  --direct+indirect - 233

		//https://app.hubspot.com/login/legacy
		//form[@id='hs-login']//input  -- 3
		//form[@id='hs-login']/input  -- 0

		//div[@class='private-form__input-wrapper']/input  --2
		//div[@class='private-form__input-wrapper']/input[@id='username'] --1

		//child -- should be direct child

			//div[@class='private-form__input-wrapper']/child::input[@id='username']  --1

		//form[@id='hs-login']//input[@id='username']  -- 1
		//form[@id='hs-login']//child::input[@id='username']  --1

		//parent to child
		//form/[@class='form-horizontal']//child::input[@placeholder]  - 6
		//form/[@class='form-horizontal']/input[@placeholder]    -6

		//backward traversing in DOM:
		//child to direct parent:
		//input[@id='input-firstname']/../../../../../../../../../..

		//parent -- direct parent
		//input[@id='input-firstname']/parent::div

		//child to ancestor:
		//input[@id='input-firstname']/ancestor::form

		//sibling:
		//label[text()='E-Mail Address']/following-sibling::input[@id='input-email']
		//label[text()='Password']/following-sibling::input[@id='input-password']

		//input[@id='input-email']/preceding-sibling::label[@for='input-email']


		// https://selectorshub.com/xpath-practice-page/
		///a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
		//a[text()='John.Smith']/parent::td/preceding-sibling::td/input[@type='checkbox']

		//a[text()='John.Smith']/ancestor::tr//input[@type='checkbox']




	}

}
