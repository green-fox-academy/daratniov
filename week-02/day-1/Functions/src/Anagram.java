import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String word1="eleven plus two";
        String word2="twelve plus one";
        System.out.println(isAnagram(word1,word2));
    }
    public static boolean isAnagram(String str1,String str2)
    {
        int space=0;
        for (int i = 0; i <str1.length(); i++) {
            if(str1.charAt(i)==' ') space++;
        }
        char[] word1=new char[str1.length()-space];
        space=0;
        for (int i = 0; i <str2.length(); i++) {
            if(str2.charAt(i)==' ') space++;
        }
        char[] word2=new char[str2.length()-space];
        if(word1.length!=word2.length) return false;
        for (int i = 0,j=0; i <str1.length() ; i++) {
            if (str1.charAt(i) != ' ') {
                word1[j] = str1.charAt(i);
                j++;
            }
        }
        for (int i = 0,j=0; i <str2.length() ; i++) {
            if (str2.charAt(i) != ' ') {
                word2[j] = str2.charAt(i);
                j++;
            }
        }
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1,word2);
    }
}
