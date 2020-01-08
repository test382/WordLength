
import java.util.Arrays;
import java.util.List;

public class WordLength {

    public static List getLongestString(String sentence) throws Exception {
        int maxLength = 0;
        String longestString = "";
        // If the input string is null (no input), throw an Exception with the message below. We're masking the default behavior which is to throw a NullPointerException.
        if (sentence==null) throw new Exception("The input string can not be null");
        // split the sentence using space as a delimiter
        String[] wordArray = sentence.split(" ");
        for (String word : wordArray) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestString = word;
            }
        }

        // A list to hold the longest word and length. Array would be faster but can't hold different object types.
        return Arrays.asList(longestString, maxLength);
    }

    public static List getShortestString(String sentence) throws Exception{

        // If the input string is null (no input), throw an Exception with the message below. We're masking the default behavior which is to throw a NullPointerException.
        if (sentence==null) throw new Exception("The input string can not be null");
        // split the sentence using space as a delimiter
        if (sentence.equals(" ")) return Arrays.asList("", 0);
        String[] wordArray = sentence.split(" ");

        // Initialize the shortest word to be the first word and the shortest length to be its length
        String shortestString = wordArray[0];
        int minLength = wordArray[0].length();

        // Iterate over the array and do the comparison
        for (String word : wordArray) {
            if (word.length() < minLength) {
                minLength = word.length();
                shortestString = word;
            }
        }
        // A list to hold the longest word and length.
        return Arrays.asList(shortestString, minLength);
    }

}