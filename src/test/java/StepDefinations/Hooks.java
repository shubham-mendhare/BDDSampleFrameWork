package StepDefinations;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@production")
	public void Setup() {
		System.out.println("**********************************");
		System.out.println("This is production setup");
	}

}
