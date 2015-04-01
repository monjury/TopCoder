import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MountainWalkTest {

    protected MountainWalk solution;

    @Before
    public void setUp() {
        solution = new MountainWalk();
    }

    @Test
    public void testCase0() {
        String[] areaMap = new String[]{"056", "135", "234"};
        int heightDifference = 1;

        int expected = 5;
        int actual = solution.cellsVisited(areaMap, heightDifference);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] areaMap = new String[]{"056", "195", "234"};
        int heightDifference = 1;

        int expected = 8;
        int actual = solution.cellsVisited(areaMap, heightDifference);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] areaMap = new String[]{"865", "123", "111"};
        int heightDifference = 3;

        int expected = 9;
        int actual = solution.cellsVisited(areaMap, heightDifference);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] areaMap = new String[]{"00009876543210", "00009876543210", "00009876543210", "00009876543210"};
        int heightDifference = 8;

        int expected = 16;
        int actual = solution.cellsVisited(areaMap, heightDifference);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] areaMap = new String[]{"0000", "0000", "0000", "0000", "9999", "8888", "7777", "6666", "5555", "4444", "3333", "2222", "1111", "0000"};
        int heightDifference = 3;

        int expected = 16;
        int actual = solution.cellsVisited(areaMap, heightDifference);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String[] areaMap = new String[]{"173642855131893831828253420", "126290035950506994475683704", "381277675415026563959463393", "019782700912864681764582260", "496448425114634806770407597", "049628433145840178727435051", "117194708226266248973780562", "398138380998246682323622510", "408178777661559971959512111"};
        int heightDifference = 8;

        int expected = 135;
        int actual = solution.cellsVisited(areaMap, heightDifference);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        String[] areaMap = new String[]{"9"};
        int heightDifference = 0;

        int expected = 1;
        int actual = solution.cellsVisited(areaMap, heightDifference);

        Assert.assertEquals(expected, actual);
    }

}
