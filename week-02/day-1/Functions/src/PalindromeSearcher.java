import java.util.ArrayList;
import java.util.List;

public class PalindromeSearcher {
    public static void main(String[] args) {
        String palindrome="dog goat dad duck doodle never";
        System.out.println(searchPalindrome(palindrome));
    }
    public static List searchPalindrome(String palindrome)
    {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < palindrome.length() ; i++) {
            for(int j=i+2;j<palindrome.length();j++)
            {
                if(palindrome.charAt(i)==palindrome.charAt(j))
                {
                    String word=String.valueOf(palindrome.toCharArray(),i,j-i+1);
                    if(isPalindrome(word)) list.add(word);
                }
            }
        }
        return list;
    }
    public static boolean isPalindrome(String word)
    {
        for (int i = 0; i <word.length() ; i++) {
            if(word.charAt(i)!=word.charAt(word.length()-i-1)) return false;
        }
        return true;
    }
}