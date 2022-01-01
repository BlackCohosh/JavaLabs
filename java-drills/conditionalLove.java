public class conditionalLove {

    public static String sabreHandle = "black";
    public static String sabreBlade = "purple";
    public static String shipAvailable = "Mellenium Falcon";
    public static int itemPrice = 4;
    public static boolean recommended = true;

    public static void main(String[] args) {
//        if(sabreHandle == "black" && sabreBlade == "purple") {
//            System.out.println("This one's mine!");
//        } else
//            System.out.println("Pass");
//    }
        String sabreChoice = (sabreHandle == "black" && sabreBlade == "purple") ? "This one's mine" : "Pass";
        System.out.println(sabreChoice);
    }

    public static void shipChoice(String[] args) {
        if(shipAvailable == "Mellenium Falcon") {
            System.out.println("let's go");
        } else
            System.out.println("I better hide somewhere.");
    }
//
    public static void itemChoice(String[] args) {
        if(itemPrice < 5 && recommended = true) {
            boolean willTry = true;
        } //else
           // willTry = false;
        System.out.println(willTry);
    }
//
//    public static void main(String[] args) {
//        if(drinkPrice < 1 || drinkSize > 24) {
//            willOrder = true;
//        } else
//            willTry = false;
//    }
}
