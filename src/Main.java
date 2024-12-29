public class Main {
    public static void main(String[] args) {

        /*Burger burger = new Burger("regular", 4.00);
        burger.addToppings("BACON", "CHEESE", "MAYO");
        burger.printItem();*/

        /*MealOrder regularMeal = new MealOrder();
        regularMeal.addBurgerToppings("CHEESE", "BACON", "MAYO");
        regularMeal.setDrinkSide("LARGE");
        regularMeal.printItemizedList();*/

        MealOrder secondMeal = new MealOrder("turkey", "7-up", "chili");
        secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
        secondMeal.setDrinkSide("SMALL");
        secondMeal.printItemizedList();
    }
}