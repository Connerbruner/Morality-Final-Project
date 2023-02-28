import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Boolean> choices = new ArrayList<>();

    public static void main(String[] args) {
        print("Welcome to tough questions. Todays topic is...");
        addchoice("Do you think its ever ok to take someones life");
        if (choices.get(0)) {
            addchoice("What if its in self defense?");
            if (!choices.get(1)) {
                addchoice("So my life ends if someone tries to kill me. I dont get to fight back?");
                if(!choices.get(2)) {
                    addchoice("Is ok if I accidentally kill someone while fighting back");
                }
            } else {
                addchoice();
            }
        } else {

        }
    }

    public static boolean choice(String str) {
        System.out.println(str);
        for (int i = (str.length() / 2)-5; i > 0; i--) {
            System.out.print(" ");
        }
        System.out.println("Y or N");
        for (int i = (str.length() / 2)-15; i > 0; i--) {
            System.out.print(" ");
        }
        System.out.println("(Enter answer then press enter)");

        return input.nextLine() == "Y";
    }

    public static void addchoice(String str) {
        choices.add(choice(str));
    }

    public static void print(String str) {
        System.out.println(str);
        System.out.println("Press Enter");
        input.nextLine();
    }

    public static boolean getchoice(int index) {
        return choices.get(index);
    }
}