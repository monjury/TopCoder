import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalendarRecycleTest {

    protected CalendarRecycle solution;

    @Before
    public void setUp() {
        solution = new CalendarRecycle();
    }

    @Test(timeout = 2000000000)
    public void testCase0() {
        int year = 2002;

        int expected = 2013;
        int actual = solution.useAgain(year);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000000000)
    public void testCase1() {
        int year = 2013;

        int expected = 2019;
        int actual = solution.useAgain(year);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000000000)
    public void testCase2() {
        int year = 2008;

        int expected = 2036;
        int actual = solution.useAgain(year);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000000000)
    public void testCase3() {
        int year = 9999;

        int expected = 10010;
        int actual = solution.useAgain(year);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000000000)
    public void testCase4() {
        int year = 2525;

        int expected = 2531;
        int actual = solution.useAgain(year);

        Assert.assertEquals(expected, actual);
    }

}
