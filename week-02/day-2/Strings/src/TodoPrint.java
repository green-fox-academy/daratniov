public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        StringBuilder builder=new StringBuilder();
        builder.append(todoText);
        builder.insert(0,"My todo:\n");
        builder.append(" - Download games\n");
        builder.append("\t - Diablo\n");
        todoText=builder.toString();

        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        System.out.println(todoText);
    }
}
