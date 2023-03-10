import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static Random random = new Random();
    static boolean currentChoice = false;
    static boolean startingChoice = false;
    static ArrayList<Boolean> choices = new ArrayList<>();
    static String[] questions = {
            "wants to die?",
            "has taken others lives",
            "would suffer more alive then dead",
            "is going to take my life",
            "might try to take a group of peoples life",
            "is hated by a large group of people",
            "is a old dog",
            "has unrightfully stolen a large sum off money from many people",
            "is going to die but his cure cost too much",
            "could have killed a group of people",
            "is ugly",
            "could be creating something that could be harmful to people",
            "is annoying",
    };
    static Person[] thoughts = {
            new Person("Conner", new String[]{
                    "What if billy is going suffer and putting him out of it would be better",
                    "If Billy has to have his life taken for the greater good then we should able ",
            }, true),
            new Person("Earnest", new String[]{
                    "If they should die they should die",
                    "They insulted my mother what I am gonna do?"
            }, true),
            new Person("Juniper", new String[]{
                    "Have you seen jeff bezos",
                    "If someone is trying to kill me... This is why I keep the bar"
            }, false),
            new Person("Sarah", new String[]{
                    "If they need to die",
                    "if they are trying to kill you",
                    "If they are a bad person"
            }, true),
            new Person("Camden", new String[]{
                    "If they are trying to kill you",
                    "will not not shut up"
            }, true),
            new Person("Mr Peck", new String[]{
                    "If someone who has killed someone",
                    "Less of a punishment and more as release",
            }, true),
            new Person("Mr Peck", new String[]{
                    "Its a human right",
                    "We want to hold ourselves higher than animals"
            }, false),
            new Person("Ms Storer", new String[]{
                    "moments of self defense"
            }, true),
            new Person("Chef", new String[]{
                    "If they are ",
                    "If they are endangering a large number of people",
                    "committing a unforgivable crime",
            },true   ),
            new Person("Alison", new String[]{
                    "if its life or death against them",
                    "if they are kill others the ok",

            },true ),
            new Person("Mom", new String[]{
                    "in self defense its ok",
            },true ),

    };
    static ArrayList<String> questionsLeft = new ArrayList<>();
    static ArrayList<Person> thoughtsLeft = new ArrayList<>();

    public static void main(String[] args) {
        print("???: Meet Billy");
        Collections.addAll(questionsLeft, questions);
        Collections.addAll(thoughtsLeft, thoughts);
        addchoice("???: Do you think its ok if I take Billy's life");
        print("???: Weird question huh?");
        print("???: When you ask someone a question with a morally gray answer then bring up hypotheticals about that question then people flip flop between yes and no.");
        print("???: This is really interesting to because it means that many people think that many things are gray not black or white.");
        print("???: Now let me prove it to you");
        startingChoice = currentChoice;
        while (questionsLeft.size() > 0) {
            int index = random.nextInt(questionsLeft.size());
            addchoice("Now Lets say that billy " + questionsLeft.get(index) + "? In this case is ok to take Billy's life?");
            if (thoughtsLeft.size() > 0 && currentChoice != startingChoice) {
                print("???: See works like a charm. Its never just black or white. Its case by case");
                print("???: Now lets see what your peers think.");
                int index2 = random.nextInt(thoughtsLeft.size());
                print(thoughtsLeft.get(index2).thought());
                thoughtsLeft.remove(index2);

            }
            questionsLeft.remove(index);
        }
        print("???: As you can see its hard to not change your thoughts given new info");
        print("???: This means that actions that people have done really should based on context and not on what has been done");
        print("Each person in the program was sourced from the people around me ");
    }

    public static boolean choice(String str) {
        System.out.println(str);
        for (int i = (str.length() / 2) - 5; i > 0; i--) {
            System.out.print(" ");
        }
        System.out.println("Y or N");
        for (int i = (str.length() / 2) - 15; i > 0; i--) {
            System.out.print(" ");
        }
        System.out.println("(Enter answer then press enter)");
        return input.nextLine().contains("Y");
    }

    public static void addchoice(String str) {
        currentChoice = choice(str);
        choices.add(currentChoice);

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