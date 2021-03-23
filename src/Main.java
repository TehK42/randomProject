import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

    do {
        System.out.println("Choose which program to run");
        System.out.println(" ");
        System.out.println("[1]. Counter");
        System.out.println("[2]. Pretty Good");
        System.out.println("[3]. Asterisk Pyramid");
        System.out.println("(Please input a number)");
        //Input any number
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                fiftyCounter();
                break;
            case 2:
                prettyGood();
                break;
            case 3:
                asteriskPyramid();
                break;
        }
        System.out.println();
        //Exit menu if choice is equal to 0
        if (choice == 0) {
            break;//exit loop
        }
    }while (true);

    }
    
    public static void fiftyCounter(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please input a number");
        int r = s.nextInt();
        //Run this code if number is less than 100
        if(r <= 50){
            System.out.println("The number is less than 100");
            do{
                System.out.println(r);
                r++;
            }while (r < 51);
        }
        //Run this code if number is greater than 100
        else {
            System.out.println("The number is greater than 100");
            do{
                System.out.println(r);
                r--;
            }while (r > 49);
        }
    }

    public static void prettyGood(){
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        //For loop method that prints out "You're pretty good" equal to 'rows' var
        for(int i = 0; i < r; i++){
            System.out.println("You're pretty good");
        }
    }

    public static void asteriskPyramid(){
        Scanner i = new Scanner(System.in);
        int r = i.nextInt();
        //Asterisk pyramid equal to number input
        int k = 0;
        for(int l = 1; l <= r; l++, k = 0){
            for(int s = 1; s <= r - l; s++){
                System.out.print(" ");
            }
            while(k != 2 * l - 1){
                System.out.print("*");
                k++;
            }
            System.out.println();

        }




    }
}
