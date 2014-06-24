import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringTrainTest {

    protected StringTrain solution;

    @Before
    public void setUp() {
        solution = new StringTrain();
    }

    @Test(timeout = 2000000000)
    public void testCase0() {
        String[] cars = new String[]{"ABCDE", "CDFFF", "CDE", "CDEGG", "GABC"};

        String expected = "10 DEGABC";
        String actual = solution.buildTrain(cars);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000000000)
    public void testCase1() {
        String[] cars = new String[]{"AAAAA", "AAAAA", "AAAAA"};

        String expected = "7 A";
        String actual = solution.buildTrain(cars);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000000000)
    public void testCase2() {
        String[] cars = new String[]{"CABABDABAB", "CABAB", "ABABDABAB", "DABAB"};

        String expected = "15 CDAB";
        String actual = solution.buildTrain(cars);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000000000)
    public void testCase3() {
        String[] cars = new String[]{"ABABAB", "ABABAB", "ABABABAB", "BZZZZZ"};

        String expected = "15 ABZ";
        String actual = solution.buildTrain(cars);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000000000)
    public void testCase4() {
        String[] cars = new String[]{"A", "A", "A", "AA"};

        String expected = "1 A";
        String actual = solution.buildTrain(cars);

        Assert.assertEquals(expected, actual);
    }

}
