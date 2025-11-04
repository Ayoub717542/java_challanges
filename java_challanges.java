import java.util.Scanner;
import java.lang.Math;
//1. Bonjour Toi
/*public class Name{
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = input.nextLine();
        System.out.println("Username is: " + userName);

    }
}*/
//2. Compte à Rebours

/*public class compt_rebours {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter NUM");
        int num = Integer.parseInt(input.nextLine());
        for(int a = num-1 ; a > 0 ; a--){
            System.out.println(a);
        }
    }
}*/

//3. Jeu du Nombre Mystère
/*
public class jeu_du_nomber{
    public static void main(String[] args){
        int number = 0;
        double rand = (int)(Math.random()*10)+1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the guessed number (1-10):");
            while( number != rand ){
                number = input.nextInt();
                input = new Scanner(System.in);
                if(number < rand){
                    System.out.println(number + " is less than or equal to " );
                } else if (number > rand) {
                    System.out.println(number + " is greater than or equal to " );
                }else{
                System.out.println(" great you found it !!!");
                    input.close();
            }
        }

    }
    }*/
//4. Mini Distributeur (ATM)
public class ATM {

    static float balance = 0;
    static float deposit = 0;
    static float withdraw = 0;

    static void deposit_money() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount to be deposit:");
        float depositAmount = input.nextFloat();
        balance = deposit + depositAmount;
        System.out.println(balance);
        System.out.println("Deposit successful. Current balance: " + balance);
    }

    static void withdraw(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount to be withdrawn:");
        float withdrawAmount = input.nextFloat();
        if (withdraw <= balance) {
            balance = balance - withdrawAmount;
            System.out.println("successfully withdrawon. Current balance: " + balance);
        } else {
            System.out.println("no money in the account");
        }
    }

    static void affichage() {
        System.out.println(balance);
    }

    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int choice = 0;

    do {
        System.out.println("\n---- ATM Menu ----");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Quit");
        System.out.print("Enter your choice: ");

        choice = input.nextInt();

        switch(choice){
            case 1:affichage();
            break;
            case 2:deposit_money();
            break;
            case 3:withdraw();
            break;
            case 4:System.out.println("Thank you! Goodbye.");
            break;
            default:System.out.println("Invalid choice.");

        }}while (choice != 0);
    }
    }




