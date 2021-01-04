import org.junit.Test;
import static org.junit.Assert.*;

public class TestPalindrome {
    /*// You must use this palindrome, and not instantiate
    // new Palindromes, or the autograder might be upset.*/
    static Palindrome palindrome = new Palindrome();
    static CharacterComparator cc = new OffByOne();
    @Test
    public void testWordToDeque() {
        Deque d = palindrome.wordToDeque("persiflage");
        String actual = "";
        for (int i = 0; i < "persiflage".length(); i++) {
            actual += d.removeFirst();
        }
        assertEquals("persiflage", actual);
    } //Uncomment this class once you've created your Palindrome class.
    @Test
    public void TestisPalindrome() {
        boolean a = palindrome.isPalindrome("p111p");
        assertTrue("sss",a);
    } //Uncomment this class once you've created your Palindrome class.
    @Test
    public void TestisPalindromeoff() {
        boolean a = palindrome.isPalindrome("7986",cc);
        assertTrue(a);
    }

}
