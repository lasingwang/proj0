import java.util.Locale;

public class Palindrome {
    public Deque<Character> wordToDeque(String word){
        Deque<Character> a = new LinkedListDeque<Character>();
        for (int i = 0; i < word.length(); i++ ) {
            a.addLast(word.charAt(i)) ;
        }
        return a;
    }
   /* public boolean isPalindrome(String word){
        Palindrome b = new Palindrome();
        Deque<Character> sample = b.wordToDeque( word );
        for (int i = 0; i < sample.size()/2; i++) {
            if (sample.getRecursive(i) != sample.getRecursive(sample.size() - 1 - i)) {
                return false;
            }
        }
        return true;
    }*/
   public boolean isPalindrome(String word) {
       //word = word.toLowerCase();
       Palindrome b = new Palindrome();
       Deque<Character> sample = b.wordToDeque( word );
       for (int i = 0; i < sample.size()/2; i++) {
           char first = sample.removeFirst();
           char last = sample.removeLast();
           if (first != last) {
               return false;
           }
       }
       return  true;
   }
    public boolean isPalindrome(String word, CharacterComparator cc) {
        Palindrome b = new Palindrome();
        Deque<Character> sample = b.wordToDeque( word );
        for (int i = 0; i < sample.size()/2; i++) {
            char first = sample.removeFirst();
            char last = sample.removeLast();
            if (!cc.equalChars(first,last)) {
                return false;
            }
        }
        return  true;
    }
}
