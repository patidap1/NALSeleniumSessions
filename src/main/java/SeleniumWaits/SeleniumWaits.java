package SeleniumWaits;

public class SeleniumWaits {

	public static void main(String[] args) {
		//1. Static wait: Thread.sleep(5000)

		//2. Dynamic Wait: 10 secs --> 2 secs:
			//a. Implicitly wait
			//b. Explicit wait
				//b.1: WebDriverWait
				//b.2: FluentWait
		//dynamic wait: 10 --> 0 --> 10 secs ignored --> 0 secs will be applied
		//static wait: 10 --> 0 --> 10 secs will be applied

	}

}
