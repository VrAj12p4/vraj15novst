//16.


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProviderDemo {

    @DataProvider(name = "loginCredentials")
    public Object[][] provideLoginCredentials() {
        return new Object[][]{
        	{"unusepc@gmail.com", "3Jra-cZ3$9BWRa3"},
            {"fake@email.com", "password"},
            {"pc@gmail.com", "pass"}
        };
    }

    @Test(dataProvider = "loginCredentials")
    public void testLogin(String username, String password) {
        System.out.println("Logging in with username: " + username + " and password: " + password);
    }
}
