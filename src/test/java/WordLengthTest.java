import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class WordLengthTest {

    // DataProvider for testing both methods with valid input and output
    @DataProvider(name = "dpGetStrings")
    public static Object[] sentences() {
        // This is is a multi-dimensional array holding the input string arguments and expected return values in the form of a List for both the getLongestString and getShortestString methods

        return new Object[][]{
                {"", Arrays.asList("", 0), Arrays.asList("", 0)}, // empty string test
                {" ",Arrays.asList("", 0), Arrays.asList("", 0)},
                {"Hey", Arrays.asList("Hey", 3), Arrays.asList("Hey", 3)},
                {"test_2 was a piece of cake", Arrays.asList("test_2", 6), Arrays.asList("a", 1)},
                {"aszdf is the most difficult name to pronounce", Arrays.asList("difficult", 9), Arrays.asList("is", 2)}, // Two longest words and two shortest words, first one is returned
                {"I say life is unfair. But, maybe I'm wrong.", Arrays.asList("unfair.", 7), Arrays.asList("I", 1)} // Period counts as part of the word
        };
    }

    // DataProvider for testing both methods for expected exceptions
    @DataProvider(name = "dpExceptions")
    public static Object[] exceptions() {
        return new Object[][]{
                {null}
        };
    }

    // Test the getLongestString method with valid input
    @Test(dataProvider = "dpGetStrings")
    public void getLongestStringTest(String test, List expectedLongestString, List expectedShortestString) throws Exception {
        List result = WordLength.getLongestString(test);
        Assert.assertEquals(result,expectedLongestString);
    }

    // Test the getLongestString method with expected exception
    @Test(dataProvider = "dpExceptions", expectedExceptions = { Exception.class}, expectedExceptionsMessageRegExp = "The input string can not be null")
    public void getLongestStringExceptionTest(String nul) throws Exception {
        WordLength.getLongestString(nul);
    }

    // Test the getShortestString method with valid input
    @Test(dataProvider = "dpGetStrings")
    public void getShortestStringTest(String test, List expectedLongestString, List expectedShortestString) throws Exception {
        List result = WordLength.getShortestString(test);
        Assert.assertEquals(result,expectedShortestString);
    }

    // Test the getShortestString method with expected exception
    @Test(dataProvider = "dpExceptions", expectedExceptions = { Exception.class}, expectedExceptionsMessageRegExp = "The input string can not be null")
    public void getShortestStringExceptionTest(String nul) throws Exception {
        WordLength.getShortestString(nul);
    }

}

