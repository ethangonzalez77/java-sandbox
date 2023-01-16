import java.util.Scanner;

public class Ex {

    public static void main(String[] args) {

        System.out.println("What's your name???");
        Scanner scan = new Scanner(System.in);

        String yourName = scan.nextLine();

        System.out.println("Cool beans, now how old are you???");
        System.out.println("If you dont mind me askin 😄");


        boolean isInt = scan.hasNextInt();
        int yourAge = scan.nextInt();



        System.out.println("Cool so your name is " + yourName + " and you are " + yourAge + " years old");


        if (isInt) {


            System.out.println("well nice to meet ya!!!!");



        }else {
            System.out.println("error");
        }


        scan.close();


    }
}

