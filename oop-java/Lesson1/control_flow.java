import java.util.Scanner;

public class control_flow {
    public static void main(String[] args) {
        int age = 12; //init

        /*if (age == 5) {
            System.out.println("hello");
        } else if (age <= 10) {
            System.out.println("Whats up");
        } else if (age > 20) {
            System.out.println("hey there");
        } else {
            System.out.println("what are you");
        }*/

        /*while(age < 20) { //condition
            System.out.println(age);
            age++; //update
        }

        for(int a =12; a < 20; a++) { //does the same as above
            System.out.println(a);
        }*/
        System.out.print("What's your name?: ");
        Scanner in = new Scanner(System.in);
        String response; // in scope
        do {
            response = in.nextLine();

            if (response.equals("Tomi")) {
                System.out.println("Tjabba tjena hallå Tomi");
            }
        } while(!response.equals("Tomi"));
    }
}
