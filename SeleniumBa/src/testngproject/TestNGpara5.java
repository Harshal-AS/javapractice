package testngproject;

import org.testng.annotations.Test;

public class TestNGpara5 {

	

		@Test(dependsOnMethods="signIn",enabled=true)
		public void login() {
			System.out.println("Hello, I am login from Example_Param1 class");
		}
		@Test(dependsOnMethods="login",enabled=true)
		public void checkNotification() {
			System.out.println("Hello, I am checkNotification from Example_Param1 class");
		}
		@Test(enabled=true,expectedExceptions=ArithmeticException.class)
		public void signIn() {
			System.out.println("Hello, I am signIn from Example_Param1 class");
			int i=10/0;
			System.out.println("Signin method is completed");//won't get executed due to exception at line number 18
		}
	}