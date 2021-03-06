import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MatrixShiftingsTest {

    protected MatrixShiftings solution;

    @Before
    public void setUp() {
        solution = new MatrixShiftings();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] matrix = new String[]{"136", "427", "568", "309"};
        int value = 2;

        int expected = 2;
        int actual = solution.minimumShifts(matrix, value);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 200000)
    public void testCase1() {
        String[] matrix = new String[]{"0000", "0000", "0099"};
        int value = 9;

        int expected = 2;
        int actual = solution.minimumShifts(matrix, value);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000000)
    public void testCase2() {
        String[] matrix = new String[]{"0123456789"};
        int value = 7;

        int expected = 3;
        int actual = solution.minimumShifts(matrix, value);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] matrix = new String[]{"555", "555"};
        int value = 1;

        int expected = -1;
        int actual = solution.minimumShifts(matrix, value);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] matrix = new String[]{"12417727123", "65125691886", "55524912622", "12261288888"};
        int value = 9;

        int expected = 6;
        int actual = solution.minimumShifts(matrix, value);

        Assert.assertEquals(expected, actual);
    }
    
    @Test(timeout = 2000000000)
    public void testCase5() {
        String[] matrix = new String[]{"5255562122845300462489141128026009694334864751473", "1904854063160796449573449832138433088147793836562", "9760133164975805690282407824719156431237067912331"};
        int value = 0;

        int expected = 3;
        int actual = solution.minimumShifts(matrix, value);

        Assert.assertEquals(expected, actual);
    }

}
