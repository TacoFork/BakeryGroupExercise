import java.util.Scanner;
import java.util.ArrayList;

public class BakeryClass {
    private Scanner keyboard = new Scanner(System.in);
    private ArrayList<ArrayList> baked_goods = new ArrayList<>();
    private ArrayList<String> banana_bread = new ArrayList<>();
    private ArrayList<String> cinnamon_bread = new ArrayList<>();
    private ArrayList<String> raisin_bread = new ArrayList<>();
    private ArrayList<String> muffins = new ArrayList<>();
    private ArrayList<String> plain_rolls = new ArrayList<>();
    private ArrayList<String> savory_rolls = new ArrayList<>();
    private ArrayList<String> white_bread = new ArrayList<>();
    private ArrayList<String> pizza_crust = new ArrayList<>();
    private ArrayList<String> hamburger_buns = new ArrayList<>();
    private ArrayList<String> apple_pie = new ArrayList<>();
    private ArrayList<String> wheat_bread = new ArrayList<>();
    private ArrayList<String> halla_bread = new ArrayList<>();
    private ArrayList<String> danish = new ArrayList<>();
    private ArrayList<String> scone = new ArrayList<>();
    private ArrayList<String> bread_pudding = new ArrayList<>();

    public BakeryClass(){
        baked_goods.add(banana_bread);
        baked_goods.add(cinnamon_bread);
        baked_goods.add(raisin_bread);
        baked_goods.add(muffins);
        baked_goods.add(plain_rolls);
        baked_goods.add(savory_rolls);
        baked_goods.add(white_bread);
        baked_goods.add(pizza_crust);
        baked_goods.add(hamburger_buns);
        baked_goods.add(apple_pie);
        baked_goods.add(wheat_bread);
        baked_goods.add(halla_bread);
        baked_goods.add(danish);
        baked_goods.add(scone);
        baked_goods.add(bread_pudding);

        banana_bread.add("Banana Bread");
        banana_bread.add("$5.00");
        banana_bread.add("07/20/2021");
        banana_bread.add("10");
        banana_bread.add("gluten");
        banana_bread.add("dairy");
        banana_bread.add("soy");
        banana_bread.add("peanuts");
        banana_bread.add("sesame");

        cinnamon_bread.add("Cinnamon Bread");
        cinnamon_bread.add("$7.00");
        cinnamon_bread.add("07/16/2021");
        cinnamon_bread.add("7");
        cinnamon_bread.add("dairy");
        cinnamon_bread.add("eggs");
        cinnamon_bread.add("soy");
        cinnamon_bread.add("peanuts");
        cinnamon_bread.add("sesame");

        raisin_bread.add("Raisin Bread");
        raisin_bread.add("$8.00");
        raisin_bread.add("07/18/2021");
        raisin_bread.add("2");
        raisin_bread.add("gluten");
        raisin_bread.add("eggs");
        raisin_bread.add("peanuts");
        raisin_bread.add("sesame");

        muffins.add("Muffins");
        muffins.add("$4.00");
        muffins.add("07/22/2021");
        muffins.add("6");
        muffins.add("gluten");
        muffins.add("dairy");
        muffins.add("eggs");
        muffins.add("soy");
        muffins.add("peanuts");

        plain_rolls.add("Plain Rolls");
        plain_rolls.add("$5.00");
        plain_rolls.add("07/23/2021");
        plain_rolls.add("15");
        plain_rolls.add("dairy");
        plain_rolls.add("eggs");
        plain_rolls.add("peanuts");
        plain_rolls.add("sesame");

        savory_rolls.add("Savory Rolls");
        savory_rolls.add("$6.00");
        savory_rolls.add("07/22/2021");
        savory_rolls.add("12");
        savory_rolls.add("gluten");
        savory_rolls.add("soy");
        savory_rolls.add("peanuts");
        savory_rolls.add("sesame");

        white_bread.add("White Bread");
        white_bread.add("$4.00");
        white_bread.add("07/28/2021");
        white_bread.add("16");
        white_bread.add("soy");
        white_bread.add("peanuts");
        white_bread.add("sesame");

        pizza_crust.add("Pizza Crust");
        pizza_crust.add("$3.50");
        pizza_crust.add("07/29/2021");
        pizza_crust.add("10");
        pizza_crust.add("gluten");
        pizza_crust.add("dairy");
        pizza_crust.add("eggs");
        pizza_crust.add("soy");
        pizza_crust.add("peanuts");
        pizza_crust.add("sesame");

        hamburger_buns.add("Hamburger Buns");
        hamburger_buns.add("$4.00");
        hamburger_buns.add("07/19/2021");
        hamburger_buns.add("16");
        hamburger_buns.add("soy");
        hamburger_buns.add("peanuts");
        hamburger_buns.add("sesame");

        apple_pie.add("Apple Pie");
        apple_pie.add("$10.00");
        apple_pie.add("07/28/2021");
        apple_pie.add("8");
        apple_pie.add("soy");
        apple_pie.add("peanuts");
        apple_pie.add("sesame");

        wheat_bread.add("Wheat Bread");
        wheat_bread.add("$6.00");
        wheat_bread.add("07/29/2021");
        wheat_bread.add("9");
        wheat_bread.add("gluten");
        wheat_bread.add("dairy");
        wheat_bread.add("soy");
        wheat_bread.add("peanuts");
        wheat_bread.add("sesame");

        halla_bread.add("Halla Bread");
        halla_bread.add("$4.00");
        halla_bread.add("07/16/2021");
        halla_bread.add("7");
        halla_bread.add("gluten");
        halla_bread.add("dairy");
        halla_bread.add("eggs");
        halla_bread.add("soy");
        halla_bread.add("peanuts");

        danish.add("Danish");
        danish.add("$3.00");
        danish.add("07/26/2021");
        danish.add("12");
        danish.add("soy");
        danish.add("peanuts");
        danish.add("sesame");

        scone.add("Scone");
        scone.add("$2.00");
        scone.add("07/26/2021");
        scone.add("13");
        scone.add("gluten");
        scone.add("dairy");
        scone.add("soy");
        scone.add("peanuts");

        bread_pudding.add("Bread Pudding");
        bread_pudding.add("$3.00");
        bread_pudding.add("07/29/2021");
        bread_pudding.add("8");
        bread_pudding.add("eggs");
        bread_pudding.add("soy");
        bread_pudding.add("sesame");
    }

