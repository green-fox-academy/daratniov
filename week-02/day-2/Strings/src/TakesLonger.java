import java.lang.StringBuilder;

public class TakesLonger {
    public static void main(String... args) {
        String quote ="Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        int index=quote.indexOf("you");
        StringBuilder builder=new StringBuilder();
        builder.append(quote,0,index);
        builder.append("always takes longer than ");
        builder.append(quote,index,quote.length()-1);
        quote=builder.toString();
        System.out.println(quote);

        // When saving this quote a disk error has occurred. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        System.out.println();
    }
}