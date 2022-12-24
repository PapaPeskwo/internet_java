// Learning is capitalized
public class Learning {

    public static void main(String[] args) {
        //primite types, how they are interpreted
        double y = 5.5;
        int x = (int)y;
        boolean happy = true;
        char favoriteChar = 't'; //single quote and only one letter
        //System.out.println(x + " " + y);


        String name = "Tomi"; // String is capitalized
        String yourName = "Tomi";

        System.out.println(name == yourName); // Will return True, but is not the proper way to do it
        System.out.println(name.equals(yourName)); // This is the proper way to do it

        
    }
}