    public String user_input(){
        System.out.println("Welcome to the Brookley's Better Bakery App");
        System.out.println("We contain gluten, dairy, eggs, soy, peanuts, sesame\n");
        System.out.print("To search for foods that you can eat, please enter the name of the diet restriction or type all to see a list of all foods: ");
        return keyboard.next();
    }

    public void restrictions(String user_restriction){
        if (user_restriction != "all") {
            for (int index = 0; index < baked_goods.size(); index++) {
                for (int nest_index = 0; nest_index < baked_goods.get(index).size(); nest_index++) {
                    if (user_restriction.equals(baked_goods.get(index).get(nest_index))) {
                        System.out.println("Name: " + baked_goods.get(index).get(0));
                        System.out.println("Price: " + baked_goods.get(index).get(1));
                        System.out.println("Expiration Date: " + baked_goods.get(index).get(2));
                        System.out.println("Quantity: " + baked_goods.get(index).get(3) +"\n");
                    }
                }
            }
        }
        else{
            for (int index = 0; index < baked_goods.size(); index++) {
                for (int nest_index = 0; nest_index < baked_goods.get(index).size(); nest_index++) {
                    System.out.println("Name: " + baked_goods.get(index).get(0));
                    System.out.println("Price: " + baked_goods.get(index).get(1));
                    System.out.println("Expiration Date: " + baked_goods.get(index).get(2));
                    System.out.println("Quantity: " + baked_goods.get(index).get(3) + "\n");
                }
            }
        }
    }
}
