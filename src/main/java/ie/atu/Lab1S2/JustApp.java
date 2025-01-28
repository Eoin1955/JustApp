package ie.atu.Lab1S2;

import java.util.ArrayList;

public class JustApp {
    public static void main(String[] args) {
        ArrayList<Food> items = new ArrayList<>();
        float totalPrice = 0;

        System.out.println("Welcome to Just App");
        System.out.println("You ordered: ");

        //add some items burgers, pizza, fries, salad
        Burger cheeseBurger = new Burger("CheeseBurger", 1.99, "Tasty");
        Pizza tuna = new Pizza("Tuna Pizza", 8.99, "Very Tasty");
        Pizza classic = new Pizza("plain", 9.99, "Cheese");
        Fries Curry = new Fries("curry", 1.99, "ugh");
        Desserts Cake = new Desserts("Cheesecake", 10.99, "cheesey");
        //add all the order to a collection
        items.add(cheeseBurger);
        items.add(tuna);
        items.add(classic);
        items.add(Curry);
        items.add(Cake);
        //display all the orders
        for(Food item: items)
        {
            System.out.print("Name: ");
        System.out.println(item.getName());
            System.out.print("Price: €");
        System.out.println(item.getPrice());
            System.out.print("Description: ");
        System.out.println(item.getDescription());
            System.out.println("");
        }

        for(Food item: items){
            totalPrice += item.getPrice();
        }
        System.out.println("Your total Price: €" + totalPrice);

        }
    }

