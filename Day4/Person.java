package Day4;

import java.util.Scanner;

public class Person {
    private int age;

    public Person(int initialAge) {
        if (initialAge > 0)
            age = initialAge;
        else {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }

    public void amIOld() {
        String status;
        if(age<13){
            status = "You are young.";
        } else if(age>=13 && age <  18){
            status = "You are a teenager.";
        } else{
            status = "You are old.";
        }
        System.out.println(status);
    }

    public void yearPasses() {
        age++;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
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



