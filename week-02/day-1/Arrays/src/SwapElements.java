public class SwapElements {
    public static void main(String[] args) {
        String[] orders={"first","second","third"};
        String swapper=orders[0];
        orders[0]=orders[2];
        orders[2]=swapper;
        for (String order:orders) {
            System.out.println(order);
        }
    }
}