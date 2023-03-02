import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);
    static boolean currentChoice = false;
    static boolean startingChoice = false;
    static ArrayList<Boolean> choices = new ArrayList<>();
    static String[] questions = {
            "wants to die?",
            "has taken others lifes",
            "would suffer more alive then dead",
            "is going to take my life",
            "might try to take a group of peoples life",
            "is hated by a large group of people",
            "is a old dog",
            "has unrightfully stolen a large sum off money from many people",
            "is going to die but his cure cost too much",
    };
    static String[] evidence = {
            "",
    };
    static ArrayList<String> questionsleft = new ArrayList<>();
    static ArrayList<String> evidenceleft = new ArrayList<>();
    public static void main(String[] args) {
        print("???: Meet Billy");
        for(String question : questions)
        {
            questionsleft.add(question);
        }
        addchoice("???: Do you think its ok if I take Billy's life");
        startingChoice=currentChoice;
        while (questionsleft.size()>0){
            int index = new Random().nextInt(questionsleft.size());
            addchoice("What if billy "+questionsleft.get(index)+"? Now is ok to take Billy's life?");
            questionsleft.remove(index);

            if(currentChoice!=startingChoice) {
                print("???: Its funny to watch you change your thoughts on billy so quickly just based on the fact I told you that billy "+questionsleft.get(index));
            }
            if(evidenceleft.size()>0 && (questionsleft.size()%evidenceleft.size()==0)) {
                print(evidenceleft.get(0));
                int index2 = new Random().nextInt(questionsleft.size());
                questionsleft.remove(index2);
            }
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