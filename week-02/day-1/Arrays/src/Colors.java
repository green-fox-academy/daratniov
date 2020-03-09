public class Colors {
    public static void main(String[] args) {
        String[][] colors={{"lime","forest green","olive","pale green","spring green"},{"orange red","red","tomato"},
                {"orchid","violet","pink","hot pink"}};
        for (String[] row:colors){
            for (String color:row) {
                System.out.print(color + ", ");
            }
            System.out.println();
        }
    }
}
