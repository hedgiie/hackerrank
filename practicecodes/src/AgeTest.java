import java.io.*;
import java.util.*;


public class AgeTest {
    private int age;

    public AgeTest(int initialAge) {
        // Add some more code to run some checks on initialAge
        this.age = initialAge;
        if(this.age < 0 ) {
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        }
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
//        if(this.age < 0 ){
//            System.out.println("Age is not valid, setting age to 0.");
//        }else{
//            if(this.age > 0 && this.age < 13 ){
//                System.out.println("You are young.");
//            }else{
//                if(this.age <= 13 && this.age <= 18){
//                    System.out.println("You are a teenager.");
//                }
//                else if(this.age > 18){
//                    System.out.println("You are old.");
//                }
//            }
//        }

        // Write code determining if this person's age is old and print the correct statement:

        if(this.age >= 0 && this.age < 13 ) {
            System.out.println("You are young.");
        }
        if(this.age >= 13 && this.age < 18){
            System.out.println("You are a teenager.");
        }
        if (this.age >= 18){
            System.out.println("You are old.");
        }


    }

    public void yearPasses() {
        // Increment this person's age.
        this.age++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            AgeTest p = new AgeTest(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
