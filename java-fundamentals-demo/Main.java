public class Main {

    public static void main(String[] args) {
//	Model model = "Astromech";
        Droid r2d2 = new Droid("r2d2", "Astromech", "Starship repair/support");

        System.out.println(r2d2);
        r2d2.speak();
    }
}
