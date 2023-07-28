//15.


import org.testng.annotations.Test;

public class TestNGGroupsDemo {

    @Test(groups = "group1")
    public void testMethod1() {
        System.out.println("Test Method 1 belongs to Group 1");
    }

    @Test(groups = "group1")
    public void testMethod2() {
        System.out.println("Test Method 2 belongs to Group 1");
    }

    @Test(groups = "group2")
    public void testMethod3() {
        System.out.println("Test Method 3 belongs to Group 2");
    }

    @Test(groups = "group2")
    public void testMethod4() {
        System.out.println("Test Method 4 belongs to Group 2");
    }
}
