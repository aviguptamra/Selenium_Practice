import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MyAssertion {
    @Test
    public void AssertSoft()
    {
        SoftAssert softAssert=new SoftAssert();
        System.out.println("Test 1 starting");
        softAssert.assertEquals(1,0,"Hello there");
        System.out.println("Test 1 completed");

        System.out.println("Test 2 started");
        softAssert.assertEquals(1,1);
        System.out.println("Test 2 completed");
        softAssert.assertAll();

    }
}
