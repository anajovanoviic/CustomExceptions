


//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter age");
//
//        int age = sc.nextInt();
//        System.out.println("You entered:" + age );
//
//        if ( age<18 ) {
//            throw new AgeException();
//        }
//        else
//            System.out.println("You can vote");
//        System.out.println("End of Main");
//
//    }
//}


//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) throws AgeException1 {
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter age");
//
//        int age = sc.nextInt();
//        System.out.println("You entered:" + age );
//
//        if ( age<18 ) {
//            throw new AgeException1();
//        }
//        else
//            System.out.println("You can vote");
//        System.out.println("End of Main");
//
//    }
//}


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");

        int age = sc.nextInt();
        System.out.println("You entered:" + age );

        if ( age<18 ) {
            try {
                throw new AgeException1();

            }
            catch (AgeException1 ae) {
                System.out.println(ae);
            }
        }
        else
            System.out.println("You can vote");
        System.out.println("End of Main");

    }
}


