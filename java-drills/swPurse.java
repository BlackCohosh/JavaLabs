public class swPurse {
    private static float purse = 150;


    public static void main(String[] args) {
//        System.out.println(purse);
        double purchasePurse = purse - 24.3 - 45;
        double dicePurse = purchasePurse*2;
        double purseValue = dicePurse - dicePurse/10;
        System.out.println(purseValue);
    }
}

