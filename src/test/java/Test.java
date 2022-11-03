import org.testng.Assert;

public class Test {
    @org.testng.annotations.Test
    public void test(){
        int a = 5, b = 1;
        int expected = 6;
        int actual = a + b;
        Assert.assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void test1(){
        int a = 5, b = 1;
        int expected = 4;
        int actual = a - b;
        Assert.assertEquals(actual, expected);
    }
}
