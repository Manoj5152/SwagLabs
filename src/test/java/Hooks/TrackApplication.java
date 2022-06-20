package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TrackApplication {
	@Before
	public void BeforeLaunch() {
		System.out.println("Welcome to Online Shopping");
	}
	
	@After
	public void AfterLauch() {
		System.out.println("Have a Nice day");
		
	}
}
