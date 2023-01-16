import org.w3c.dom.ls.LSOutput;

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






        //scanner with while loop.

        Scanner sc1 = new Scanner(System.in);

        int sum = 0;
        int counter = 0;


        while(true) {

            int order = counter + 1;

            System.out.println("Prompt: " + order + " Enter any number:");
            boolean isInt = sc1.hasNextInt();


            if (isInt) {
                sum +=  sc1.nextInt();
                counter++;

                if (counter == 10) {
                    break;
                }
            }else{
                System.out.println("Input invalid, please type numbers only.");
            }

            sc1.nextLine();

        }



        sc1.close();

        System.out.println("The total sum is : " + sum);











    }






}

