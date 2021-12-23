import java.util.Scanner;

class Name {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The game is about to start...\n" +
                "Booting up...\n" +
                "...\n" +
                "...\n" +
                "...\n" +
                "Ready");

        System.out.println("What is your name?");

        String name = input.nextLine();
        System.out.println("Welcome to the Red Planet, " + name + ".");

        System.out.println("What is your favorite color?");

        String color = input.nextLine();  // Get user input
        System.out.println("Nice, I like " + color + " too");

        System.out.println("What color is your spacesuit?");

        String spacesuit = input.nextLine();
        System.out.println("Your " + spacesuit + "suit looks dashing!");

        System.out.println("Are you a Scientist or Soldier?");

        String occupation = input.nextLine();;
        System.out.println("Great! We can always use another " + occupation + " up here.");

        System.out.println("What is your pet's name?");

        String pet = input.nextLine();
        System.out.println("I'm sure " + pet + "will keep you company in the days ahead.");

        System.out.println("What is your greatest fear?");

        String fear = input.nextLine();
        System.out.println("Noted. we'll do our best to avoid exposure to " + fear + " whenever possible to avoid possible psychosis.");

        System.out.println("I can see it now:\n" +
                name + " and " + pet + " surfing the celestial abyss ...\n" +
                "in their " + spacesuit + " suits and " + color + "ship.\n" +
                name + " -- the day is here!\n" +
                "You crawl into the spaceship with " + pet + ".\n" +
                "Brace for take off!\n" +
                "5 ...\n" +
                "4 ...\n" +
                "3 ...\n" +
                "2 ...\n" +
                "1 ...\n" +
                "* LIFTOFF *");
    }
}
