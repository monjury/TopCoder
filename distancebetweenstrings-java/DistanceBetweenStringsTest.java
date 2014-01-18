import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DistanceBetweenStringsTest {

    protected DistanceBetweenStrings solution;

    @Before
    public void setUp() {
        solution = new DistanceBetweenStrings();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String a = "topcoder";
        String b = "contest";
        String letterSet = "tcp";

        int expected = 2;
        int actual = solution.getDistance(a, b, letterSet);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String a = "abcdef";
        String b = "fedcba";
        String letterSet = "fed";

        int expected = 0;
        int actual = solution.getDistance(a, b, letterSet);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String a = "aaaaa";
        String b = "bbbbb";
        String letterSet = "a";

        int expected = 25;
        int actual = solution.getDistance(a, b, letterSet);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String a = "aaAaB";
        String b = "BbaAa";
        String letterSet = "ab";

        int expected = 2;
        int actual = solution.getDistance(a, b, letterSet);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String a = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String b = "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb";
        String letterSet = "ba";

        int expected = 5000;
        int actual = solution.getDistance(a, b, letterSet);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String a = "ToPcOdEr";
        String b = "tOpCoDeR";
        String letterSet = "wxyz";

        int expected = 0;
        int actual = solution.getDistance(a, b, letterSet);

        Assert.assertEquals(expected, actual);
    }

}
