

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
            boolean hasInt = sc1.hasNextInt();


            if (hasInt) {
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



        //Scanner application that prompts the user to enter as many numbers as they want, and prints out there lowest number and their highest number.



        Scanner sc3 = new Scanner(System.in);

        boolean flag = true;
        int min = 0;
        int max = 0;



        while(true) {

            System.out.println("Enter a number: ");
            boolean hasInt = sc3.hasNextInt();



            if (hasInt) {

                int userInput = sc3.nextInt();

                if (flag) {
                    flag = false;
                    min = userInput;
                    max = userInput;
                }

                if (userInput < min) {
                    min = userInput;
                }


                if (userInput > max) {
                    max = userInput;
                }

            }else{
                System.out.println("Exiting program...");
                break;//always use a break, if not you'll get an error for the close() saying its a un reachable statement.
            }

            sc3.nextLine();

        }

        sc3.close();
        System.out.println();
        System.out.println("the min: " + min);
        System.out.println("the max: " + max);









        Scanner sc4 = new Scanner(System.in);

        boolean flag2 = true;
        int min2 = 0;
        int max2 = 0;

    while (true) {

        System.out.println("Enter a number: ");
        System.out.println("To exit the program press any letter on the key board.");
        boolean hasInt = sc4.hasNextInt();

        if (hasInt) {

            int usersNumber = sc4.nextInt();//first check if the users input is a ligit number, then parse the String into an int.

            if(flag2) {
                flag2 = false;
                min2 = usersNumber;
                max2 = usersNumber;
            }
            if(usersNumber < min2) {
                min2 = usersNumber;
            }
            if(usersNumber > max2) {
                max2 = usersNumber;
            }

        }else {
            System.out.println("Exiting program...");
            break;
        }
        sc4.nextLine();
    }

    sc4.close();//remember to add a break statement to reach this part of the code.
        System.out.println("Your min number is : " + min2);
        System.out.println("Your max number is : " + max2);












        //end of the main method.

    }

}

