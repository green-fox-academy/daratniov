public class PalindromeBuilder {
    public static void main(String[] args) {
        String word="Greenfox";
        System.out.println(createPalindrome(word));
    }
    public static char[] createPalindrome(String word)
    {
        char[] palindrome=new char[2*word.length()];
        int j=0;
        for (int i = 0; i <word.length() ; i++) {
            palindrome[j]=word.charAt(i);
            j++;
        }
        for (int i = word.length()-1; i >=0 ; i--) {
            palindrome[j]=word.charAt(i);
            j++;
        }
        return palindrome;
    }
}
