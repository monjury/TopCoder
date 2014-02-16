import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PackingBallsDiv2Test {

    protected PackingBallsDiv2 solution;

    @Before
    public void setUp() {
        solution = new PackingBallsDiv2();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int R = 4;
        int G = 2;
        int B = 4;

        int expected = 4;
        int actual = solution.minPacks(R, G, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 20000000)
    public void testCase1() {
        int R = 1;
        int G = 7;
        int B = 1;

        int expected = 3;
        int actual = solution.minPacks(R, G, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 20000000)
    public void testCase2() {
        int R = 2;
        int G = 3;
        int B = 5;

        int expected = 4;
        int actual = solution.minPacks(R, G, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int R = 78;
        int G = 53;
        int B = 64;

        int expected = 66;
        int actual = solution.minPacks(R, G, B);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int R = 100;
        int G = 100;
        int B = 100;

        int expected = 100;
        int actual = solution.minPacks(R, G, B);

        Assert.assertEquals(expected, actual);
    }
    

    @Test(timeout = 2000)
    public void testCase5() {
        int R = 2;
        int G = 3;
        int B = 3;

        int expected = 3;
        int actual = solution.minPacks(R, G, B);

        Assert.assertEquals(expected, actual);
    }

}
