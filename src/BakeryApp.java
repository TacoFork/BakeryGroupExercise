public class BakeryApp {
    public static void main(String[] args){
        BakeryClass bakery = new BakeryClass();
        String input = bakery.user_input();
        bakery.restrictions(input);
    }
}
